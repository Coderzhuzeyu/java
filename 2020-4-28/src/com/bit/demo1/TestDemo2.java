package com.bit.demo1;

/**
 * @program: 2020.4.28
 * @description:
 * @author: spdz
 * @create: 2020-04-28 09:48
 **/

class Base {
    public int a;
}

class Derive extends Base {
    public int b;
}

public class TestDemo2 {

    // 默认权限--》包访问权限    Test类 在  demo1包  的  TestDemo3.java 类中
    // 同一个包中即可进行访问
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.a);
    }

    public static void main1(String[] args) {
        Derive derive = new Derive();
        derive.a = 1;
        derive.b = 1;
        System.out.println(derive.a+derive.b);
    }
}

