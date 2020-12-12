import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public MyQueue(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    //出队
    public int pop() {
        if (empty()) {
            return -1;
        }
        if (stack2.empty()) {
            //将栈1的元素全部导入栈2
             while (!stack1.empty()) {
                 stack2.push(stack1.pop());
             }
        }
        return stack2.pop();//出栈2的元素
    }

    /** Get the front element. */
    //查看队头元素
    public int peek() {
        if (empty()) {
            return -1;
        }
        if (stack2.empty()) {
            //将栈1的元素全部导入栈2
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();//查看栈2栈顶的元素
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (stack1.empty() && stack2.empty()) {
            return true;
        }
        return false;
    }
}
