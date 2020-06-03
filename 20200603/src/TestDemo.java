import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program:
 * @description:优先级队列 PriorityQueue
 * @author: Coderzhuzeyu
 * @create: 
 **/

/**
 * 堆：一颗 顺序存储 的完全二叉树 (数组中 存储的是 这颗二叉树的 层序遍历)
 *      大堆（大根堆）：根节点的值 > 左右孩子节点的值
 *      小堆（小根堆）：根节点的值 < 左右孩子节点的值
 *
 * PriorityQueue : 底层是小根堆
 */

public class TestDemo {

    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        System.out.println(testHeap.isEmpty());
        testHeap.createHeap(array);
        testHeap.show();
        testHeap.pop();
        testHeap.show();
        System.out.println(testHeap.peek());
        testHeap.heapSort();
        testHeap.show();
    }

    public static void main3(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        testHeap.show();
        System.out.println(testHeap.isFull());
        testHeap.push(80);
        testHeap.show();
    }

    public static void main2(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        System.out.println(Arrays.toString(testHeap.elem));
        testHeap.show();
        TestHeap testHeap2 = new TestHeap();
        testHeap2.createHeap2(array);
        testHeap2.show();
    }

    public static void main1(String[] args) {
        //Queue<Integer> queue = new PriorityQueue<>();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(2);
        priorityQueue.offer(1);
        priorityQueue.offer(8);

        System.out.println(priorityQueue.peek());//1 数越小，优先级越高
        System.out.println(priorityQueue.poll());//1
        System.out.println(priorityQueue.poll());//2

    }
}
