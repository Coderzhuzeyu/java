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
    }

}
