package com.bit.demo2;

/**
 * @program: 2020.4.28
 * @description: 访问修饰限定符 protected
 * 在同一包的同一类可以访问
 *   同一包的不同类可以访问
 *   不同包中的子类（只有子类）可以访问（用super）
 *
 * @author: spdz
 * @create: 2020-04-28 14:41
 **/

public class Animal {
    protected String name;//在同一包的不同类中可以访问
}
