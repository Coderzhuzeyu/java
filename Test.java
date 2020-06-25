import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *     单链表：
 * User: Coderzhuzeyu
 * Date: 2020-06-25
 * Time: 18:36
 */

public class TestDemo {

    public static void createCut(Node headA, Node headB) {
        headA.next = headB.next.next;
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        //1、求长度，走差值步
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        while (pl != null) {
            lenA++;
            pl = pl.next;
        }
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB-lenA;
        }
        //一定是pl指向的是 最长的单链表
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        //2、ps  和 pl  一定是在同一个起跑线上
        while (ps != pl && pl != null && ps != null) {
            ps = ps.next;
            pl = pl.next;
        }
        if(pl == ps && pl != null) {
            return pl;
        }
        return null;
    }

    public static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(21);
        myLinkedList.addLast(34);
        myLinkedList.addLast(45);
        myLinkedList.addLast(57);
        myLinkedList.addLast(68);
        myLinkedList.display();//

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(10);
        myLinkedList2.addLast(23);
        myLinkedList2.addLast(33);
        myLinkedList2.addLast(42);
        myLinkedList2.addLast(55);
        myLinkedList2.addLast(60);
        myLinkedList2.display();//

        Node ret =  mergeTwoLists(myLinkedList.head,myLinkedList2.head);
        myLinkedList2.display2(ret);//


        /*createCut(myLinkedList.head,myLinkedList2.head);
        Node ret = getIntersectionNode(myLinkedList.head,myLinkedList2.head);
        System.out.println(ret.data);*/


        /*Node ret = myLinkedList.partition(17);
        myLinkedList.display2(ret);*/
        //System.out.println(myLinkedList.findKthToTail(6).data);

        /*Node ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/

        /*System.out.println("删除开始:");
        myLinkedList.removeAllKey(81);
        myLinkedList.display();//*/
        /*boolean flg =  myLinkedList.contains(78);
        System.out.println(flg);*/
        /*System.out.println(myLinkedList.contains(78));
        System.out.println(myLinkedList.size());*/
    }
}
