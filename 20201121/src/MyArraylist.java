import java.util.Arrays;

public class MyArraylist {
    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArraylist() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;

    }
    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();

    }
    private boolean isFull(){
      /*  if (this.usedSize == this.elem.length){
            return true;
        }
        return false;*/
      return this.usedSize == this.elem.length;
    }
    private void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }
        //在 pos 位置新增元素
        public void add ( int pos, int data){
            checkPos(pos);
            if (isFull()) {
                this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
            }
            if (pos < 0 || pos > this.usedSize) {
                return;
            }
            //挪数据了
            for (int i = this.usedSize - 1; i >= pos; i--) {
                this.elem[i + 1] = this.elem[i - 1];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
        // 判定是否包含某个元素
        public boolean contains ( int toFind){
            for (int i = 0; i < this.usedSize; i++) {
                if (this.elem[i] == toFind) {
                    return true;
                }
            }
            return false;
        }
        //查找某个元素对应的位置
        public int search ( int toFind){
            for (int i = 0; i < this.usedSize; i++) {
                if (this.elem[i] == toFind) {
                    return i;
                }
            }
            return -1;
        }
        private boolean isEmpty () {
            return this.usedSize == 0;
        }

        // 获取 pos 位置的元素
        public int getPos ( int pos){
            //1.顺序表是否为空
            if (isEmpty()) {
                //return -1;
                throw new RuntimeException("顺序表为空");//手动抛出异常
            }
            //2.pos合法性
       /* if(pos < 0 || pos >= this.usedSize){
            return -1;*/
            checkPos(pos);
            //3.return pos位置数据就ok了
            return this.elem[pos];

        }
    // 获取顺序表长度
        public int size() {
        return this.usedSize;
    }
    //删除第一次出现的关键字toRemove
    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1);{
            System.out.println("没有需要删除的数字！ ");
            return;
        }

            
        }
    }




    /*// 打印顺序表
    public void display() {   }
    // 在 pos 位置新增元素
    public void add(int pos, int data) { }
    // 判定是否包含某个元素
    public boolean contains(int toFind) { return true; }
    // 查找某个元素对应的位置
    public int search(int toFind) { return -1; }
    // 获取 pos 位置的元素
    public int getPos(int pos) { return -1; }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {   }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {   }
    // 获取顺序表长度
    public int size() { return 0; }
    // 清空顺序表
    public void clear() {   }
*/

