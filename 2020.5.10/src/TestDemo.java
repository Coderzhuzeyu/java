import java.util.Scanner;

/**
 * @program: 2020.5.11
 * @description:StringBuilder  StringBuffer
 * @author: zhuzeyu
 * @create: 2020-05-11 22:00
 **/
public class TestDemo {

    //一个整数二进制中1的个数
    public static int func2(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n>>i)&1) == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(func2(n));
    }

    //青蛙跳台阶
    public static int func1(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return func1(n - 1) + func1(n-2);
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(func1(n));
    }

    //求斐波那契数
    public static int func(int n) {
        if(n <= 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int j = 0;
        for (int i = 3; i <= n; i++) {
            j = a+b;
            a = b;
            b = j;
        }
        return j;
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(func(n));
    }

    /**
     * String 和 StringBuilder及StringBuffer的区别（都被final修饰，不能被继承）
     *  1、String 的拼接会产生大量临时变量。StringBuilder及StringBuffer不会（因为可以更改）
     *  2、String 拼接会被优化为StringBuilder的append()
     *  3、String和StringBuilder一般用于单线程情况下
     *     StringBuffer一般用于多线程（synchronized 线程安全)   最常用
     * @param args
     */
    public static void main2(String[] args) {

        String str = "";
        for (int i = 0; i < 10; i++) {
            str +='a';
        }
        System.out.println(str);

        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s2.append("a");
        }
        System.out.println(s2);


        StringBuffer s3 = new StringBuffer();
        s3.append("hello");
        System.out.println(s3);
        s3.reverse();//StringBuffer()中有逆置方法
        System.out.println(s3);


        /*String s = "hello";
        s = s + "world";
        System.out.println(s);

        StringBuilder s1 = new StringBuilder();
        s1.append("hello");
        s1.append("world");
        String ret = s1.toString();
        System.out.println(ret);*/

        //StringBuffer stringBuffer = new StringBuffer();
        /*StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcd");
        stringBuilder.append("efg").append("1234");

        System.out.println(stringBuilder);*/

    }

    public static void main1(String[] args) {
        String str = "abcdef";
        str = str + "hello";
        System.out.println(str);
    }
}
