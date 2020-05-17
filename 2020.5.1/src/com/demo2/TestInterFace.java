package com.demo2;

/**
 * @program: 2020.5.1
 * @description: 接口
 * @author: spdz
 * @create: 2020-05-03 22:12
 **/

/**
 * 接口（interface）:
 * 1.接口 当中的 方法，都是 抽象方法
 * 2.其实可以有具体的实现方法。这个方法是被default进行修饰的
 * 3.接口当中定义的成员变量，默认是常量
 * 4.接口当中的成员变量默认是： public static final
 *      成员方法默认是：public abstract
 * 5.接口是不可以被实例化的
 * 6.接口和类之间的关系：用 implements(实现)
 * 7.接口为了解决Java单继承的问题,可以实现多个接口
 * 8.只要这个类 实现了该接口，就可以进行 向上转型
 */
interface Shape {
//    public void func1(){
//
//    }// error 不是抽象方法

    public static final int a = 10;//接口当中定义的成员变量，默认是常量
    int b = 10;//不写（public static final）也可以  接口当中的成员变量默认是： public static final

    public abstract void draw1();
    void draw();//不写（public abstract）也可以   接口当中的成员方法默认是：public abstract

//    default void func() {
//        System.out.println("hhhh");
//    }//其实可以有具体的实现方法。这个方法是被default进行修饰的

}

interface A{

}

//class Cycle extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("画一个圆");
//    }
//} error 用 implements 而不是 extends

class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }

    @Override
    public void draw1() {
        System.out.println("画一个○1");
    }
}

class React implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个◇");
    }

    @Override
    public void draw1() {
        System.out.println("画一个◇1");
    }
}

// Tringle 实现 Shape 和 A（接口解决了Java单继承的问题,可以实现多个接口）
class Tringle implements Shape,A {
    @Override
    public void draw() {
        System.out.println("画一个△");
    }

    @Override
    public void draw1() {
        System.out.println("画一个△1");
    }
}

class Flower implements Shape {
    @Override
    public void draw() {
        System.out.println("画一朵❀");
    }

    @Override
    public void draw1() {
        System.out.println("画一朵❀1");
    }
}

public class TestInterFace {

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
