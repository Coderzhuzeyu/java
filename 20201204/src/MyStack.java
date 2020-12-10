import java.util.Arrays;

public class MyStack<T> {
    public T[] elem;//数组  默认值为null
    public int top;//表示可以存放数据元素的下标

    public MyStack() {//构造方法
        this.elem = (T[]) new Object[10];//数组放10个元素  都是0
    }

    public void push(T val) {
        if (full()) {//如果是满的  扩容  拷贝原来数据 *2
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[top++] = val;//如果没有满 val放到top指向的位置 然后top++
    }

    public boolean full() {
        return this.top == this.elem.length;//判断栈是否满了
    }
    public boolean empty() {//判断是否为空的
        return this.top == 0;
    }
    public T pop() {
        if (empty()) {
            throw new RuntimeException("栈空！");//防止栈中有-1元素
            //return -1//栈中有可能有-1元素
        }
        T data = this.elem[this.top-1];//拿到要pop的数据的数据  用data存放
        this.top--;//删掉那个元素
        return data;
        //return this.elem[--this.top];//上面的简写

    }
    public T peek() {
        if (empty()) {
            throw new RuntimeException("栈空！");//防止栈中有-1元素
            //return -1//栈中有可能有-1元素
        }
        return this.elem[this.top-1];//此时拿到top-1的元素  但是top依旧是top
    }
    public int size() {
        return this.top;
    }
}
