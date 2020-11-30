import java.lang.management.GarbageCollectorMXBean;

public class TestDemo {
   /* public  static void createCut(Node headA, Node headB) {
        headA.next =headB.next.next;//相交的链表
    }
    public static Node getIntersectionNode(Node headA, Node headB ) {
        //1.求长度，求差值步
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;//默认假设lenA长
        Node ps = headB;
        while (pl != null) {//求lenA长度
            lenA++;
            pl = pl.next;
        }
        while (ps !=null) {//求lenA长度
            lenB ++;
            ps = ps.next;
        }//此时pl ps都指向 null 了
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if (len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //此时一定是pl指向的是 最长的单链表
        for (int i = 0; i < len; i++) {
            pl = pl.next;//让pl走lenA 与 lenB的差值len

        }
        //此时 pl 和 ps一定在同一起跑线上
        while (ps != pl && pl !=null && pl !=null ) {
            ps = ps.next;
            pl = pl.next;
        }
        if (pl == ps && pl != null) {
            return pl;
        }
        return null;
    }
    //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);//new一个虚拟的链头
        Node tmp = newHead;
        while(headA != null && headB !=null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next =headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if (headA != null) {//说明headB为 null
            tmp.next = headA;
        }
        if (headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
*/
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(21);
        ;myLinkedList.addLast(34);
        myLinkedList.addLast(44);
        ;myLinkedList.addLast(56);
        myLinkedList.addLast(68);
        myLinkedList.display();
        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(10);
        myLinkedList2.addLast(23);
        myLinkedList2.addLast(33);
        myLinkedList2.addLast(42);
        myLinkedList2.addLast(55);
        myLinkedList2.addLast(60);
        myLinkedList2.display();
        Node ret = mergeTwoLists(myLinkedList.head,myLinkedList2.head);
        myLinkedList2.display2(ret);
       /* createCut(myLinkedList.head,myLinkedList2.head);
        Node ret = getIntersectionNode(myLinkedList.head,myLinkedList2.head);
        System.out.println(ret.data);*/
        /* myLinkedList.partition(17)
        myLinkedList.display();*/
        //System.out.println(myLinkedList.FindKthToTail(3).data);
       /* Node ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/
       /* myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);*/
       /* myLinkedList.display();
        myLinkedList.addIndex(3,99);
        myLinkedList.display();*/
       /* boolean flg = myLinkedList.contains(78);
        System.out.println(flg);
        System.out.println(myLinkedList.size());*/
        /* System.out.println("删除开始：");
         *//*myLinkedList.remove(77);
        myLinkedList.display();
        myLinkedList.remove(79);
        myLinkedList.display();
        myLinkedList.remove(81);
        myLinkedList.display();*//*
        myLinkedList.removeAllKey(81);
        myLinkedList.display();*/
    }
}
