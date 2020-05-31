/**
 * @program: 20200511
 * @description: ${description}
 * @author: zhuzeyu
 * @create: 2020-05-11 19:24
 **/
public class TestDemo {
    public static int maxNum(int num1,int num2,int num3){

       int a = num1 > num2 ? num1:num2;
       return a > num3 ? a:num3;
    }

    public static void main1(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int ret = maxNum(n1,n2,n3);
        System.out.println(ret);
    }
    public  static int fac(int n){
        if (n <= 2){
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n ; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main2(String[] args) {
        System.out.println(fac(3));
    }

    public static void move (char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1, pos3);
        } else {
            hanoi(n - 1, pos1, pos3, pos2);
            move(pos1, pos3);
            hanoi(n - 1, pos2, pos1, pos3);
        }
    }
    public static void main3(String[] args) {

        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }

    public static int JumpFloor(int target) {
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return JumpFloor(target - 1)+ JumpFloor(target - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(4));

    }
}
