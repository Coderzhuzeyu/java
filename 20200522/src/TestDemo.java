import java.util.Arrays;

/**
 * @program: 20200522
 * @description: ${description}
 * @author: zhuzeyu
 * @create: 2020-05-22 19:01
 **/
/*public class TestDemo {
*//*
* 两个相同的数字 如果异或结果为0
* 0异或任何数字结果都是任何数字
* 0000 0010^         0000 0000
* 0000 0010          0000 0011^
* 0000 0010          0000 0011
*
*一个数组当中，只有一个数字出现一次，其他数字都是两次，
* 找出这个数组中只出现一次的数字?
* *//*

    public static void main2(String[] args) {
        int[] array = {1,2,4,1,4};
        int ret = 0;
        for (int i = 0; i < array.length;i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }
*//*一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
*
* num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
*
*//*
//全部异或
public static int xor(int[] array) {
    int xor = 0;
    for (int i = 0; i < array.length; i++) {
        xor ^= array[i];
    }
    return xor;
}
    //二进制从右起第一个1的位数
    public static int findOne(int num) {
        int i = 0;
        for (int j = 0; j < 32; j++) {
            i++;
            if (((num>>j) & 1) == 1) {
                return i;
            }
        }
        return 0;
    }
    //某个数 （i）二进制第 k 位是否为 1
    public static int isBit(int i,int k) {
        if(((i>>(k-1)) & 1) == 1) {
            return 1;
        }else {
            return 0;
        }
    }
    public static void FindNumsAppearOnce(int [] array,int[] num1 , int[] num2) {
        if (array == null||array.length < 2) {
            return;
        }
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(isBit(array[i],findOne(xor(array))) == 1) {
                n1 ^= array[i];
            }else {
                n2 ^= array[i];
            }
        }
        num1[0] = n1;
        num2[0] = n2;
    }

    public static void main3(String[] args) {
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        int[] array = {2,3,2,5,1,5};
        FindNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }













    *//*
    * 打印二维数组元素
    * 二维数组的打印方式
    * *//*
    public static void main1(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
      *//*  for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*//*

      *//*  for (int i = 0; i < array.length; i++) {
            for (int j = 0 ; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();*//*

      *//*  Arrays.toString把数组中元素按字符串形式输出，但二位数组Arrays.toString指的是地址
        System.out.println(Arrays.toString(array));*//*

        *//*应该用deepToString打印二维数组
        System.out.println(Arrays.deepToString(array));*//*



        //foreach 右边是数组名 左边接收
        //二维数组外层循环不能用整型接收，因为array里每一个元素是一个一维数组
        //里边循环用整型接收
        for (int[] tmp:array) {
            for (int x:tmp) {
                System.out.print(x + " ");
            }
            System.out.println(
            );
        }



    }






}*/






