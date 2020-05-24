import java.util.Scanner;

/**
 * @program: 2020.5.12
 * @description:自定义异常做用户登录
 * @author: zhuzeyu
 * @create: 2020-05-12 17:07
 **/

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}

public class TestDemo2 {

    private static String userName = "spdz";
    private static String passWord = "123456";

    public static void login(String userName,String passWord) throws UserException,
            PasswordError{
        if (!TestDemo2.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }
        if (!TestDemo2.passWord.equals(passWord)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String passWord = scanner.nextLine();
        try {
            login(userName,passWord);
        }catch (UserException e){
            e.printStackTrace();
        }catch (PasswordError e) {
            e.printStackTrace();
        }

    }
}
