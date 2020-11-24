import java.util.Arrays;
import java.util.Scanner;
public class TestDemo {
    //给定一个整型数组, 将所有的偶数放在前半部分,
    // 将所有的奇数放在数组后半部分
    public static void  transform(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 ==0) {
                left++;
            }
            while (left < right && array[right] % 2 !=0) {
                right--;
            }
            if (left < right) {
                int tmp =array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    //给定一个数组, 将里面的元素逆序排列
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main18(String[] args) {
        int[] array = {1,2,3,4};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    //冒泡排序
    public  static void bubbleSort(int[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
    public static void main17(String[] args) {
        int[] array = {1,2,3,10,5,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    //给定一个整型数组, 判断是否该数组是有序的(升序)
    public static boolean isUp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main16(String[] args) {
        int[] array = {1,2,3,10,5,6};
        System.out.println(isUp(array));
    }
    //二分法查找
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (key < array[mid]){
                right = mid -1;
            }else if (key > array[mid]) {
                left = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main15(String[] args) {
        int[] array = {2,5,8,9,13};
        int ret = binarySearch(array,13);
        System.out.println("下标：" + ret);
    }

    //给定一个数组, 再给定一个元素, 找出该元素在数组中的位置.
    public static int find(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main14(String[] args) {
        int[] array = {12,2,18,24,76,13};
        int ret = find(array,18);
        System.out.println("下标: " + ret);
    }
    //给定一个整型数组, 求平均值
    public static double avg(int[] array) {
        int sum = 0;
        for (int x:array) {
            sum += x;
        }
        return (double)sum /(double)array.length;
    }
    public static void main13(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(avg(arr));
    }
//给定一个整型数组, 找到其中的最大元素 (找最小元素同理)
    public static int max(int[] array) {
        int max =array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max =array[i];
            }
        }
        return max;
    }
    public static void main12(String[] args) {
        int[] array = {12,2,18,24,76,13};
        System.out.println(max(array));
    }
//写一个方法, 将数组中的每个元素都*2
    public static int[] func4(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }
    public static void main11(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func4(array);
        System.out.println(Arrays.toString(ret));
    }

    public static void main10(String[] args) {
        int [] array = {1,2,3,4};
       /* int len = array.length;
        System.out.println(len);*/
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
//获取长度 & 访问元素
    public static void main9(String[] args) {
        int[] array = {1, 2, 3, 4};
        int len = array.length;
        System.out.println(len);
    }

    // 写一个递归方法，输入一个非负整数，返回组成它的数字之和。
    // 例如，输入1729,，则应该返回1+7+2+9，它的和是19

    public  static int func3(int n) {
        if (n < 1) {
            return n;
        }
        return n%10 + func3(n/10);
    }
    public static void main8(String[] args) {
        System.out.println(func3(1729));
    }
    //递归求 1 + 2 + 3 + … + 10
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n +sum(n -1);
    }
    public static void main7(String[] args) {
        System.out.println(sum(10));
    }
    //按顺序打印一个数字的每一位
    // (例如 1234 打印出 1 2 3 4)
    public static void func2(int n) {
        if (n > 9) {
            func2(n/10);
        }
        System.out.println(n%10);
    }
    public static void main6(String[] args) {
        func2(1234);
    }
    //递归求N的阶乘
    public static int fac1(int n){
    if (n == 1) {
        return 1;
    }
    return n * fac1(n-1);
}
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ret = scan.nextInt();
        System.out.println(fac(ret));
    }
    // 交换两个整型变量
    public static void swap(int[] array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {10,20};
        swap(array);
        System.out.println("a = " + array[0] + " b = " + array[1]);
    }
   //计算 1! + 2! + 3! + 4! + 5！
    public static int factor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=fac(i);
        }
        return sum;
    }
    public static int fac(int num) {
        int ret = 1;
        for (int i = 1; i <= num; i++) {
            ret *= i;
        }
        return ret;
    }
   public static void main3(String[] args) {
       System.out.println(factor(5));
   }

    public static int add(int x,int y) {
        return x + y;
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ret = add(a, b);
        System.out.println("ret: " + ret);
    }
    //计算 1! + 2! + 3! + 4! + 5!
    public static void main1(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int tmp = 1;
            for (int j = 1; j <= i; j++) {
                tmp *= j;
            }
            sum += tmp;
        }
        System.out.println("sum= " + sum);
    }

}
