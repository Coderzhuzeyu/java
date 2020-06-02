/**
 * @program: 
 * @description:
 * @author: Coderzhuzeyu
 * @create: 
 **/

class Node {
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
    }
}

public class Tree {

    //根据一棵树的前序遍历与中序遍历构造二叉树
    public int index = 0;
    public Node buildTreeChild(int[] preorder,int[] inorder,int begin,int end) {
        if(begin > end) {
            return null;
        }
        Node root = new Node(preorder[index]);
        int rootIndex = findIndexOfInder(preorder[index],inorder,begin,end);
        index++;
        if (rootIndex == -1) {
            return null;
        }
        root.left = buildTreeChild(preorder, inorder, begin, rootIndex-1);
        root.right = buildTreeChild(preorder, inorder, rootIndex+1, end);
        return root;
    }

    public int findIndexOfInder(int val,int[] inorder,int begin,int end) {
        for (int i = begin; i <= end; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public Node buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null) {
            return null;
        }
        if (preorder.length <= 0 || inorder.length <= 0) {
            return null;
        }
        return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }


    //根据一棵树的中序遍历与后序遍历构造二叉树
    public int index2 = 0;
    public Node buildTreeChild2(int[] postorder,int[] inorder,int begin,int end) {
        if (begin > end) {
            return null;
        }
        int index3 = postorder.length - 1 - index2;
        Node root = new Node(postorder[index3]);
        int rootIndex = findIndexOfInder(postorder[index3],inorder,begin,end);
        index2++;
        if (rootIndex == -1) {
            return null;
        }
        root.right = buildTreeChild2(postorder,inorder,rootIndex+1,end);
        root.left = buildTreeChild2(postorder,inorder,begin,rootIndex-1);
        return root;
    }

    public Node buildTree2(int[] inorder, int[] postorder) {
        if (postorder == null || inorder == null) {
            return null;
        }
        if (postorder.length <= 0 || inorder.length <= 0) {
            return null;
        }
        return buildTreeChild2(postorder,inorder,0,inorder.length-1);
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
        in(root.left);
        System.out.print(root.val + " ");
        in(root.right);
    }

    //后序遍历
    public void post(Node root) {
        if (root == null) {
            return;
        }
        post(root.left);
        post(root.right);
        System.out.print(root.val + " ");
    }

    //一个二叉树转换成一个由括号和整数组成的字符串
    public void tree2strChild(Node t,StringBuffer sb) {
        if (t == null) {
            return;
        }
        sb.append(t.val);
        if (t.left == null) {
            if (t.right != null) {
                sb.append("()");
            }else {
                return;
            }
        }else {
            sb.append("(");
            tree2strChild(t.left,sb);
            sb.append(")");
        }
        if (t.right == null) {
            return;
        }else {
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }
    }

    public String tree2str(Node t) {
        StringBuffer sb = new StringBuffer();
        tree2strChild(t,sb);
        return sb.toString();
    }
}
