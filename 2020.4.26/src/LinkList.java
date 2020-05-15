/**
 * @program: 2020.4.26
 * @description: 双向链表
 * @author: zhuzeyu
 * @create: 2020-04-26 18:48
 **/

class Node{
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
        this.data = data;
    }
}

public class LinkList {
    public Node head;
    public Node tail;

    //打印双向链表
    public void disPlay(){
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        node.prev = this.tail;
        this.tail =node;
    }

    //查找是否包含关键字key
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //单链表长度
    public int size() {
        Node cur = this.head;
        int size = 0;
        while (cur != null){
            size++;
            cur = cur.next;
        }
        return size;
    }

    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }

    private Node searchIndex(int index){
        Node cur = this.head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data){
        Node node = new Node(data);
        checkIndex(index);
        if(index == 0){
            addFirst(data);
        } else if(index == size()){
            addLast(data);
        } else {
            Node cur = searchIndex(index);
            node.next = cur;
            node.prev = cur.prev;
            cur.prev.next = node;
            cur.prev = node;
        }
    }

    //删除第一次出现的key
    public int remove(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head != null){
                        this.head.prev = null;
                    }
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }

    //删除第一次出现的key
    public void removeAll(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head != null){
                        this.head.prev = null;
                    }
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    //清空链表
    public void clear(){
        Node cur = this.head;
        while(this.head != null){
            cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.tail = null;
    }

}
