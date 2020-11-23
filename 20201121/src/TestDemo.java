import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        MyArraylist myArraylist1 = new MyArraylist();
        for (int i = 0; i < 10; i++) {
            myArraylist1.add(i,i);
        }
        myArraylist1.display();
        myArraylist1.add(10,112);
        myArraylist1.display();
        System.out.println(myArraylist1.getPos(6));
       /* System.out.println("===============");
        System.out.println(myArraylist 1.contains(5));
        System.out.println(myArraylist1.search(5));*/
        System.out.println(myArraylist1.size());


    }
}
