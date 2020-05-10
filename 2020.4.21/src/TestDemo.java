import java.util.Arrays;

/**
 * @program: 2020.4.21
 * @description:
 * @author: spdz
 * @create: 2020-04-20 18:55
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        for (int i = 0; i < 10; i++) {
            myLinkedList.addFirst(i);
        }
        myLinkedList.display();
        System.out.println("=============================");

        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.display();
        System.out.println("=============================");

        System.out.println(myLinkedList.contains(6));
        System.out.println(myLinkedList.size());
        System.out.println("=============================");

        myLinkedList.display();
        myLinkedList.addIndex(0,10);
        myLinkedList.display();
        myLinkedList.addIndex(1,20);
        myLinkedList.display();
        myLinkedList.addIndex(2,30);
        myLinkedList.display();
        myLinkedList.addIndex(myLinkedList.size(),40);
        myLinkedList.display();

    }


    public static void main1(String[] args) {
        int[] array = new int[11];
        System.out.println(Arrays.toString(array));

        int[] array1 = new int[]{10};
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
