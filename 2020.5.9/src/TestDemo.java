import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: 2020.5.8
 * @description:字符串
 * @author: zhuzeyu
 * @create: 2020-05-08 20:17
 **/
public class TestDemo {

    //以n为界限翻转字符串
    public static String func(int n,String str) {
        if (str == null || n <= 0 || n >= str.length()) {
            return null;
        }
        str = reverse(str,0,n-1);
        str = reverse(str,n,str.length()-1);
        str = reverse(str,0,str.length()-1);
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        String ret = func(n,str);
        System.out.println(ret);
    }

    ////字符串逆置
    public static String reverse(String str,int begin,int end) {
        char[] array = str.toCharArray();
        while (begin < end) {
            char t = array[begin];
            array[begin] = array[end];
            array[end] = t;
            begin++;
            end--;
        }
        //return new String(array);
        return String.copyValueOf(array);
    }

    public static void main10(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }

    //字符串长度
    public static void main9(String[] args) {
        String str = "abcdefAd";
        System.out.println(str.length());//字符串长度是方法  length()
        int[] array = {1,2,3,4,5};
        System.out.println(array.length);//数组长度是属性  length
        String string = "";//空串
        System.out.println(string.isEmpty());//判断是否为空串（长度是否为0），不能判断空对象
        String string2 = null;//空对象

    }

    //字符串转大小写
    public static void main8(String[] args) {
        String str = "abcdefAd";
        String ret = str.toUpperCase();//字符串转大写（只对字母有效)
        System.out.println(ret);
        String ret2 = str.toLowerCase();
        System.out.println(ret2);//字符串转小写（只对字母有效)
        String str1 = "abcdefAd高";
        String ret1 = str1.toUpperCase();//只对字母有效。
        System.out.println(ret1);
    }

    //无冗余的连接字符串
    public static String func(String str){
        String[] strings = str.split(" ");
        String ret = "";
        for (String str1:strings) {
            ret += str1;
        }
        return ret;
    }

    public static void main7(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String ret = func(str);
            System.out.println(ret);
        }//ctrl+d结束循环

    }

    /**
     *  拆分字符串，拆分多次
     * @param args
     */
    public static void main6(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] strings1 = str.split("&");
        for (String s1:strings1) {
            String[] strings2 = s1.split("=");
            for (String s2:strings2) {
                System.out.println(s2);
            }
        }
    }

    //拆分字符串，拆分多次
    public static void main5(String[] args) {
        String str = "Java30-split#bit";
        String[] strings = str.split(" |-|#");
        for (String str2:strings) {
            System.out.println(str2);
        }
    }

    //拆分字符串(什么都不给，默认全拆,给了没有，不拆)
    public static void main4(String[] args) {
        String str = "192.168\\1.1";//  \\ 代表一个 \ （转义字符）

        String[] strings = str.split("");//什么都不给，默认全拆
        for (String str2:strings) {
            System.out.println(str2);
        }
        System.out.println("=======");
        String[] strings1 = str.split("5");//给了没有，不拆
        for (String str2:strings1) {
            System.out.println(str2);
        }
        System.out.println("=======");
        String[] strings2 = str.split("\\.");//转义字符
        for (String str2:strings2) {
            System.out.println(str2);
        }
        System.out.println("=======");
        String[] strings3 = str.split("\\\\");//转义字符
        for (String str2:strings3) {
            System.out.println(str2);
        }
    }

    //拆分字符串
    public static void main3(String[] args) {
        String str = "abc de f";
        String[] strings = str.split(" ");//以空格拆分
        for (String str2:strings) {
            System.out.println(str2);
        }
        System.out.println("============");
        String[] strings1 = str.split(" ",2);//以空格拆分为两组
        for (String str3:strings1) {
            System.out.println(str3);
        }
    }

    public static void main2(String[] args) {

        String str = "ababcabcdabcde";

        //判断子串是否存在
        boolean flg = str.contains("abc");
        System.out.println(flg);

        //查找子串位置
        int index = str.indexOf("abe");
        System.out.println(index);
        int i = str.indexOf("abc",2);
        System.out.println(i);
        int i2 = str.lastIndexOf("abc");
        System.out.println(i2);
        //从给定位置往前找，如果给定位置的字符属于要查找字符片段（子串）的一部分，则也能找到
        int i3 = str.lastIndexOf("abc",2);
        System.out.println(i3);
        int i4 = str.lastIndexOf("abc",1);
        System.out.println(i4);

        //判断字符串是否以子串开头
        boolean flg1 = str.startsWith("ab");
        System.out.println(flg1);
        boolean flg2 = str.startsWith("abc",2);
        System.out.println(flg2);

        //判断字符串是否以子串结尾
        boolean flg3 = str.endsWith("de");
        System.out.println(flg3);

    }


}
