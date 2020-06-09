/**
 * @program: 2020.6.09
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-9 21:18
 **/
public class TestDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        System.out.println(binaryTree.isCompleteTree(root));
    }

    //全部异或
    public static int xor(int[] array) {
        int xor = 0;
        for (int i = 0; i < array.length; i++) {
            xor ^= array[i];
        }
        return xor;
    }
    //二进制从右起第一个1的位数
    public static int findOne(int num) {
        int i = 0;
        for (int j = 0; j < 32; j++) {
            i++;
            if (((num>>j) & 1) == 1) {
                return i;
            }
        }
        return 0;
    }
    //某个数 （i）二进制第 k 位是否为 1
    public static int isBit(int i,int k) {
        if(((i>>(k-1)) & 1) == 1) {
            return 1;
        }else {
            return 0;
        }
    }
    public static void FindNumsAppearOnce(int [] array,int[] num1 , int[] num2) {
        if (array == null||array.length < 2) {
            return;
        }
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(isBit(array[i],findOne(xor(array))) == 1) {
                n1 ^= array[i];
            }else {
                n2 ^= array[i];
            }
        }
        num1[0] = n1;
        num2[0] = n2;
    }

    //一个整型数组里除了两个数字之外，其他的数字都出现了两次，
    // 找出这两个只出现一次的数字
    public static void main1(String[] args) {
        int[] array = {2,3,4,5,2,6,8,9,3,4,6,8};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce(array,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
