package com.demo2;

/**

 * 抽象类：
 * 1、抽象方法：一个方法如果被abstract修饰，那么这个方法就是抽象方法。抽象方法
 * 可以没有具体的实现。
 * 2、包含抽象方法的类，抽象类。
 * 注意：
 * 1、抽象类不可以被实例化。不能Shape shape = new Shape();
 * 2、类内的数据成员，和普通类没有区别。
 * 3、抽象类主要就是用来被继承的.
 * 4、如果一个类继承了这个抽象类，那么这个类必须重写抽象类当中的抽象方法。
 * 5、当抽象类A 继承 抽象类B 那么A可以不重写B中的方法，但是一旦A要是再被继承，
 * 那么一定还要重写这个抽象方法。
 * 6、抽象类或者抽象方法 一定是不能被final修饰的。

 */
 abstract class Shape {
    /*public int age;
    private int a;
    public void func() {
    }*/
    public  abstract void draw();
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}

class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个△");
    }
}

class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}

public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        drawMap(shape1);
        drawMap(shape2);
    }
}
