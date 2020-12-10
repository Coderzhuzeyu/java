//循环队列
/*
* rear表示当前可以存放数据元素的下标
* front==rear队列是空
* 浪费一个空间，如果rear下一个是front就认为是满的
* 但是不能rear++  因为最后一个下标无法到达0，
* 用(rear+1) % 数组的长度elem.length
* 出队 移动front
* 队列如果是满的rear的下一个等于front  this.rear+1) % this.elem.length ==this.front
* */

public class MyCircularQueue {
    public int elem[];
    public int front;//对头
    public int rear;//队尾  指的是可以存放数据元素的下标
    public MyCircularQueue(int k) {//构造方法
        /*//如果在力扣上需要k+1  因为力扣元素放满了 但是这个浪费一个空间
        //this.elem =new int[k+1];*/
        this.elem =new int[k];//初始化  其它三个初不初始化都可  对应0值
    }

    public boolean enQueue(int value) {//进队
        if (isFull()) {
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1) %this.elem.length;//新的rear=将rear移动
        return true;
    }


    public boolean deQueue() {//出队
        if (isEmpty()) {
            return false;
        }
        this.front = (this.front+1) % this.elem.length;// 新的front=将front移动
        return true;
    }

    public int Front() {//得到队头元素
        if (isEmpty()) {
            return -1;
        }
        return this.elem[front];
    }

    public int Rear() {////得到队尾元素
        if (isEmpty()) {
            return -1;
        }
        int index = this.rear ==0 ? this.elem.length-1 : this.rear-1;
        return this.elem[index];
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        if ((this.rear+1) % this.elem.length ==this.front) {//rear的下一个等于front
            return true;
        }
        return false;
    }
}
