import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Coderzhuzeyu
 * Date: 2020-06-23
 * Time: 19:56
 */
public class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()) {
            return -1;
        }
        if(stack2.empty()) {
            //导入第一个栈的元素
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        //stack2.empty()
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(empty()) {
            return -1;
        }
        if(stack2.empty()) {
            //导入第一个栈的元素
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        //stack2.empty()
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.empty() && stack2.empty()) {
            return true;
        }
        return false;
    }
}
