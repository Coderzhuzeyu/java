import com.sun.istack.internal.localization.NullLocalizable;

/**
 * @program: 2020.4.27
 * @description: 单链表练习
 * @author: spdz
 * @create: 2020-04-27 08:27
 **/

class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }
}

public class Mylinklist {
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

    //输出链表中倒数第k个结点
    public Node findKthToTail(int k){
        if(head == null){
            return null;
        }
        if(k <= 0){
            System.out.println("k不合法");
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k-1 != 0){
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //返回链表的中间结点
    public Node middleNode(){
        if(this.head == null){
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //链表的回文结构
    public boolean isPalindrome(){
        if(this.head == null){
            return true;
        }
        //只有一个节点
        if(this.head.next == null){
            return true;
        }
        //找到单链表的中间节点
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转后半段单链表
        Node cur = slow.next;
        Node curNext;
        while (cur != null){
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //一个从头走，一个从尾走
        while (slow != this.head){
            if(this.head.data != slow.data){
                return false;
            }
            //判断偶数
            if(this.head.next == slow){
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }
}
