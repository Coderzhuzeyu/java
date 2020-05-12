/**
 * @program: 2020.4.23
 * @description:单链表3
 * @author: spdz
 * @create: 2020-04-23 18:40
 **/
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkList1 {
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

    //删除第一次出现的值为 key 的节点
    public void removeFirstKey(int key) {
        Node prev = this.head;
        while(prev != null) {
            if (prev.next.data == key) {
                prev.next = prev.next.next;
                return;
            }
            prev = prev.next;
        }
        System.out.println("没有要删除的数");
    }

    //删除所有出现的值为 key 的节点
    public void removeAllKey(int key) {
        if(head == null) {
            System.out.println("单链表为空");
            return;
        }

        Node prev = this.head;
        Node cur = prev.next;

        while (cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //JVM在回收内存时，当该对象没有人再引用他时，这个对象才会被回收
    //清空单链表
    public void clear() {
        this.head = null;
    }

    //逆序
    public Node reverse() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    //逆序的打印
    public void display2(Node newHead) {
        Node cur = newHead;
        while (cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //找中间值
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
