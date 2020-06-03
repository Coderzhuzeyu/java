import java.util.Arrays;

/**
 * @program: 
 * @description:
 * @author: Coderzhuzeyu
 * @create: 
 **/
public class TestHeap {

    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
    }

    /**
     * 堆向下调整 为 大根堆
     * 时间复杂度: O(log(2)n)
     * @param root 每颗子树的开始位置
     * @param len 结束位置
     */
    public void adjustDown(int root, int len) {
        int p = root;
        int c = 2*p + 1;
        while (c < len) {
            if (c+1 < len && this.elem[c] < this.elem[c+1]) {
                c++;
            }
            if (this.elem[p] < this.elem[c]){
                int t = this.elem[p];
                this.elem[p] = this.elem[c];
                this.elem[c] = t;
                p = c;
                c = 2*p + 1;
            }else {
                break;
            }
        }
    }

    //创建大根堆
    //时间复杂度: O（n）
    public void createHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        System.out.println(Arrays.toString(this.elem));
        for (int i = (this.usedSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    //大根堆插入
    public void push(int val) {
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
    }

    //向上调整
    public void adjustUp(int c) {
        int p = (c-1)/2;
        while (c != 0) {
            if (this.elem[c] > this.elem[p]) {
                int t = this.elem[c];
                this.elem[c] = this.elem[p];
                this.elem[p] = t;
                c = p;
                p = (c-1)/2;
            }else {
                break;
            }
        }
    }

    //是否满
    public boolean isFull() {
        return this.elem.length == this.usedSize;
    }

    //大根堆删除堆头元素
    public void pop() {
        if (isEmpty()) {
            return;
        }
        this.elem[0] = this.elem[this.usedSize-1];
        this.usedSize--;
        adjustDown(0,this.usedSize);

    }

    //是否为空
    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    //堆头元素
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }

    /**
     * 堆排序（从小到大）
     *      1、大根堆/小根堆创建 : O(n)
     *      2、交换 0 -》 end
     *      3、调整 O(n*log(2)n)
     *
     *      O(n) + O(n*log(2)n)
     * 时间复杂度: O(n*log(2)n)
     * 空间复杂度: O(1)
     */
    public void heapSort() {
        int end = this.usedSize-1;
        while(end > 0) {
            int t = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = t;
            adjustDown(0,end);
            end--;
        }
    }

    //打印堆
    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }


    // 堆向下调整 为 小根堆
    public void adjusDown2(int root, int len) {
        int p = root;
        int c = 2*p + 1;
        while (c < len) {
            if (c+1 < len && this.elem[c] > this.elem[c+1]) {
                c++;
            }
            if (this.elem[p] > this.elem[c]){
                int t = this.elem[p];
                this.elem[p] = this.elem[c];
                this.elem[c] = t;
                p = c;
                c = 2*p + 1;
            }else {
                break;
            }
        }
    }

    //创建小根堆
    public void createHeap2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        System.out.println(Arrays.toString(this.elem));
        for (int i = (this.usedSize-1-1)/2; i >= 0; i--) {
            adjusDown2(i,this.usedSize);
        }
    }

}
