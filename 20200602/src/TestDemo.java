import java.util.Scanner;



/**
 * @program: 
 * @description:
 * @author: Coderzhuzeyu
 * @create: 
 **/
public class TestDemo {

    public static void main(String[] args) {
        Tree t = new Tree();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int al = scanner.nextInt();
            int[] arr = new int[al];
            int[] arr2 = new int[al];
            for (int i = 0; i < al; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < al; i++) {
                arr2[i] = scanner.nextInt();
            }
            int i = scanner.nextInt();
            if (i == 1) {
                Node root = t.buildTree(arr,arr2);
                t.post(root);
                System.out.println();
                System.out.println(t.tree2str(root));
            }else {
                Node root = t.buildTree2(arr,arr2);
                t.pre(root);
                System.out.println();
                System.out.println(t.tree2str(root));
            }

        }

    }
}
