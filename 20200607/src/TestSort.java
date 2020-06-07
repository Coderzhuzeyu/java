import java.util.Arrays;
import java.util.Stack;

/**
 * @program: 2020.6.7
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-07 18:59
 **/
public class TestSort {

    /**
     * 归并排序 (递归实现)
     *
     * 时间复杂度: n*log(2)n
     * 空间复杂度: O(n)
     * 稳定排序
     * 外排序： 磁盘。
     * @param array
     */
    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }

    public static void mergeSortInternal(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        //分解
        int mid = (low + high)>>>1;
        mergeSortInternal(array, low, mid);
        mergeSortInternal(array, mid+1, high);
        //合并
        merge(array,low, mid, high);
    }

    public static void merge (int[] array, int low, int mid, int high) {
        int s1 = low;
        int s2 = mid+1;
        int len = high-low+1;
        int[] ret = new int[len];
        int i = 0;//用来表示ret数组的下标
        //对应位置比较
        while (s1 <= mid && s2 <= high) {
            if (array[s1] <= array[s2]) {
                ret[i++] = array[s1++];
            }else {
                ret[i++] = array[s2++];
            }
        }

        //判断谁没走完，把剩下的数放到ret数组中
        while (s1 <= mid) {
            ret[i++] = array[s1++];
        }

        while (s2 <= high) {
            ret[i++] = array[s2++];
        }

        //将ret数组中的数放到array数组中
        for (int j = 0; j < ret.length; j++) {
            array[j+low] = ret[j];
        }
    }

    public static void main(String[] args) {
        int[] array = {10,6,7,1,3,9,4,2};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main2(String[] args) {
        int a = 2;
        int b = a>>>1;//右移除2
        System.out.println(b);
    }

    /**
     * 非递归实现 快速排序
     */
    public static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = array.length-1;
        int par = partition(array,left,right);
        if (par > left+1) {
            stack.push(left);
            stack.push(par-1);
        }
        if (par < right-1) {
            stack.push(par+1);
            stack.push(right);
        }
        while(!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            par = partition(array,left,right);
            if (par > left+1) {
                stack.push(left);
                stack.push(par-1);
            }
            if (par < right-1) {
                stack.push(par+1);
                stack.push(right);
            }
        }
    }

    public static int partition(int[] array, int left, int right) {
        int t = array[left];
        while (right > left) {
            while (array[right] >= t && right > left) {
                right--;
            }
            array[left] = array[right];
            while (array[left] <= t && right > left) {
                left++;
            }
            array[right] = array[left];
        }
        array[right] = t;
        return right;
    }

    public static void main1(String[] args) {
        int[] array = {6,1,2,7,9,3,4,5,10,8};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
