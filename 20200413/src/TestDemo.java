import java.util.Scanner;

/**
 * @program: 2020.4.13
 * @description:方法，递归，重载
 * @author: spdz
 * @create: 2020-04-13 10:30
 **/
public class TestDemo {

    /**
     * n的阶乘
     * @param n
     * @return
     */
    public static int factorial2(int n) {
        int j = 1;
        for (int i = 1; i <= n ; i++) {
            j *= i;
        }
        return j;
    }
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial2(n));
    }


    /**
     * n的阶乘和
     * @param n
     * @return
     */
    public static int factorialSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            int t = 1;
            for (int j = 1; j <= i; j++) {
                t *= j;
            }
            sum += t;
        }
        return sum;
    }
    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorialSum(n));
    }


    /**
     * 递归
     * n的阶乘
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return (n * factorial(n-1));
    }
    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }


    /**
     * 迭代
     * 斐波那契数
     * @param n
     * @return
     */
    public static int fibonacci2(int n) {
        if (n <= 2) {
            return 1;
        }
        int j = 0;
        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            j = a + b;
            a = b;
            b = j;
        }
        return j;
    }
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci2(n));
    }


    /**
     * 递归
     * 斐波那契数
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
	}
	public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
	}


    /**
     * 按顺序打印每一位
     * @param n
     */
    public static void outNum(int n) {
        if (n > 9) {
            outNum(n/10);
        }
        System.out.print(n%10 + " ");
    }
    public static void main8(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        outNum(n);
    }


    /**
     * 一个数各位数之和
     * @param n
     * @return
     */
    public static int func(int n) {
        if (n < 10) {
            return n;
        }
        return n%10 + func(n/10);
    }
    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(func(n));
    }


    /**
     * 1+2+3+...+n之和
     * @param n
     * @return
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main6(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sum(n));
    }


    /**
     * 三个数最大值
     * @param a
     * @param b
     * @return
     */
    public static int max1(int a,int b) {
        return a > b ? a : b;
    }
    public static int max2(int a,int b,int c) {
        return (max1(a,b) > c) ? max1(a,b) : c;
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max2(a,b,c));
    }


    /**
     * 重载
     * 三个数最大值
     * @param args [description]
     */
    public static int max(int a,int b) {
        return a > b ? a : b;
    }
    public static int max(int a,int b,int c) {
        return (max(a,b) > c) ? max(a,b) : c;
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max(a,b,c));
    }


    /**
     * 获取一个数二进制序列中所有的偶数位和奇数位
     * 分别输出二进制序列
     * @param args
     */
    public  static void jiouNum(int n) {
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((n >> i) & 1) + " ");
        }
        System.out.println();
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((n >> i) & 1) + " ");
        }
    }
    public static void main3(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n =scanner.nextInt();
    jiouNum(n);
    }


    /**
     * 一个整数，在内存当中存储时，二进制1的个数
     * @param args
     */
    public static int count1(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n-1);
            count ++;
        }
        return count;
    }
    public static void main2(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count1(n));
    }


    public static int count2(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((n>>i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }
    public static void main1(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count2(n));
    }
}
