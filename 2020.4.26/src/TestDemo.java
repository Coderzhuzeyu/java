/**
 * @program: 2020.4.26
 * @description:
 * @author: zhuzeyu
 * @create: 2020-04-26 18:48
 **/
public class TestDemo {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addFirst(4);
        linkList.addFirst(3);
        linkList.addFirst(2);
        linkList.addFirst(1);
        linkList.addLast(4);
        linkList.addLast(3);
        linkList.addLast(2);
        linkList.addLast(1);
        linkList.disPlay();
        System.out.println(linkList.size());
        linkList.addIndex(4,5);
        linkList.addIndex(5,5);
        linkList.addIndex(0,0);
        linkList.addIndex(linkList.size(),0);
        linkList.disPlay();
        linkList.remove(0);
        linkList.remove(0);
        System.out.println(linkList.remove(5));
        linkList.disPlay();
        linkList.removeAll(1);
        linkList.removeAll(4);
        linkList.disPlay();
        linkList.clear();
        linkList.disPlay();

    }
}
