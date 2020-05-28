import java.util.Random;
import java.util.Scanner;


/**
 * @program: 20200517
 * @description:练习
 * @author: zhuzeyu
 * @create: 2020-05-27 20:17
 **/

public class TestDemo {
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main(String[] args) {
        double sum = 0;
        int j = 1;
        for (int i = 1; i <= 100 ; i++) {
            sum += (1.0/i) * j;
            j = -j;
        }
        System.out.println(sum);

    }

    //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位
    // 数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
    public static void main7(String[] args) {

        for (int n = 0; n <=999 ; n++) {
            int i = n;
            int sum = 0;
            while (i != 0){
                sum += Math.pow(i%10,3);//i%10的三次方
                i = i/10;
            }
            if(sum == n){
                System.out.println(n + "");
            }
        }

    }

    //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        //生成随机数
        Random random = new Random();
        int randNum = random.nextInt();
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int num = scan.nextInt();
            if(num < randNum){
                System.out.println("你猜的数字小了！");
            }else if(num == randNum){
                System.out.println("你猜的数字对了！");
            }else {
                System.out.println("你猜的数字对了！");
            }
        }
    }


    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 18) {
            System.out.println("青年");
        } else if (n >= 19 && n <= 28) {
            System.out.println("少年");
        } else if (n >= 29 && n <= 55) {
            System.out.println("中年");
        } else if (n > 56) {
            System.out.println("老年");
        }
    }

    //给定一个数字，判定一个数字是否是素数
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        for (; i <=(int)Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                System.out.println(n + "不是素数！");
                break;
            }
            }
            if(i > (int)Math.sqrt(n));
            System.out.println(n + "是素数！");
    }


    //打印 1 - 100 之间所有的素数
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        for (int i = 1; i <= n;i++) {
            int j = 2;
            for (; j <= (int)Math.sqrt(i); j++) {
                if(i % j == 0){
                    break;
                }
            }
            if(j > (int)Math.sqrt(i)){
                System.out.println(i + "是素数");
            }

        }
    }



    //输出 1000 - 2000 之间所有的闰年
    public static void main2(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if(i%4 == 0 && i%400 != 0 || i%100 == 0){
                System.out.println(i + " ");
            }

        }
    }


    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main1(String[] args) {
        int count = 0;
        for (int i = 0; i <=100 ; i++) {
            if(i % 10 == 9){
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }



}

