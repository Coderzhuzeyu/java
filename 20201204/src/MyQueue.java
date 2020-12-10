class Node {
    public int data;
    public Node next;
    //每次new一个节点  就要调用它的构造方法
    public Node(int data) {
        this.data = data;
    }
}
public class MyQueue {
    public int usedSize;
    public Node front;//队列的头
    public Node rear;//队列的尾
    public boolean offer(int val) {
        Node node = new Node(val);
        if (rear == null) {//第一次插入
            this.rear = node;
            this.front = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        usedSize++;//每存一个元素  usedSize++
        return true;
    }
    //出队且删除队头元素
    public int poll() {
        if (isEmpty()) {
           throw new RuntimeException("队列为空！");
        }
        int data = this.front.data;
        this.front = this.front.next;
        return data;

    }
    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    //查看队头元素
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        return this.front.data;
    }
    public int size() {
        return this.usedSize;
    }

}
