import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: 
 * @description:二叉树
 * @author: Coderzhuzeyu
 * @create: 
 **/

class Node {
    int val;
    Node left;
    Node right;
    public Node (int val) {
        this.val = val;
    }
}


public class Tree {

    //二叉树最大宽度
    //每一层的宽度被定义为两个端点之间的长度
    //    （该层最左和最右的非空节点，两端点间的null节点也计入长度）
    public int widthOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        int maxWidth = 1;
        Queue<Node> queue = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        queue.offer(root);
        linkedList.add(0);
        int size = 1;
        while (!queue.isEmpty()) {
            while (size > 0) {
                Node cur = queue.poll();
                size--;
                int index = linkedList.removeFirst();
                if (cur.left != null) {
                    queue.offer(cur.left);
                    linkedList.add(2*index + 1);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                    linkedList.add(2*index + 2);
                }
            }
            size = queue.size();
            if (linkedList.size() >= 2){
                int num = linkedList.getLast() - linkedList.getFirst() + 1;
                maxWidth = Math.max(maxWidth,num);
            }
        }
        return maxWidth;
    }

    //是否是一个完全二叉树
    public boolean isCompleteTree(Node root) {
        if (root == null) {
            return false;
        }
        LinkedList<Node> linkedList = new LinkedList<>();
        linkedList.add(root);
        Node cur = linkedList.removeFirst();
        while (cur != null) {
            linkedList.add(cur.left);
            linkedList.add(cur.right);
            cur = linkedList.removeFirst();
        }
        while (!linkedList.isEmpty()) {
            if (linkedList.removeLast() != null) {
                return false;
            }
        }
        return true;
    }
}
