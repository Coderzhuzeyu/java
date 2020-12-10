import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class TestDemo {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();//new一个栈放所有的左括号
        for (int i = 0; i < s.length(); i++) {//遍历括号  将左括号都放入栈中
            char ch = s.charAt(i);//取得索引位置括号
            //判断ch是否题目中为左括号中的任意一个
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);//如果是左括号将左括号都放入栈中
            } else {//不是左括号 到右括号了
                //判断栈是否为空
                if (stack.empty()) {//栈中根本没有左括号
                    System.out.println("右括号多！");
                    return false;
                }
                //先拿到栈顶元素的括号
                char ch2 = stack.peek();//查看栈顶左括号是否与右括号匹配
                if (ch2 == '(' && ch == ')' || ch2 == '[' && ch == ']'
                        || ch2 == '{' && ch == '}') {
                    stack.pop();//匹配了出栈
                } else {
                    System.out.println("左右括号不匹配");
                    return false;
                }
            }
        }
        if (!stack.empty()) {//遍历完栈中仍然有左括号
            System.out.println("左括号多！");
            return false;
        }
        return true;
    }

    public static void main4(String[] args) {
        MyQueue myQueue =new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
    }
    public static void main3(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek());//查看对顶元素
        System.out.println(queue.poll());//出队
        System.out.println(queue.peek());
    }
    public static void main2(String[] args) {
       // List<Integer> list = new Stack<>();//可以这样写  但是一般情况下不这样写
        Stack<Integer> list = new Stack<>();//直接用自己类写
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek());//3
        System.out.println(myStack.pop());//3
        System.out.println(myStack.peek());//2
    }
}
