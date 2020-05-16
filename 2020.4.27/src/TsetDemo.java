/**
 * @program: 2020.4.27
 * @description:
 * @author: spdz
 * @create: 2020-04-27 08:27
 **/
public class TsetDemo {

    public static void main(String[] args) {
        Mylinklist mylinklist = new Mylinklist();
        mylinklist.addLast(1);
        mylinklist.addLast(2);
        mylinklist.addLast(3);
        mylinklist.addLast(3);
        mylinklist.addLast(2);
        mylinklist.addLast(1);
        mylinklist.display();
        System.out.println(mylinklist.isPalindrome());
    }

    public static void main1(String[] args) {
        Mylinklist mylinklist = new Mylinklist();
        mylinklist.addLast(1);
        mylinklist.addLast(2);
        mylinklist.addLast(3);
        mylinklist.addLast(4);
        mylinklist.addLast(5);
        mylinklist.addLast(6);
        mylinklist.display();

        System.out.println(mylinklist.middleNode().data);
        System.out.println();

        System.out.println(mylinklist.findKthToTail(1).data);
        System.out.println(mylinklist.findKthToTail(2).data);
        System.out.println(mylinklist.findKthToTail(6).data);
        System.out.println(mylinklist.findKthToTail(0).data);
    }
}
