import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @program: 2020.6.11
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-11 23:30
 **/

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}


public class TestDemo {

    //最小的前 K 个数 (topK 问题 )
    public static int[] topK(int[] array, int k) {
        //MyComparator myComparator = new MyComparator();
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>(myComparator);

        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new MyComparator());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });//匿名内部类

        for (int i = 0; i < array.length; i++) {
            if (maxHeap.size() < k) {
                maxHeap.offer(array[i]);
            }else {
                if (maxHeap.peek() != null && maxHeap.peek() > array[i]) {
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        int[] ret = new int[k];
        for (int i = k-1; i >= 0; i--) {
            ret[i] = maxHeap.poll();
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {10,5,12,15,3,20,17,13};
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] ret = topK(array, k);

        System.out.println(Arrays.toString(ret));
    }
}
