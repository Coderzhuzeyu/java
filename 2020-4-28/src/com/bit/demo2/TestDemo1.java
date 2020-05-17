package com.bit.demo2;

/**
 * @program: 2020.4.28
 * @description:
 * @author: spdz
 * @create: 2020-04-28 14:43
 **/

public class TestDemo1 {
    public static void main(String[] args) {
        // protected  在同一包的不同类中可以访问
        Animal animal = new Animal();
        System.out.println(animal.name);
    }
}
