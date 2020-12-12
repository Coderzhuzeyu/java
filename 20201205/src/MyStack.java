import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue1;//初始化队列
    private Queue<Integer> queue2;
    public MyStack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }
    //进栈
    public void push(int x) {
       if (!queue1.isEmpty()) {
            queue1.offer(x);
       }else if (!queue2.isEmpty()){
            queue2.offer(x);
       }else {//如果两个队列都为空
           queue1.offer(x);//放到队列1
       }
    }


    //首先判断栈是否为空  也就是两个队列是否为空
    public boolean empty() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }
    //出栈
    public int pop() {
        if (empty()) {//如果栈为空 返回-1
            return -1;
        }
        int qSize1 = queue1.size();//用qSize记录将数字记录  不然循环size一直在变
        int qSize2 = queue2.size();
        int data = 0;
        if (!queue1.isEmpty()) {
            for (int i = 0; i < qSize1-1; i++) {
                queue2.offer(queue1.poll());
            }
            data = queue1.poll();
        }else {
            for (int i = 0; i < qSize1-1; i++) {
                queue1.offer(queue2.poll());
            }
            data = queue2.poll();
        }
        return data;
    }
    //拿到栈顶元素但是不删除
    public int top() {
        if (empty()) {//如果栈为空 返回-1
            return -1;
        }
        int qSize1 = queue1.size();//用qSize记录将数字记录  不然循环size一直在变
        int qSize2 = queue2.size();
        int data = 0;
        if (!queue1.isEmpty()) {
            for (int i = 0; i < qSize1; i++) {
                data = queue1.poll();
                queue2.offer(data);
            }
        }else {
            for (int i = 0; i < qSize2; i++) {
                data = queue2.poll();
                queue1.offer(data);
            }
        }
        return data;
    }
}
