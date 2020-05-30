import java.util.Scanner;

/**
 * @program: 20200530
 * @description: ${description}
 * @author: zhuzeyu
 * @create: 2020-05-29 18:20
 **/
public class TestDemo {
    //求和的重载
    //  在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
    //并执行代码，求出结果
    public static int sum(int a,int b){
        return a + b;
    }
    public static double sum(double a,double b,double c){
        return a + b + c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sum(a,b));
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        System.out.println(sum(c, d, e));
    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int func1(int n){
        //1729
        if(n<10){
            return n;
        }
        return n%10+func1(n/10);//1729%10=9 + func1(172)
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(func1(n));
    }



    //递归求和
    //递归求 1 + 2 + 3 + ... + 10
    public static int sum(int n){
        if(n == 1){
            return 1;
    }
        return n+sum(n-1);
    }

    public static void main5(String[] args) {
        System.out.println(sum(10));
    }
  //递归打印数字的每一位
  //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
  public static void func(int n) {
      //123
      if (n > 9) {
          func(n/10);//123/10=12
      }
      System.out.print(n % 10+" ");//终止条件   1%10 12%10  123%10
  }
  public static void main4(String[] args) {
      func(1234);
  }
    //递归求 N 的阶乘
    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n * fac(n-1);
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fac(N));
    }

    /*//求1！+2！+3！+4！+........+n!的和
    public static int factor(int n){
        int sum = 0;
        for (int i = 1;i <= n;i++) {
            sum+=fac(i);
        }
        return sum;
    }
    //求得每个数字的阶乘
    public static int fac(int num){
        int ret = 1;
        for (int i = 1; i <= num ; i++) {
            ret *= i;
        }
        return ret;
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factor(n));
    }

//求最大值
//创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int maxNum(int num1,int num2){
        return num1 > num2 ? num1:num2;
    }
    public static int maxThreeNum(int num1,int num2,int num3){
       int max = maxNum(num1,num2);
       return maxNum(max,num3);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ret = maxThreeNum(a,b,c);
        System.out.println(ret);
    }*/
}
