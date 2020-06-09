import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: 2020.6.9
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-09 19:50
 **/

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(int val) {
        this.val = val;
    }
}

public class BinaryTree {

    public Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        //C.right = G;
        //E.right = H;
        return A;
    }


    // 获取二叉树的高度
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return left > right ? left : right;
    }

    //平衡二叉树 ： 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1
    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.abs(left - right) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right);
    }

    //二叉树左右子树是否相等
    public boolean isSymmetricChild(Node left , Node right) {
        if (left != null && right == null || left == null && right != null) {
            return false;
        }
        if (left == null && right == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetricChild(left.left,right.right)
                && isSymmetricChild(left.right,right.left);
    }

    //对称二叉树
    public boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    public Node find(Node root, char val){
        if (root == null) {
            return null;
        }
        if (val == root.val) {
            return root;
        }
        Node left = find(root.left,val);
        if (left != null) {
            return left;
        }
        Node right = find(root.right,val);
        if (right != null) {
            return right;
        }
        return null;
    }

    // 层序遍历
    public void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.print(cur.val + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }

    // 层序遍历
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        if (root == null) {
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
             int size = queue.size();
             List<Integer> list = new ArrayList<>();
             while (size > 0) {
                 Node cur = queue.poll();
                 if (cur != null) {
                     list.add(cur.val);
                     if (cur.left != null) {
                         queue.offer(cur.left);
                     }
                     if (cur.right != null) {
                         queue.offer(cur.right);
                     }
                 }
                 size--;
             }
             ret.add(list);
        }
        return ret;
    }


    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree(Node root){
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur == null) {
                break;
            }
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        while (!queue.isEmpty()) {
            Node cur2 = queue.peek();
            if (cur2 != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }
}
