package com.demo1;

/**
 * @program: 2020.5.2
 * @description: 接口实现多继承
 * @author: zzy
 * @create: 2020-05-03 22:15
 **/

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying {
    void fly();
}

interface IRunning {
    void run();
}

interface ISwiming {
    void swim();
}

// 1. 一个类可以继承一个普通类/一个抽象类，并且可以同时实现多个接口
//         extends     implements
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwiming {
    public Fish (String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}

class Frog extends Animal implements IRunning,ISwiming {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}

class Robot implements IRunning {
    @Override
    public void run() {
        System.out.println("我是机器人，我在用腿跑");
    }
}

public class TestMoreExtends {

    public static void walk(IRunning running) {
        System.out.println("我带着伙伴去散步");
        running.run();

    }

    public static void swim(ISwiming iSwiming) {
        iSwiming.swim();
    }

    public static void main(String[] args) {
        IRunning iRunning1 = new Robot();
        walk(iRunning1);

        IRunning iRunning2 = new Frog("青青");
        walk(iRunning2);

        ISwiming iSwiming = new Frog("青青");
        swim(iSwiming);

    }

    public static void main1(String[] args) {
        IRunning iRunning = new Robot();
        iRunning.run();
    }


}
