/*
* 封装：用Private来修饰属性 或者 方法
* */
class Student {
    //限定你只能在类当中进行访问
    private String name;
    private   int age;
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
    public String getMyname(){
       return Myname;
    }

    public void setMyname(String name){
        Myname = name;
    }*/

    private void func1(){
        System.out.println("func1");
    }
   public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
    //Alt+insert 0->toString 重新实现了一下 Object类的方法
    //Object  是所有类的父类
    //@Override  是注解  指的是这个方法是重新写的
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现者写的代码
//以下是类的调用者
public class TestDemo2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zhangsan");
        String str = student.getName();
        System.out.println(str);
        //student.show();
        System.out.println(student);
    }
}
