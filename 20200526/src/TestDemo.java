/**
 * @program: 20200526
 * @description:
 * 构造方法没有返回值 且 可以发生重载
 * 一个对象的产生，分为几步，如何产生？
 * 1.为对象分配内存
 * 2.调用合适的构造方法  （构造方法不止一个）
 *
 *
 * 1.当没有提供构造方法的时候，那么编译器就会自动提供一个不带有参数的构造方法
 * 2.当你提供了构造方法，编译器就不会自己生成一个构造方法了
 *
 *this:this关键字代表对象这句话对吗？
 *    如果要产生对象，必须把这个构造方法调用完，但是this在对对象分配内存以后就可以产生
 *  this，即为对象的引用。
 *
 *习惯使用this
 *  this:
 *    this():调用自己的构造方法（注意：1只能在构造方法里面写  2只能调用一个(因为只能写在第一行))
 *    this.data:调用当前对象的属性 this.age   this.name等
 *    this.func()调用当前对象那个的方法  this.getName()等
 *
 * @author: zhuzeyu
 * @create: 2020-05-26 17:21
 **/

    class Person{
        private String name;
        private int age;
        public Person(){
            this("caocao",18);//调用下面这个构造方法
            //this("zhangfei");this只能调用一个构造方法(只能写在第一行)
            System.out.println("Person<init>");
        }

    public Person(String name) {
        this.name = name;
    }

    //自动生成方法 Alt+insert
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Person<String,int>");


        }
        public void eat(){
            System.out.println(this.getName());
            System.out.println(this.age);
        }

        public  String getName(){
                return name;
            }


        public void setName(String name) {
        this.name = name;
    }

        public int getAge() {
        return age;
    }

        public void setAge(int age) {
        this.age = age;
    }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
     }
    }


    public class TestDemo {
        public static void main(String[] args) {

        }
        public static void main1(String[] args) {
            Person person1 = new Person();
            /*System.out.println(person1);
            Person person2 = new Person("bit",19);
            System.out.println(person2);*/

            //person2.setName("gaobo");

    }



}
