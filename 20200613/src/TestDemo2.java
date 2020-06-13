/**
 * @program: 20200613
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-13 19:18
 **/

class OuterClass2 {
    public int data1 = 1;
    public static int data2 = 2;
    private int data3 = 3;

    /**
     * 静态内部类
     *
     * 静态内部类中，不能访问外部类的非静态的数据成员
     *           (静态 里没有外部对象)
     *          （静态 先被初始化，但 静态中 访问了 外部 未被初始化的 数据成员）
     * 若 静态内部类 非要访问外部类的非静态的数据成员，就让静态中有外部对象
     */
    static class InnerClass {
        public int data4 = 4;
        public int data1 = 11;

        //让静态中有外部对象
        public OuterClass2 out;
        public InnerClass(OuterClass2 out) {
            this.out = out;
        }

        public void func() {
            System.out.println(data1);//11
            System.out.println(data2);//2
//            System.out.println(data3);//error
            System.out.println(this.out.data3);//3
            System.out.println(data4);//4
//            System.out.println(OuterClass2.this.data1);//error
            System.out.println(this.out.data1);//1
        }
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass(outerClass2);
        innerClass.func();
    }
}
