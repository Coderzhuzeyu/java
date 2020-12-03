package com.demo1;
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + "正在吃！Animal");
    }
}

class Cat extends  Animal {
    public String huzi;

    public Cat(String name,String huzi) {
        super(name);
        this.huzi = huzi;
    }

    public void eat() {
        System.out.println(this.name + "正在吃！Cat");
    }

    public void func() {
        System.out.println(this.name);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        //父类引用  引用子类对象  向上转型
        Animal animal = new Cat("初一","胡子");
        animal.eat();
        //animal.huzi;
        /*Cat cat = new Cat();
        cat.eat();*/
    }
}
