import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class TestMain {

    public static User login() {//用User接收
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名: ");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份: 1--》 管理员，2-》 普通用户");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return new Admin(name);//用到了向上转型
        }else {
            return new NormalUser(name);//用到了向上转型
        }
    }


    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();//调用完 BookList书都有了

        //登录
        User user = login();//用user来接收 接收调用当前的login
        while (true) {
            int choice = user.menu();
            //选择是几  就可以对应哪个方法了

            user.doOperation(bookList, choice);
        }
    }
}
