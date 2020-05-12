/**
 * @program: 2020.4.23
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-04-23 18:37
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkList1 myLinkList1 = new MyLinkList1();
        myLinkList1.addLast(10);
        myLinkList1.addLast(20);
        myLinkList1.addLast(30);
        myLinkList1.addLast(15);
        myLinkList1.addLast(20);
        myLinkList1.addLast(10);
        myLinkList1.addLast(15);
        myLinkList1.addLast(15);
        myLinkList1.display();
        myLinkList1.display2(myLinkList1.reverse());
    }

    public static void main3(String[] args) {
        MyLinkList1 myLinkList1 = new MyLinkList1();
        myLinkList1.addLast(10);
        myLinkList1.addLast(20);
        myLinkList1.addLast(30);
        myLinkList1.addLast(15);
        myLinkList1.addLast(20);
        myLinkList1.addLast(10);
        myLinkList1.addLast(15);
        myLinkList1.addLast(15);
        myLinkList1.display();
        myLinkList1.clear();
        System.out.println("hhhhhh");
    }

    public static void main2(String[] args) {
        MyLinkList1 myLinkList1 = new MyLinkList1();

        myLinkList1.addLast(10);
        myLinkList1.addLast(20);
        myLinkList1.addLast(30);
        myLinkList1.addLast(15);
        myLinkList1.addLast(20);
        myLinkList1.addLast(10);
        myLinkList1.addLast(15);
        myLinkList1.addLast(15);
        myLinkList1.display();
        myLinkList1.removeFirstKey(15);
        myLinkList1.display();
        myLinkList1.removeAllKey(20);
        myLinkList1.display();
        myLinkList1.removeAllKey(30);
        myLinkList1.display();
        myLinkList1.clear();
        myLinkList1.removeAllKey(15);
        myLinkList1.display();


    }

    public static void main1(String[] args) {
        MyLinkList1 myLinkList1 = new MyLinkList1();
        for (int i = 0; i < 9; i++) {
            myLinkList1.addIndex(i,i);
        }
        myLinkList1.display();

    }
}
