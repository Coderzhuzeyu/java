/**
 * @program: 20200522
 * @description: 类和对象
 * 访问修饰限定符：
 *    public:   公有的
 *    private  私有的
 *    protected  受保护的
 *    什么都不写：默认权限-》包访问权限
 * @author: zhuzeyu
 * @create: 2020-05-24 18:04
 **/
/*
    class <class_name>{  
    field;//成员属性
    method;//成员方法
    }
}
//实例化对象  <class_name> <对象名> = new <class_name>();*/
class Person{
    //字段->成员变量   定义在方法外边 类 的里面   在对象里面
    //实例成员对象：对象里面
    //实例成员没有初始化默认值是对象的0值。引用类型默认为null  简单类型默认为0
    //char -> '\u0000'  boolean -> false
    public String name = "gaobo";
    public int age = 18;
    public char ch;
    public  boolean flg;
    //静态成员对象 不初始化时和实例成员变量都为0
    //静态成员变量不属于对象  属于类（person）
    public static int size;//会有一份
    //方法->行为 实例成员方法
    public  void eat(){
        int a = 10;//局部变量
        System.out.println("eat()!");
    }
    public void sleep(){
        System.out.println("sleep()");
    }

    public static void func1() {
        System.out.println("static::func1");
        //age = 99; error   静态方法内部 不能够访问非静态的数据成员
        size = 9999;
    }
    public void show()
    {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
}
    class Test{
        public int a;
        public static int count;
}
    public class TestDemo2 {

    public static void main5(String[] args) {
            Test t1 = new  Test();
            t1.a++;//1
            Test.count++;//1
            System.out.println(t1.a);//1
            System.out.println( Test.count);//1
            System.out.println("============");
            Test t2 = new Test();
            t2.a++;//1
            Test.count++;//2  静态的 在方法区中
            System.out.println(t2.a);
            System.out.println( Test.count);

    }
    public static void main4(String[] args) {
       Person per = new Person();
        per.show();
        per.name = "李四";
        per.age = 20;
        per.show();
        /*per.eat();
        per.sleep();*/
        //Person.func1();
    }
    //如何访问静态的数据成员 类名.静态成员变量
    public static void main3(String[] args) {
       /* Person per =new Person();
        System.out.println(per.name);*/
        System.out.println(Person.size);
    }
    public static void main2(String[] args) {
        Person per = new Person();
        //如何访问对象当中的实例成员对象？
        //操作符：点号 对象的引用 . 成员变量
        System.out.println(per.name);
        System.out.println(per.age);
    }
    public static void main1(String[] args) {
        //实例化一个对象  通过关键字  new
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
}
