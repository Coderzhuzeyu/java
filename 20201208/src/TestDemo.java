public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();

        binaryTree.getSize1(root);
        System.out.println("结点的个数："+ BinaryTree.size);
        System.out.println("结点的个数："+ binaryTree.getSize2(root));

        binaryTree.getLeafSize1(root);
        System.out.println("叶子节点的个数："+BinaryTree.leafSize);
        System.out.println("叶子节点的个数："+binaryTree.getLeafSize2(root));


        System.out.println("=======第k层的节点个数==========");
        System.out.println(binaryTree.getKLeafSize(root, 3));
        System.out.println("查找节点val：");
        Node ret = binaryTree.find(root,'E');
        System.out.println(ret.val);


        System.out.println("=========层序遍历=============");
        binaryTree.levelOrderTraversal(root);
    }

}
