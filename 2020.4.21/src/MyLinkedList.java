/**
 * @program: 2020.4.21
 * @description: 单链表
 * @author: spdz
 * @create: 2020-04-21 09:58
 **/

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    private Node head;//保存单链表的头节点

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

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
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

    //查找是否包含关键字
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
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
//        for (int i = 0; i < index-1; i++) {
//            cur = cur.next;
//        }
        return cur;
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

//        Node node = new Node(data);
//        Node cur = this.head;
//        while (index-1 != 0) {
//            cur = cur.next;
//            index--;
//        }
//        node.next = cur.next;
//        cur.next = node;

        Node node = new Node(data);
        Node cur = this.searchIndex(index);

        node.next = cur.next;
        cur.next = node;

    }
}
