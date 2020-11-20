import java.util.Arrays;
public class TestDemo {
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static int[] setNumber(int[] arr){
        for (int i = 0; i < 100; i++) {
             arr[i] = i+1;
        }
        return arr;
    }
    public static void main5(String[] args) {
        int[] arr = new int[100];
        int[] ret = setNumber(arr);
        System.out.println(Arrays.toString(ret));
    }
//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public  static int[] printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i];
        }
        return arr;
    }
    public static void main4(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ret = printArray(arr);
        System.out.println(Arrays.toString(arr));
    }

//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
// 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
public static int[] transform(int[] arr){
    int[] tmp = new int[arr.length];
    for (int i = 0; i < arr.length ; i++) {
        arr[i] =arr[i] * 2;
    }
    return tmp;
}
public static void main3(String[] args) {
    int[] arr = {1,2,3};
    int[] ret = transform(arr);
    System.out.println(Arrays.toString(ret));
}

// 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum(int[] arr){
        int sum = 0;
        for (int x:arr) {
            sum += x;
        }
        return sum;
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sum(arr));
    }
    //求数组的平均值
    public static double avg(int[] arr){
    int sum = 0;
    for (int x:arr) {
        sum += x;
    }
    return (double)sum / (double)arr.length;
}
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(avg(arr));
    }
}
