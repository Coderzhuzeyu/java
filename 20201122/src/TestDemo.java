public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(81);
        myLinkedList.addLast(81);
        myLinkedList.addLast(81);
        myLinkedList.addLast(80);
        myLinkedList.addLast(81);
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
        System.out.println("删除开始：");
       /*myLinkedList.remove(77);
        myLinkedList.display();
        myLinkedList.remove(79);
        myLinkedList.display();
        myLinkedList.remove(81);
        myLinkedList.display();*/
        myLinkedList.removeAllKey(81);
        myLinkedList.display();
    }
}
