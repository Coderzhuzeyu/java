/**
 * @program: 2020.4.22
 * @description: 不带头节点的单项非循环链表
 * @author: spdz
 * @create: 2020-04-22 09:07
 **/

class Node {
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkList {

    private Node head;

    //打印
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.getData() + " ");
            cur = cur.getNext();
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data) {

        Node node = new Node(data);
        //第一次插入节点
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.setNext(this.head);
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null) {
            this.head = node;
            return;
        }
        while (cur.getNext() != null) {
            cur = cur.getNext();
        }
        cur.setNext(node);
    }

    //单链表的长度
    public int size() {
        Node cur = this.head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.getNext();
        }
        return size;
    }

    // pos 位置的前一个地址
    private Node searchPos(int pos) {
        Node cur = this.head;
        while (pos-1 != 0) {
            cur = cur.getNext();
            pos--;
        }
        return cur;
    }

    // pos 位置插入，第一个数据节点下标为0
    public void addPos(int pos,int data) {
        Node node = new Node(data);
        if (pos < 0 || pos > size()) {
            throw new NegativeArraySizeException("pos位置不合法！");
        }
        if(pos == 0) {
            addFirst(data);
            return;
        }
        if(pos == size()) {
            addLast(data);
            return;
        }

        node.setNext(searchPos(pos).getNext());
        searchPos(pos).setNext(node);
    }

    //查找关键字 key 是否存在
    public boolean search(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.getData() == key) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    //查找关键字 key 第一次出现的节点 第一个数据节点下标为0
    public int searchKey(int key) {
        Node cur = this.head;
        int pos = 0;
        while (cur != null) {
            if (cur.getData() == key) {
                return pos;
            }
            pos++;
            cur = cur.getNext();
        }
        return -1;
    }

    //删除第一次出现 key 的节点
    public void removeFirstKey(int key) {
        if(searchKey(key) == -1) {
            System.out.println("没有要删除的数");
            return;
        }
        if(searchKey(key) == 0) {
            this.head = this.head.getNext();
            return;
        }
        if(searchKey(key) == (size()-1)) {
            searchPos((size()-1)).setNext(null);
            return;
        }
        searchPos(searchKey(key)).setNext((searchPos(searchKey(key)).getNext()).getNext());
    }

    //删除所有值为 key 的节点
    public void removeAllKey(int key) {
        if (searchKey(key) == -1) {
            System.out.println("没有要删除的数");
            return;
        }
        while(searchKey(key) != -1) {
            removeFirstKey(key);
        }
    }

    //清空列表
    public void clear() {
        this.head = null;
    }
}
