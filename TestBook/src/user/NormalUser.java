package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User {//继承User 拿到name
    //提供一个构造方法
    public NormalUser(String name) {
        super(name);//调用父类User带有一个参数的构造方法。User就把name赋值了
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()

        };
    }

    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("hello " + this.name + "欢迎来到图书系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
