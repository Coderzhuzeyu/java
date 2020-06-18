/**
 * @program: 2020.6.18
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-18 09:02
 **/
public class TestDemo {

    //交叉两个链表
    public static void creatCut(Node headA, Node headB){
        headA.next = headB.next.next;
    }

    //两个链表的第一个公共结点
    public static Node getIntersectionNode(Node headA, Node headB) {
        //1、求长度，走差值步
        Node pl = headA;
        Node ps = headB;

        int lenA = 0;
        while (pl != null){
            lenA++;
            pl = pl.next;
        }
        int lenB = 0;
        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA-lenB;
        if (len < 0){
            pl = headB;
            ps = headA;
            len = lenB -lenA;
        }
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        while (pl != ps) {
            pl = pl.next;
            ps = ps.next;
        }
        if(pl != null){
            return pl;
        }
        return null;
    }


    //合并两个有序链表，合并后仍有序
    public static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null){
            if(headA.data < headB.data){
                tmp.next = headA;
                tmp =tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if (headA == null){
            tmp.next = headB;
        }
        if (headB == null){
            tmp.next = headA;
        }
        return newHead.next;
    }


    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addLast(5);
        linkList.addLast(8);
        linkList.addLast(9);
        linkList.addLast(15);
        linkList.addLast(24);
        linkList.addLast(24);
        linkList.addLast(24);
        linkList.display();

        LinkList linkList2 = new LinkList();
        linkList2.addLast(6);
        linkList2.addLast(7);
        linkList2.addLast(20);
        linkList2.addLast(20);
        linkList2.addLast(24);
        linkList2.addLast(25);
        linkList2.addLast(25);
        linkList2.display();

        Node ret1 = mergeTwoLists(linkList.head,linkList2.head);
        linkList.display2(ret1);

        /*creatCut(linkList.head,linkList2.head);
        Node ret = getIntersectionNode(linkList.head, linkList2.head);
        System.out.println(ret.data);*/



    }
}
