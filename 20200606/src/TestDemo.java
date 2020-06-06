/**
 * @program: 
 * @description:
 * @author: 
 * @create: 
 **/

public class TestDemo {

    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.buildTree();
        t.pre(root);
        System.out.println();
        t.display(t.Convert(root));
    }
}

