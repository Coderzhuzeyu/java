import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Coderzhuzeyu
 * Date: 2020-06-30
 * Time: 18:10
 */
public class TestDemo {

    public static String reverse(String str,int begin,int end) {
        char[] value = str.toCharArray();
        while (begin < end) {
            char tmp = value[begin];
            value[begin] = value[end];
            value[end] = tmp;
            begin++;
            end--;
        }
        //return new String(value);
        return String.copyValueOf(value);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }

    public static void main7(String[] args) {
        String str = "abcdefAd高";
        String ret = str.toLowerCase();
        System.out.println(ret.length());
        int[] array = {1,2,3,4,5};
        System.out.println(array.length);
        String string = "";//空串
        String string2 = null;//空对象
    }

    public static String func(String str) {
        String[] strings = str.split(" ");
        String ret = "";
        for(String s : strings) {
            ret += s;
        }
        return ret;
    }

    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ctr+d
        while(scan.hasNext()) {
            String str = scan.nextLine();
            //不能用next 遇到空格结束了
            String ret = func(str);
            System.out.println(ret);
        }
    }

    /**
     * 分割多次
     * @param args
     */
    public static void main5(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] strings1 = str.split("&");
        //[name=zhangsan]  [age=18]
        //  0                  1
        for ( String s1 :strings1 ) {
            String[] strings2 = s1.split("=");
            for (String s2 :strings2) {
                System.out.println(s2);
            }
        }
    }

    public static void main4(String[] args) {
        String str="Java-split#bit";
        String[] strings = str.split(" |-|#");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main3(String[] args) {
        String str = "192\\168\\1\\1";
        String[] strings = str.split("\\\\");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main2(String[] args) {
        String str = "abc de f";
        String[] strings = str.split(" ");
        //[abc] [de] [f]
        for (String s : strings) {
            System.out.println(s);
        }
    }
    public static void main1(String[] args) {
        String str = "ababcabcdabcde";
        int index = str.indexOf("abc",2);
        System.out.println(index);

        index = str.lastIndexOf("abc",3);
        System.out.println(index);

        boolean flg = str.startsWith("abc",2);
        System.out.println(flg);
        flg = str.endsWith("bcde");
        System.out.println(flg);
    }
}
