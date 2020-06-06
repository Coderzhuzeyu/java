/**
 * @program: 
 * @description:
 * @author: 
 * @create: 
 **/

class Node {
    char val;
    Node left;
    Node right;
    Node(char val) {
        this.val = val;
    }
}
public class Tree {

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

    //前序遍历
    public void pre(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        pre(root.left);
        pre(root.right);
    }

    //中序遍历
    public void in(Node root) {
        if(root == null) {
            return;
        }
        pre(root.left);
        System.out.print(root.val + " ");
        pre(root.right);
    }


    //将二叉搜索树转换成一个排序的双向链表
    Node prev = null;
    public void convertChild(Node root) {
        if (root == null) {
            return ;
        }

        convertChild(root.left);
        root.left = prev;
        if (prev != null) {
            prev.right = root;
        }
        prev = root;
        convertChild(root.right);
    }

    public Node Convert(Node pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        convertChild(pRootOfTree);
        Node head = pRootOfTree;
        while (head.left != null) {
            head = head.left;
        }
        return head;
    }

    //打印单链表
    public void display(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.right;
        }
        System.out.println();
    }
}