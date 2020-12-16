class Node {
    public char val;
    public Node left;//左孩子-》左子树
    public Node right;//又孩子-》右子树

    public Node(char val) {
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
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    // 前序遍历   递归来实现
    void preOrderTraversal(Node root) {
        if (root == null) {//根节点为空
            return;
        }
        System.out.print(root.val + " ");//先打印空节点
        preOrderTraversal(root.left);//开始递归分别传入的是root的左结点  右节点
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    //遍历思想-求节点个数
    static int size = 0;

    void getSize1(Node root) {
        if (root == null) {
            return;
        }// //用root遍历
        getSize1(root.left);
        getSize1(root.right);
        size++;//不为空都加加
    }


    // 子问题思路-求结点个数
    int getSize2(Node root) {
        if (root == null) {
            return 0;
        }
        //return左数的节点个数 + 右数的节点个数 + 自己本身
        return getSize2(root.left) + getSize2(root.right) + 1;

    }

    // 遍历思路-求叶子结点个数   —》叶子结点 左孩子、右孩子都为空
    static int leafSize = 0;
    void getLeafSize1(Node root) {
        if (root == null) {
            return;
        }
        //用前序遍历找叶子节点->叶子结点 左孩子、右孩子都为空
        if (root.left == null && root.right == null) {
            leafSize++;
        } else {//左孩子、右孩子有一个不为空就不是叶子结点  开始遍历
            getLeafSize1(root.left);
            getLeafSize1(root.right);

        }
    }

        // 子问题思路-求叶子结点个数
        int getLeafSize2 (Node root){
            if (root == null) {
                return 0;
            }
            //如果左结点为空并且右节点为空 则为叶子节点
            if (root.left == null && root.right == null) {
                return 1;//只有一个叶子
            }//其它情况左边或者右边只要1个不为空 就去遍历每一个节点  前序遍历
            //叶子结点的个数 = 左边叶子节点的个数 +右边叶子节点的个数
            return getLeafSize2(root.left) + getLeafSize2(root.right);
        }

        //求第k层的节点个数
    /*子问题规模
    *相当于左树的地k-1层 + 右树的第k-1层
    * 递归终止条件为k为1   eg：原来k为3 下一次k为2 在下次递归k为1   也就相当于左树的左树第1层 + 右树的右树第1层
     */
        int getKLeafSize(Node root,int k) {
        if (root == null) {
            return 0;
        }else if (k == 1) {//递归到了最终要找的那一层
            return 1;
        }else {//整个树的第k层 相当于左树的地k-1层 + 右树的第k-1层
            return getKLeafSize(root.left,k-1) +getKLeafSize(root.right,k-1);
        }
        }

        //获取二叉树的高度
    /*
    * 找到当前树的左树的高度和右树的高度取最大值 + 1
    * */
    int getHeight(Node root) {
            if (root == null) {//  结点不固定 一旦结点为空 返回0
                return 0;
            }
            int leftHeight = getHeight(root.left);//先记录下左树的高度
            int rightHeight = getHeight(root.right);
            //当前树的左树的高度和右树的高度取最大值 + 1
            return leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;

    }
    // 查找 val 所在结点，没有找到返回 null
// 按照 根 -> 左子树 -> 右子树的顺序进行查找   前序遍历
// 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, char val){
        if (root == null) {
            return null;
        }
        //1、判断根节点是否是查找的数字val
        if (root.val == val) {
            return root;
        }
        //2、如果根节点不是val 去左边找
        //递归-》左边全部递归完成后 -》返回值是否是空
        Node left = find(root.left,val);
        if (left != null) {
            return left;
        }
        //2、如果根节点不是val 去左边找
        //递归-》左边全部递归完成后 -》返回值是否是空
        Node right = find(root.right,val);
            if (right != null) {
                return right;
            }
            return null;//两边都没找到返回空
    }
}


