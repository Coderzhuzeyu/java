import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack(){
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    public void push(int x) {
        stack.push(x);
        if (minStack.empty()) {
            //最小栈没有元素
            minStack.push(x);
        }else {
            //最小栈内有元素  拿到栈顶元素 和x比较
            int top =minStack.peek();//查看最小栈的栈顶元素
            if (x <= top) {
                minStack.push(x);
            }

        }
    }
    //stack栈必须得出 出的前提是它不能为空
    //出的元素要记录下来  和minStack栈顶元素看是不是相等 如果是的话也得出出去

    public void pop() {
        if (!stack.empty()) {
            int tmp = stack.pop();
            if (tmp == minStack.peek()){
                minStack.pop();
            }
        }
    }
    //查看普通栈栈顶元素(拿到并不删除)
    public int top() {
        if (stack.empty()) {
            return -1;
        }
        return stack.peek();
    }
    //求栈当中最小元素
    public int getMin() {
        if (minStack.empty()) {
            return -1;
        }
        return minStack.peek();
    }
}
