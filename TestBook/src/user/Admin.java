package user;

import com.sun.org.apache.bcel.internal.generic.NEW;
import operation.*;

import java.util.Scanner;

public class Admin extends User {//Admin管理员继承User 拿到name
    //提供一个构造方法
    public Admin (String name) {
        super(name);//调用父类User带有一个参数的构造方法。User就把name赋值了
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisPlayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("hello " + this.name + ", 欢迎使用图书管理系统!");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
