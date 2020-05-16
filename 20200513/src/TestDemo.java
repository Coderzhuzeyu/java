import java.util.Arrays;

/**
 * @program: 20200513
 * @description: ${description}
 * @author: zhuzeyu
 * @create: 2020-05-13 22:16
 **/

/**
 * 数组的拷贝 有 4中方式：
 * for
 * Arrays.copyOf
 *  System.arraycopy
 *clone():产生了这个对象的一个副本   这个方法是object的克隆方法
 * object：是所有类的父类   祖先
 *
 */
public class TestDemo {
    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 顺序查找
     * 二分法查找:
     * array:序列   key：代表查找的元素
     *
     * @param array
     * @param key
     * @return
     */
    public static int binaySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < key) {
                left = mid + 1;
            } else if (array[mid] == key) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main5(String[] args) {
        int[] array = {12, 2, 18, 24, 76, 13};
        int ret = binaySearch(array, 18);
        System.out.println("下标: " + ret);
    }


    public static int find(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;//代表没有这个元素
    }

    public static void main4(String[] args) {
        int[] array = {12, 2, 18, 24, 76, 13};
        int ret = find(array, 18);
        System.out.println("下标: " + ret);
    }


    public static void main3(String[] args) {
        int[] array = {12, 2, 18, 24, 76, 13};
        int ret = maxArray(array);
        System.out.println(ret);
    }


    public static void main2(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
       /* int[] ret = Arrays.copyOf(array,array.length);//方法中放入cppy谁，copy的长度
        System.out.println(Arrays.toString(ret));*/

        /*int[] ret = new int[array.length];
        //从array数组的0号位置开始拷贝，拷到ret的0好位置，拷array.length那么长
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));*/

        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }

    public static int[] copyArray(int[] array) {
        //拷贝到新的数组，new一个新的数组，长度与array长度一样
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }

    public static void main1(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] ret = copyArray(array);//返回值接受被调用的拷贝
        System.out.println(Arrays.toString(ret));
    }


    /**
     * Arrays工具类当中的常用方法介绍：
     * toString()   binarySearch()     copyOf
     */
    public static void main6(String[] args) {
        //binarySearch二分法在指定范围开始找
        //binarySearch二分法从2号位置开始找找到5号位置，找3
        //[fromIndex,toIndxx)
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //fromIndex这些自动生成，
        // 一般遇到fromIndex,toIndxx结果是左闭右开的    [fromIndex,toIndxx)
        System.out.println(Arrays.binarySearch(array, 2, 5, 3));
    }

    /*
     * equals  判断两个数组是否相等
     * */
    public static void main7(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.equals(array, array2));
    }

    /*
     * fill 填充
     *
     * */
    public static void main8(String[] args) {
        int[] array2 = new int[10];
        //Arrays.fill(array2,8);   所有填充
        Arrays.fill(array2, 2, 5, 8);//指定位置填充
        System.out.println(Arrays.toString(array2));
    }

    /*
     * sort  排序
     * */
    public static void main9(String[] args) {
        int[] array = {1, 21, 13, 4, 52, 46, 7, 18, 9};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    /*
     *判断数组是否为升序
     * 是返回true
     * 否返回false
     * */
    public static boolean isup(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main10(String[] args) {
        int[] array = {1, 2, 3, 10, 5, 6};
        System.out.println(isup(array));
    }


    /*
     * 冒泡排序
     * i <array.length-1
     * j < array.length-1-i
     * */
    public static void bubbleSort(int[] array) {
        boolean flg = false;//没有发生交换
        for (int i = 0; i < array.length - 1; i++) {
            flg = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }
    }

    public static void main11(String[] args) {
        int[] array = {1, 2, 3, 10, 5, 6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    /*
     * 数组的逆序
     * */
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

    public static void main12(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    /*
     * 整型数组，将所有偶数放在前半部分，将所有奇数放在数组的后半部分
     * {1,2,3,4}    {4,3,2,1}
     * */
    public static void swap(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 == 0) {
                //偶数
                left++;
            }
            //left遇到奇数
            while (left < right && array[left] % 2 != 0) {
                right--;
        }
        //right遇到偶数了
        if (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }

 }
    public static void main13(String[] args) {
        int[] array = {2, 3, 1, 6, 7};
        swap(array);
        System.out.println(Arrays.toString(array));
    }

/*
* 求数组的平均值
* */
    public static double avg(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(avg(array));
    }
}