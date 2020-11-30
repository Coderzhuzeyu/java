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
        if (this.head == null) {//第一次插入时
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
        if (index == 0) {//头插法
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
        node.next = cur.next;
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
        Node prev = this.head;//定义prev从头开始走
        while (prev.next != null) {//如果= null就走到尾了，说明没有找到前驱
            if (prev.next.data == key) {//说明找到前驱了
                return prev;
            } else {//如果没有找到前驱
                prev = prev.next;//往后去找
            }
        }
        return null;//循环走完没找到前驱 返回空

    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        //删除的是不是头节点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找到删除节点的前驱
        Node prev = searchPrev(key);//调用searchPrev(key)找key的前驱
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

    //反转一个单链表
    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public void display2(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }


//链表的中间结点
//给定一个头结点为 head 的非空单链表，返回链表的中间结点。
//如果有两个中间结点，则返回第二个中间结点。
    public Node middeNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个结点
    public Node FindKthToTail(int k) {
        if (head == null) {
            return null;
        }
        if (k <= 0) {
            System.out.println("k不合法！");
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k-1 > 0) {
            if (fast.next !=null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有这个节点！");
                return null;
            }
        }//循环退出 这个时候fast走了k-1步了
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;//fast.next为 null 了 slow位置就是所求节点
    }

    // 编写代码，以给定值x为基准将链表分割成两部分，
    // 所有小于x的结点排在大于或等于x的结点之前
    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.data < x) {
                if (bs == null) {//第一次插入
                    bs = cur;
                    be = cur;
                } else {//第二次插入  尾插法
                    be.next = cur;
                    be = be.next;

                }
            } else {
                if (as == null) {//第一次插入
                    as = cur;
                    ae = cur;
                } else {//第二次插入  尾插法
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //1.判断bs是否为空   如果bs ==null  返回as
        if (bs == null) {//说明整个单链表没有比bs小的数据
            return as;
        }
        //2.如果bs不为空  需要进行拼接
        be.next = as;
        //3.如果ae不为空  需要置为空
        if (ae != null) {
            ae.next = null;
        }
        return bs;
    }
    //在一个排序的链表中，存在重复的结点，
    // 请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);//定义一个虚拟节点
        Node tmp = newHead;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;//多走一步
            }else {
                tmp.next =cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
    public boolean chkPalindrome() {
        //单链表为空  那么肯定不是回文结构
        if (this.head == null) {
            return false;
        }
        //只有头节点自己 必定是回文结构
        if (this.head.next == null){
            return true;
        }
        //1、找到单链表的中间节点
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //2、反转单链表的后半部分  slow肯定在中间位置
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;//定义一个curNext记录后面节点
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //循环退出 slow是最后节点了
        //3、开始一个从头走  一个从尾走
        while(slow != this.head) {
            if (head.data != slow.data) {
                return false;
            }
            //判断偶数的情况
            if (this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }


    //给定一个链表，判断链表中是否有环。
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
    //给定一个链表，判断链表中是否有环。
    public boolean hasCycle1() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return false;
        }
        return true;
    }

//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {//证明没有环
            return null;
        }
        slow = this.head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

