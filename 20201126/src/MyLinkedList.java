class Node {
    public int data;//数据
    public Node next;//后继信息   引用类型不用初始化 null
    public Node prev;//前驱信息
    //提供构造方法
    public Node(int data) {
        this.data = data;
    }
}
    public class MyLinkedList {
        public Node head;//标志双向链表的头
        public Node tail;//标志当前双向链表的尾

        //头插法
        public void addFirst(int data) {
            Node node = new Node(data);//new一个节点
            if (this.head == null) {//第一次插入
                this.head = node;
                this.tail = node;
            }else {
                node.next = this.head;
                this.head.prev = node;
                this.head = node;
            }
        }

        //尾插法
        public void addLast(int data) {
            Node node = new Node(data);
            if (this.head == null) {//第一次插入
                this.head = node;
                this.tail = node;
            }else {
                this.tail.next = node;
                node.prev = this.tail;
                this.tail = node;
            }
        }
        public void display() {
            Node cur = this.head;
            while (cur != null) {
                System.out.print(cur.data+" ");
                cur = cur.next;
            }
            System.out.println();
        }
        private void checkIndex(int index) {
            if (index < 0 || index > size()) {
                throw new RuntimeException("index不合法");
            }
        }
        private Node searchIndex(int index) {//找index的位置
            Node cur = this.head;
            while (index != 0) {
                cur = cur.next;
                index--;
            }
            return cur;
        }
        //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index,int data) {
            checkIndex(index);
            if (index == 0) {//相当于头插法
                addFirst(data);
                return;
            }
            if (index == size()) {
                addLast(data);
                return;
            }
            Node cur = searchIndex(index);
             Node node = new Node(data);
             node.next = cur;
             node.prev = cur.prev;
             cur.prev.next = node;
             cur.prev = node;
        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key) {
            Node cur = this.head;
            while (cur !=null) {
                if (cur.data == key) {
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }
        //删除第一次出现关键字为key的节点
        public int remove(int key) {
            Node cur = this.head;
            while (cur != null) {
                if (cur.data == key) {
                    int oldData = cur.data;//用oldData记录数据
                    if (cur == this.head) {//删除头节点
                        this.head = this.head.next;
                        head.prev = null;
                    }else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                        if (cur.next != null) {
                            cur.next.prev = cur.prev;
                        }else {//删除尾巴节点时 只需要移动tail
                            this.tail = cur.prev;
                        }

                    }
                    return oldData;
                }
                cur = cur.next;
            }
                    return -1;
        }
        //删除所有值为key的节点
        public void removeAllKey(int key) {
            Node cur = this.head;
            while (cur != null) {
                if (cur.data == key) {
                    int oldData = cur.data;//用oldData记录数据
                    if (cur == this.head) {//删除头节点
                        this.head = this.head.next;
                        if (this.head != null) {
                            this.head.prev =cur.prev;
                        }
                    }else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                        if (cur.next != null) {
                            cur.next.prev = cur.prev;
                        }else {//删除尾巴节点时 只需要移动tail
                            this.tail = cur.prev;
                        }

                    }
                }
                cur = cur.next;
            }
        }
        //得到双链表的长度
        public int size() {
            int count = 0;//计数器
            Node cur = this.head;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            return count;
        }
        // 释放双链表
        public void clear() {
           while (this.head != null) {
               Node cur = this.head.next;//用cur记录head的后继
               this.head.prev = null;
               this.head.next = null;
               this.head = cur;
           }
            this.tail = null;

        }
    }


