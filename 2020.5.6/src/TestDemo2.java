import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @program: 2020.5.6
 * @description:
 * @author: spdz
 * @create: 2020-05-07 15:32
 **/
public class TestDemo2 {

    //删除左右两边空格
    public static void main(String[] args) {
        String str = "   abc d  ef  ";
        String ret = str.trim();
        System.out.println(ret);
    }

    //截取
    public static void main6(String[] args) {
        String str1 = "ababcabcd";

        String ret = str1.substring(1);
        System.out.println(ret);

        String ret2 = str1.substring(1,7);
        System.out.println(ret2);
    }

    //替换
    public static void main5(String[] args) {
        String str1 = "ababcabcd";
        String ret = str1.replace('a','p');
        System.out.println(ret);
        String ret2 = str1.replaceAll("bc","c");//替换全部
        System.out.println(ret2);
        String ret3 = str1.replaceFirst("ba"," ");//把遇到的第一个替换掉
        System.out.println(ret3);
    }

    //字符串的比较
    public static void main4(String[] args) {
        String str1 = "ABCDef";
        String str2 = "abcdef";
        System.out.println(str1.equals(str2));//equals()比较是否相同
        System.out.println(str1.equalsIgnoreCase(str2));//equalsIgnoreCase()忽略大小写比较是否相同
        String str3 = "ebc";
        System.out.println(str3.compareTo(str2));//compareTo()比较大小
        //str3 > str2  正数
        //str3 <str2   负数
        //str3 == str2   0
    }


    //字符串 与 字节数组 的转换
    public static void main3(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        System.out.println(str);
        String str2 = "abcdef";
        byte[] bytes1 = str2.getBytes();//getBytes()将字符串变为字节数组
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = str2.getBytes("utf-8");//getBytes()还能进行编码转换处理
        System.out.println("=======================");
        System.out.println(Arrays.toString(bytes2));
    }

    //判断字符串是否全是数字
    public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main2(String[] args) {
        String str = "12345a6";
        boolean flg = func(str);
        System.out.println(flg);
    }

    //字符数组 与 字符串 的转换
    public static void main1(String[] args) {
        char[] val = {'a','b','c','d','e'};
        String str = new String(val);
        System.out.println(str);
        String str1 = new String(val,1,3);
        System.out.println(str1);
        String str2 = "hello";
        char ch = str2.charAt(0);//用charAt()拿到字符串的某个字符
        System.out.println(ch);
        char[] val2 = str2.toCharArray();//用toCharArray()将字符串变为字符数组
        System.out.println(Arrays.toString(val2));

    }
}
