/**
 * @program: 20200522
 * @description:
 * 封装：用private来修饰属性 或者 方法
 * 为什么要封装:
 * 没有特殊的要求，属性都设置为私有的
 *
 * this：  代表当前对象的引用
 * 要习惯使用this
 * @author: zhuzeyu
 * @create: 2020-05-25 21:04
 **/
class Student{
    //限定你只能在类当中进行访问
    private String name;
    private int age;
    //Alt + insert
    public String getName() {
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
/*//提供一个公开的接口
    public  String getMyname(){
        return this.Myname;
    }
    public void setMyname(String Myname){
        this.Myname = Myname;

    }*/

    private void func1(){
        System.out.println("func1");
    }

    public void show()
    {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }


     //重新实现了一下 object类的toString（）方法
    //Object 是 所有类的方法  Alt + insert  ->toString()
    @Override//注解：这个注解指的是 这个方法是重新写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现者写的代码
//以下是类的调用者
public class TestDemo3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("gaobo");
        String str = student.getName();
        System.out.println(str);
        //student.show();
        System.out.println(student);
    }
}
