package com.bit.demo1;

/**
 * @program: 2020.4.28
 * @description:默认权限
 * @author: spdz
 * @create: 2020-04-28 11:50
 **/

class Test{
    //(什么都不写)默认权限--》包访问权限--》只能在同一个包装进行访问
    // 同一个包中即可进行访问
    int a;
}

// 默认权限 在同一个包中的不同类
public class TestDemo3 {

    int b;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.a);
    }
}
