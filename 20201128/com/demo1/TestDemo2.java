package com.demo1;

class Shape {
    public void draw() {

    }
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

public class TestDemo2 {

    /**
     * 什么是多态：思想
     *  1、父类引用 引用子类对象
     *  2、父类和子类有同名的覆盖方法
     *  3、通过父类引用代用这个重写的方法的时候。  多态。
     * @param shape
     */
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        drawMap(shape1);
        drawMap(shape2);
        Shape shape3 = new Triangle();
        drawMap(shape3);
    }

    public static void drawShapes1() {
        React rect = new React();
        Cycle cycle = new Cycle();
        Triangle flower = new Triangle();
        String[] shapes = {"cycle", "react", "cycle", "react", "triangle"};
        for (String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("rect")) {
                rect.draw();
            } else if (shape.equals("triangle")) {
                flower.draw();
            }
        }
    }

    public static void drawShapes() {
        int[] array = {1,2,3,46,7};
        for (int a :array) {

        }
        // 我们创建了一个 Shape 对象的数组.
        //Shape shape2 = new Cycle();
        Shape[] shapes = {new Cycle(), new React(), new Cycle(),
                new React(), new Triangle()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
