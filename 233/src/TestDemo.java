public class TestDemo {
    public static void main(String[] args) {
        int n = 2;
        //打印上半部分
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //打印中间部分
        for (int i = 0; i < n+1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        //打印下半部分
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main1(String[] args) {
        int n = 5;
        //每次循环代表一个行，i只是一个序号，没有特殊含义
        for (int i = 0; i < n; i++) {
            //处理打印空格（n-i-1）
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //处理打印字符（i+i）
            for (int j = 0; j < i+1; j++) {
                System.out.print("1 ");
            }
            //打印回车
            System.out.println();

        }
    }
    }





