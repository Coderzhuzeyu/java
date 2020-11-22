import java.util.Arrays;
public class TestDemo {
    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
    public static void transfrom(int[] arr) {
        int left = 0;
        int right =arr.length - 1;
        while(left < right ){
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            if (left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        transfrom(arr);
        System.out.println(Arrays.toString(arr));
    }

    //数组转字符串
    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]",
    // 注意 逗号 的位置和数量.
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0;i < arr.length; i++) {
            ret += arr[i];//借助String += 进行拼接字符串
            if ( i !=arr.length-1){
                //除了最后一个元素之外，其他元素后面都要加上" ,"
                ret += ",";
            }
        }
        ret += "]";

            return ret;
    }
    public static void main8(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(toString(arr));
    }


    //数组拷贝
    //4.clone()（相当于产生这个对象的副本）
    //这个方法是Object的克隆方法
    //Object：是所有类的父类。祖先
    public static void main7(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }

    //数组拷贝
    //3.System.arraycopy（开始拷贝的位置，拷到那个位置，拷贝的长度)
    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));
    }

    //数组拷贝
    //2.Arrays.copy方法（原理：返回了个新的对象）
    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
    }
    //数组拷贝
    //1.for
    public static int[] copyArray(int[] array){
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
    }
//给定一个有序整型数组, 实现二分查找
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <=right){
            int mid = (left + right)/2;
            if (key < array[mid]){
                right = mid - 1;
            }else if (key > array[mid]){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main3(String[] args) {
    int[] array = {2,5,8,9,13};
        int ret = binarySearch(array,13);
        System.out.println("下标: " +ret);
    }



    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean isUp(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,10,5,6};
        System.out.println(isUp(array));
    }





    //冒泡排序
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1 ; i++) {
            boolean sort = true;
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] =array[j];
                    array[j] = tmp;
                    sort = false;
                }
            }
            if (sort){
                break;
            }
        }
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,10,5,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
