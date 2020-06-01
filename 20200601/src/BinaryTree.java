import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: 2020.5.26
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-05-24 16:51
 **/

class Node {
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}

public class BinaryTree {

    //根据 前序遍历 的结果 构建二叉树
    int i = 0;
    public Node buildTree(String str) {
        Node root = null;
        if (str.charAt(i) != '#') {
            root = new Node(str.charAt(i));
            i++;
            root.left = buildTree(str);
            root.right = buildTree(str);
        }else {
            i++;
        }
        return root;
    }

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
        C.right = G;
        E.right = H;
        return A;
    }

    // 非递归 前序遍历
    public void preOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }

    }

    // 非递归 中序遍历
    public void inOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.print(top.val + " ");
            cur = top.right;
        }
    }

    // 非递归 后序遍历
    public void postOrderTraversal(Node root){
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                System.out.print(cur.val + " ");
                stack.pop();
                prev = cur;
                cur = null;
            }else {
                cur = cur.right;
            }
        }
    }

    //层序遍历
    public List<List<Character>> levelOrder(Node root) {
        List<List<Character>> ret = new LinkedList<>();
        if (root == null) {
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Character> list = new LinkedList<>();
            while(size > 0) {
                Node cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }

    //给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null)  return null;
        if (root == p || root == q) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if (left != null && right != null) {
            return root;
        }else if (left != null) {
            return left;
        }else {
            return right;
        }
    }
}
