class Node {
    public int data;//0
    public Node next;//null
    public Node(int data) {
        this.data =data;
        this.next = null;
    }

}
public class MyLinkedList {
    public Node head;//保存单链表的头节点的引用  null
        //头插法
        public void addFirst(int data) {
        Node node = new Node(data);

        if (this.head == null) {
            //第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;
        head = node;
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
            Node node = new Node(data);//首先有一个节点
            if (this.head == null){//第一次插入时
                this.head = node;
                return;
            }
            Node cur = this.head;//定义一个cur从头开始走
            while (cur.next != null) {//cur.next = null时，cur指向最后一个节点
                cur = cur.next;
            }//退出循环cur.next为空了，即就是尾节点
            cur.next = node;
        }

        //任意位置插入,第一个数据结点为0号下标
        public void addIndex(int index, int data) {
            if(index == 0) {//头插法
                addFirst(data);
                return;
            }
            if (index == this.size()) {//尾插法
                addLast(data);
                return;

            }
            Node node = new Node(data);
            //先找到 index位置的前一个结点的地址
            Node cur = searchIndex(index);
            //进行插入
            node.next =cur.next;
            cur.next = node;

        }

        private Node searchIndex(int index) {
            if (index < 0 || index > this.size()) {
                throw new RuntimeException("index位置不合法");
            }
            Node cur = this.head;//让cur 走index-1
            while (index - 1 != 0) {
                cur = cur.next;
                index--;
            }
            return cur;
        }

        //查找是否包含关键字key是否在单链表当中
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
        private Node searchPrev(int key) {
            Node prev =this.head;//定义prev从头开始走
            while (prev.next != null) {//如果= null就走到尾了，说明没有找到前驱
                if (prev.next.data == key) {//说明找到前驱了
                    return prev;
                }else {//如果没有找到前驱
                    prev = prev.next;//往后去找
                }
            }
            return null;//循环走完没找到前驱 返回空

    }
        //删除第一次出现关键字为key的节点
        public void remove(int key) {
            if(this.head == null) {
                return;
            }
            //删除的是不是头节点
            if (this.head.data == key) {
                this.head = this.head.next;
                return;
            }
            //找到删除节点的前驱
            Node prev =searchPrev(key);//调用searchPrev(key)找key的前驱
            if (prev == null) {
                System.out.println("根本没有这个节点！");
                return;
            }
            //开始删除
            Node del = prev.next;
            prev.next = del.next;
        }
        //删除所有值为key的节点
        public void removeAllKey(int key) {
            Node prev = this.head;
            Node cur = this.head.next;//代表要删除的节点
            while (cur != null) {
                if (cur.data == key) {
                    prev.next = cur.next;
                    cur = cur.next;
                } else {
                    prev = cur;
                    cur = cur.next;
                }
            }
            if (this.head.data == key) {//删除头节点
                this.head = this.head.next;
            }
        }
        //得到单链表的长度
        public int size() {
            int count = 0;
            Node cur = this.head;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            return count;
        }
        /*//打印单链表
        public void display() {
            Node cur = this.head;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        }*/
        //释放内存的
        public void clear() {
        this.head = null;
        }
    }



