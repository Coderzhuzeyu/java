/**
 * @program: 2020.6.11
 * @description:内部类:
 * 1、实例内部类
 * 2、静态内部类
 * 3、匿名内部类
 * @author:  Coderzhuzeyu
 * @create: 2020-06-11 21:15
 **/

class OuterClass {
    public int data1 = 1;
    public static int data2 = 2;

    /**
     * 实例内部类 :-->可以看成是普通的 实例数据成员
     *
     * 实例内部类 有 额外的开销 (实例内部类包含 外部类的 this)
     * 实例内部类 不可以 定义静态（但我们能做到可以，只要在编译时期确定的值）
     */
    class InnerClass {
        public int data1 = 11;
        public int data3 = 3;

        //实例内部类 不可以 定义静态（但我们能做到可以）
        //public static int a = 33;//error
        public static final int a = 33;//常量 在编译时 初始化

        public void func() {
            System.out.println(data1);//11

            //实例内部类 有 额外的开销 (实例内部类包含 外部类的 this)
            //访问外部 data1
            //OuterClass.this 代表外部对象类的引用
            //this 是一个静态的引用，因为是通过 类名调用的
            System.out.println(OuterClass.this.data1);//1

            System.out.println(data2);//2
            System.out.println(data3);//3
            System.out.println("InnerClass func");
        }
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        //拿到实例内部类的对象
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
}
