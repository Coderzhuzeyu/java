/**
 * @program: 2020.5.12
 * @description:异常
 * @author: zzy
 * @create: 2020-05-12 08:46
 **/

import java.util.Scanner;
/**
 * Throwable 是所有异常和错误的父类
 *    Throwable 已知直接子类：
 *          Error(错误) 由程序员自己解决
 *          Exception(异常)是所有异常的父类 可以由程序自己解决：
 *              RuntimeException运行时异常（也叫非受查异常）：在程序运行时抛出的异常
 *              编译时异常（也叫受查异常）：在程序编译时的异常
 */

class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class TestDemo {

    public static void main(String[] args) {
        Person person = new Person();
        try {
            Person person2 = (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    //throws 声明可能出现的异常
    public static int divide(int x,int y) throws ArithmeticException{
        if(y == 0){
            throw new ArithmeticException("y == 0");
        }
        return x/y;
    }

    /**
     * 抛出异常: throw  一般抛出某个你想抛出的异常（还可以抛出自定义异常）
     * @param args
     */

    public static void main7(String[] args) {
        try {
            int ret = divide(20,0);
            System.out.println(ret);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("hhhh");
        }
        System.out.println("继续执行");
    }

    public static void main6(String[] args) {
        int x = 0;
        if (x == 0){
            throw new UnsupportedOperationException("x == 0");//不支持操作异常
        }
    }

    /**
     * 防御式编程
     *      LBYL（不适用异常）：在操作前做充分的检查
     *      EAFP （使用异常）：遇到问题再处理
     */


    /**
     * EAFP：
     * java 中处理异常的语法：
     * try {
     *     //可能出现异常的代码
     * }catch(参数：异常的类型  e) {
     *     捕获try中可能出现的异常
     * }catch(参数：异常的类型  e) {
     *     捕获try中可能出现的异常
     * }finall{
     *
     * }
     *      1、catch块中，一定要捕获相应的异常，否则会交给JVM处理
     *      2、可用 catch 捕获多个异常
     *      3、不建议直接捕获Exception（所有异常父类）（用Exception可以捕获所有异常）,应捕获具体异常
     *      4、finally中的代码一定会被执行 （所以经常做一些善后工作，比如关闭资源）
     *      5、不建议在finally中出现return语句
     */

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            System.out.println(10/n);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }//使用try负责回收资源（回收scanner资源）

    public static int func1(){
        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);
            return 1;//不会被执行
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
            return 3;
        } finally {
            return 2;//finally中代码永远被执行  不建议在finally中出现return语句
        }
    }

    public static void main4(String[] args) {
        System.out.println(func1());//输出 2 finally中代码永远被执行
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);
            System.out.println("不会被执行");//不会被执行
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }finally {
            System.out.println("finally块的代码肯定会被执行");
        }//finally一定被执行，所以经常做一些善后工作，比如关闭资源

        System.out.println("hello");
    }

    public static void main2(String[] args) {
        int[] array = {1,2,3};
        System.out.println(array[4]);//当这步发生异常，就交给JVM处理异常，这就导致程序立即停止
        System.out.println("hello");//不会执行这步
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);
            System.out.println("www");//不会被执行
        } catch (ArrayIndexOutOfBoundsException i) {
            i.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }//当程序抛出异常时，由catch进行捕获，程序自己处理异常，程序会继续向下执行
        //这里是 数组下标越界异常 catch中要用 ArrayIndexOutOfBoundsException类
        System.out.println("hello");//会执行这步

//        int a = 10/0;//ArithmeticException算术异常
//        System.out.println(a);
    }
}
