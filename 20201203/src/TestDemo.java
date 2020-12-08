import java.util.List;
import java.util.Stack;

public class TestDemo {
    public static void main(String[] args) {
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
