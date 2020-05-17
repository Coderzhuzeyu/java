package com.demo1;

/**
 * @program: 2020.5.1
 * @description: 抽象类
 * 1.抽象方法：一个方法如果被 abstract 修饰，这个方法是抽象方法
 *          抽象方法可以没有具体的实现
 * 2.包含抽象方法的类  是抽象类（也要用 abstract 修饰）
 *      注意：
 *      1.抽象类不可以被实例化  （不能 Shape shape = new Shape();）
 *      2.类内的数据成员和普通类没有区别，只是多了抽象方法
 *      3.抽象类主要被用来继承
 *      4.如果一个类继承了这个抽象类，那么这个类必须重写这个抽象类的抽象方法
 *              （除非这个类本身也是抽象方法）
 *      5.当 抽象类A 继承 抽象B 那么 A 可以不重写 B 的方法，
 *              但 A 要是再被 类C 继承，那么 类C 一定要重写这个抽象方法
 *      6.抽象类或抽象方法 一定是不能被 final 修饰的
 * @author: spdz
 * @create: 2020-05-03 22:03
 **/

//抽象类
abstract class Shape {
    public int age;//类内的数据成员和普通类没有区别，只是多了抽象方法

    public abstract void draw();//抽象方法
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}

//class Cycle2 extends Shape {
//
//}// error   如果一个类继承了这个抽象类，那么这个类必须重写这个抽象类的抽象方法

abstract class Cycle3 extends Shape {

}// 当 抽象类A 继承 抽象B 那么 A 可以不重写 B 的方法

class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形◇");
    }
}

class Tringle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个三角形△");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画一朵花❀");
    }
}

public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {

        Shape shape1 = new Cycle();
        drawMap(shape1);
        Shape shape2 = new React();
        drawMap(shape2);
        Shape shape3 = new Tringle();
        drawMap(shape3);
        Shape shape4 = new Flower();
        drawMap(shape4);
    }

}
