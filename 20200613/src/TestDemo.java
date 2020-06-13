/**
 * @program: 20200613
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-13 17:36
 **/

class OuterClass {
    public int data1 = 1;
    public static int data2 = 2;
    private int data3 = 3;

    class InnerClass {
        public int data4 = 4;
        public int data1 = 11;

        //实例内部类
        public void func() {
            System.out.println(data1);//11
            System.out.println(data2);//2
            System.out.println(data3);//3
            System.out.println(data4);//4
            System.out.println(OuterClass.this.data1);//1
        }
    }
}

class Test{
    public void func() {
        System.out.println(new OuterClass().data1);//1
        System.out.println(OuterClass.data2);//2
        System.out.println(new OuterClass().new InnerClass().data1);//11
    }
}

public class TestDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();

        Test test = new Test();
        test.func();
    }
}
