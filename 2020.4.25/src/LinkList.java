/**
 * @program: 2020.4.25
 * @description:单链表5
 * @author: spdz
 * @create: 2020-04-25 09:03
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

    //判断单链表是否有环
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow =this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //有环链表的入口位置
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                slow = this.head;
                while (slow != fast){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    //打印单链表
    public void display2(Node ret){
        Node cur = ret;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
