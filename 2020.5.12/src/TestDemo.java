/**
 * @program: 2020.5.12
 * @description:自定义异常
 * @author: zhuzeyu
 * @create: 2020-05-12 16:47
 **/

/**
 * 自定义异常
 *  1、一定要继承一个父类异常
 *  2、自定义异常最好继承于Exception 这样写的好处是 他必须处理这个异常（用try catch 处理）
 */
class MyException extends RuntimeException{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

public class TestDemo {

    public static void func(int x)throws MyException{
        if(x == 10) {
            throw new MyException("x == 10");
        }
    }

    public static void main(String[] args) {
        try {
            func(10);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
