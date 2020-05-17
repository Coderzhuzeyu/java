package com.bit.demo1;

/**
 * @program: 2020.4.28
 * @description:继承 访问修饰限定符
 *  关键字 extends
 * （子类/派生类） 继承了 （父类/基类/超类）
 * （子类/派生类） 继承了 （父类/基类/超类） 除 构造方法 外所有的
 *            super()；   只是显式调用 并不是继承了父类的构造方法
 *  以达到代码重用的效果
 *  1.在Java中，一个子类使用 关键字 extends 只能继承一个父类（单继承）
 *  2.子类构造时，要先帮父类进行构造
 *     关键字 super  代表父类对象的  引用
 *        (在子类中使用)
 *        1. super();//调用父类的构造方法,和 this() 一样 必须放在第一行
 *        2. super.data;//（直接）访问父类的属性
 *        3. super.func();//访问父类的成员方法
 *     关键字  this  :
 *          this()  :调用自己的构造方法
 *                 (只能在构造方法中使用，且只能用一次，且只能在第一行用)
 *          this.data  :调用当前对象的属性 （例如 this.name）（先查找本类，如果本类没有，就调用父类）
 *          this.func()  :调用当前对象的方法
 *  关键字 final
 *  final int a = 10;//常量  只能被初始化一次，接下来就不能再修改了
 *  final 修饰类：密封性   特性：不能被继承
 *       一旦一个类被final所修饰 那么这个类必然不能被继承
 *  final 修饰方法： 密封方法
 *
 *  访问修饰限定符：
 *          private < 默认权限(default) < protected < public
 * @author: spdz
 * @create: 2020-04-28 09:13
 **/

class Animal {
    //private String name;//private 封装（私有）后可继承但无法在类外访问
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }

    public void eat() {
        System.out.println(this.name + "Animal::eat()");
    }
    public void sleep() {
        System.out.println("Animal::sleep()");
    }
    //private 封装（私有）后可继承但无法在类外访问
    private void play(){
        System.out.println("Animal::play()");
    }
}

// Cat（子类/派生类）继承了 Animal（父类/基类/超类）
//关键字 extends
class Cat extends Animal{

    //子类构造时，要先帮父类进行构造
    public Cat(String name){

        //关键字 super   super()必须放在第一行
        super(name);//显式调用 并不是继承了父类的构造方法

        super.eat();

        System.out.println(super.name + "Cat(String)");
    }

//    public String name;
//    public void eat() {
//        System.out.println(this.name + "Cat::eat()");
//    }

}

//多层继承   一般不超过三层
class ChineseGardenCat extends Cat{
    public ChineseGardenCat(String name){
        super(name);
    }
}




////final 修饰类
//final class Animal2{
//    public String name;
//}
//class Bird2 extends Animal2{
//
//}//错误  不能被继承

class Bird extends Animal {

//    // alt + insert
//    public Bird(String name) {
//        super(name);
//    }

    public Bird(String name) {
        super(name);
    }

//    // alt + enter
//    public Bird(String name){
//        super(name);
//    }

//    public String name;
//    public void eat() {
//        System.out.println("Bird::eat()");
//    }
    public void fly() {
        //private 封装（私有）后可继承但无法在类外访问
        // protected
        //this.data  :调用当前对象的属性 （例如 this.name）（先查找本类，如果本类没有，就调用父类）
        System.out.println(this.name + "Bird::fly()");
    }
}

public class TestDemo {

    public static void main(String[] args) {
        ChineseGardenCat chineseGardenCat = new ChineseGardenCat("haha");
        System.out.println(chineseGardenCat.name);
        Animal animal = new ChineseGardenCat("haha");
    }

    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        //cat.name = "mimi";
        cat.eat();
        cat.sleep();
        //cat.play();//错误  封装后可继承无法访问

        Bird bird = new Bird("八哥");
        bird.fly();
        bird.eat();
    }
}
