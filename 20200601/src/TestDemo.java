import java.util.List;
import java.util.Scanner;

/**
 * @program: 2020.5.26
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-05-24 18:00
 **/
public class TestDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree("abc##de#g##f###");
        List<List<Character>> ret = binaryTree.levelOrder(root);
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        System.out.println("非递归前序遍历:");
        binaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.println("非递归中序遍历:");
        binaryTree.inOrderTraversal(root);
        System.out.println();
        System.out.println("非递归后序遍历:");
        binaryTree.postOrderTraversal(root);

    }

    public static void main1(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            Node root = binaryTree.buildTree(str);
            binaryTree.inOrderTraversal(root);
        }
    }

}
