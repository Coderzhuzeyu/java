import java.util.Arrays;
import java.util.Random;

/**
 * @program: 
 * @description:排序
 * @author: Coderzhuzeyu
 * @create: 
 **/

/**
 * 常用的 七个 基于比较的 排序
 *
 *  稳定性： 两个相等的数据，如果经过排序后，排序算法能保证
 *      其相对位置不发生变化，则我们称该算法是具备稳定性的排序算法
 *
 *      例：2  3(a)  1  4  3(b) 经过排序后为
 *       结果为： 1  2  3(a)  3(b)  4 稳定排序
 *       结果为： 1  2  3(b)  3(a)  4 不稳定排序
 *
 *     如果一个排序是 稳定的的排序 ，那么他就 可以变为 不稳定的排序
 *     但如果一个排序本身是 不稳定排序，你 不可能 把它变为 稳定排序
 *
 *     稳定排序中没有跳跃式交换
 */
public class TestSort {

    /**
     * 直接插入排序
     *
     * 时间复杂度：
     *     最坏情况：O（n^2）  最好情况（有序的情况）：O（n）
     *     非常重要的5个字：越有序越快
     * 空间复杂度： O（1）
     * 稳定性：稳定排序
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int t = array[i];
            int j = i-1;
            for (; j >= 0 ; j--) {
                if (array[j] > t) {
                    array[j+1] = array[j];
                }else {
                    array[j+1] = t;
                    break;
                }
            }
            array[j+1] = t;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10_0000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            //array[i] = i;//有序数组
            array[i] = random.nextInt(10_0000);
        }
        long start = System.currentTimeMillis();//当前时间（这里指排序开始时间）
        insertSort(array);
        long end = System.currentTimeMillis();//当前时间（这里指排序结束时间）
        System.out.println(end-start);
    }

    public static void main1(String[] args) {
        int[] array = {10,5,8,4,1,9};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

}
