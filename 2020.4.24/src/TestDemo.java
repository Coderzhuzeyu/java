/**
 * @program: 2020.4.24
 * @description:
 * @author: zhuzeyu
 * @create: 2020-04-24 19:20
 **/
public class TestDemo {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addLast(5);
        linkList.addLast(5);
        linkList.addLast(6);
        linkList.addLast(20);
        linkList.addLast(20);
        linkList.addLast(20);
        linkList.addLast(20);
        linkList.display();
        linkList.display2(linkList.deleteDuplication());

    }

    public static void main1(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addLast(5);
        linkList.addLast(20);
        linkList.addLast(9);
        linkList.addLast(15);
        linkList.addLast(4);
        linkList.addLast(12);
        linkList.addLast(10);
        linkList.display();
        linkList.partition(12);
        linkList.display();
    }
}
