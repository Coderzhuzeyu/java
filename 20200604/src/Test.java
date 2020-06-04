import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program: 
 * @description:优先队列
 * @author: Coderzhuzeyu
 * @create: 
 **/
public class Test {

    public static int compare(int[] arr1, int[] arr2) {
        return (arr1[0] + arr1[1]) - (arr2[0] + arr2[1]);
    }

    public static void main(String[] args) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> compare(o2, o1));
        int[] arr1 = {2,3};
        int[] arr2 = {1,3};
        priorityQueue.offer(arr1);
        priorityQueue.offer(arr2);
        int[] arr3 = priorityQueue.peek();
        System.out.println(Arrays.toString(arr3));
    }
}
