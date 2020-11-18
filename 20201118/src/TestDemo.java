class Person{
public int age;
public String name;//成员属性  实例变量
public String sex;
public void eat() {//成员方法
    System.out.println("吃饭！");
  }
public void sleep(){
    System.out.println("睡觉");
  }
}
public class TestDemo {
    public static void main(String[] args) {
        Person per = new Person();//通过new实例化对象
        per.eat();//成员方法需要通过对象的引用调用
        per.sleep();
        //产生对象  实例化对象
        Person per1 = new Person();
        Person per2 = new Person();
    }
}
