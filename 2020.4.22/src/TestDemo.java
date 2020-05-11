/**
 * @program: 2020.4.22
 * @description:
 * @author: spdz
 * @create: 2020-04-22 09:04
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addFirst(1);
        myLinkList.addFirst(2);
        myLinkList.addFirst(3);
        myLinkList.addFirst(4);
        myLinkList.display();
        System.out.println("==============================");

        myLinkList.addLast(2);
        myLinkList.addLast(3);
        myLinkList.addLast(4);
        myLinkList.display();
        System.out.println("==============================");

        System.out.println(myLinkList.size());
        myLinkList.display();
        System.out.println("==============================");

        myLinkList.addPos(0,50);
        myLinkList.display();
        myLinkList.addPos(myLinkList.size(),5);
        myLinkList.display();
        myLinkList.addPos(5,0);
        myLinkList.display();
        myLinkList.addPos(6,1);
        myLinkList.display();
        System.out.println("==============================");

        System.out.println(myLinkList.search(50));
        System.out.println(myLinkList.search(0));
        System.out.println(myLinkList.search(5));
        System.out.println(myLinkList.search(20));
        System.out.println("==============================");

        myLinkList.display();
        System.out.println(myLinkList.searchKey(50));
        System.out.println(myLinkList.searchKey(4));
        System.out.println(myLinkList.searchKey(5));
        System.out.println(myLinkList.searchKey(10));
        System.out.println("==============================");

        myLinkList.display();
        myLinkList.removeFirstKey(20);
        myLinkList.display();
        myLinkList.removeFirstKey(4);
        myLinkList.display();
        myLinkList.removeFirstKey(5);
        myLinkList.display();
        myLinkList.removeFirstKey(50);
        myLinkList.display();
        System.out.println("==============================");

        myLinkList.display();
        myLinkList.removeAllKey(5);
        myLinkList.display();
        myLinkList.removeAllKey(3);
        myLinkList.display();
        myLinkList.removeAllKey(4);
        myLinkList.display();
        myLinkList.removeAllKey(1);
        myLinkList.display();
        myLinkList.removeAllKey(0);
        myLinkList.display();
        System.out.println("=============================");

        myLinkList.display();
        myLinkList.clear();
        myLinkList.display();
    }
}
