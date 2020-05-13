/**
 * @program: 2020.4.24
 * @description:单链表4
 * @author: zhuzeyu
 * @create: 2020-04-24 19:21
 **/

class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }
}

public class LinkList {
    public Node head;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);

        //第一次插入节点
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }

    //先找到  index 位置的前一个节点的地址
    private Node searchIndex(int index){
        if(index < 0 || index > this.size()) {
            throw new NegativeArraySizeException("index不合法！");
        }
        Node cur = this.head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int size = 0;
        while(cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {

        if(index == 0) {
            this.addFirst(data);
            return;
        }
        if (index == this.size()) {
            this.addLast(data);
            return;
        }
        Node node = new Node(data);
        Node cur = this.searchIndex(index);

        node.next = cur.next;
        cur.next = node;

    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //以 x 为 分界线，小于x的放左边，大于放右边，且单链表顺序不变
    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if(cur.data < x) {
                //第一次插入
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                //第一次插入
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //1.判断bs是否为空  如果bs == null 返回as
        if(bs == null) {
            return as;
        }
        //2、如果bs不为空  需要进行拼接
        be.next = as;
        //3、如果a不为空    ae的next需要置为空
        if(as != null){
            ae.next = null;
        }
        return bs;
    }

    //删除排序的链表中出现多次的节点
    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (cur != null) {
            if((cur.next != null) && (cur.data == cur.next.data)){
                while ((cur.next != null) && (cur.data == cur.next.data)){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

    //打印deleteDuplication()
    public void display2(Node newHead){
        Node cur = newHead;
        while(cur != null) {
            System.out.print(newHead.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}
