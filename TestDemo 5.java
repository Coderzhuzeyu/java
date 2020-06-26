/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Coderzhuzeyu
 * Date: 2020-06-26
 * Time: 18:43
 */
public class TestDemo {
    /**
     * 从pos1位置  挪到 pos2位置
     * @param pos1
     * @param pos2
     */
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2+" ");
    }

    /**
     * @param n   盘子个数
     * @param pos1 起始位置
     * @param pos2 中途位置
     * @param pos3 目的地位置
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }

    public static void main(String[] args) {
        //1   A -> C        1        2^1 -1
        //2   A -> B   A->C   B->C     3    2^2 - 1
        //3   A->C     A->B   C->B    A-> C   B-> A   B-> C  A->C    7       2^3 -1
        //64   2^64 - 1   电脑 -》 300多年    人：更久
     /*   hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();*/
        hanoi(3,'A','B','C');
    }
}
