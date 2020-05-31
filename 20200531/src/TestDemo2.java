import java.util.Arrays;

/**
 * @program: 20200511
 * @description: 数组
 * 存放相同数据类型的集合。内存是连续的。
 * @author: zhuzeyu
 * @create: 2020-05-12 19:55
 **/
public class TestDemo2 {
    public static int[] func(int[] array){
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));
        public static void main3(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
    }

}
    public static void printArray(int[] arr){
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void swap(int[] array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main2(String[] args) {
        int[] array2 = {10, 20};
        System.out.println(array2[0] + " " + array[1]);
        swap(array2);
        System.out.println(array2[0] + " " + array[1]);

        /*int[] array = {1,2,3,4};
        printArray(array);*/
      /*  int[] array = {,1,2,3,4};
        int len = array.length;//属性*/
        public static void main1(String[] args) {

        }
        for (int i = 0; i < array.length ; i++) {
            int[] array = {,1,2,3,4};
            int len = array.length;//属性
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int val:array) {
            System.out.print(val + " ");

        }
    }

}
