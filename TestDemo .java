import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Coderzhuzeyu
 * Date: 2020-06-16
 * Time: 17:49
 */
class Person {
    private int age;
}
public class TestDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello";
        //利用反射--》自省的过程  反射
        Class cl = String.class;
        Field field = cl.getDeclaredField("value");
        field.setAccessible(true);
        char[] val = (char[])field.get(str);
        val[0] = 'g';
        System.out.println(str);
    }
    public static void main10(String[] args) {
        String str = "Hello";
        //str = "hello";
        str = "h" + str.substring(1);
        System.out.println(str);
    }
    public static void main9(String[] args) {
        String str = "hello" ;
        str = str + " world" ;
        str += "!!!" ;
        System.out.println(str);
        for (int i = 0; i < 1_0000; i++) {
            //不敢这样拼接字符串   StringBuffer  StringBuilder
            str+=1;
        }
    }

    public static void main8(String[] args) {
        String str2 = new String("hello").intern();
        String str1 = "hello";
        System.out.println(str1 == str2);//比较的是引用
    }

    public static void main7(String[] args) {
        String str1 = "hello";
        System.out.println(str1.equals("hello"));//1

        System.out.println("hello".equals(str1));//2
    }

    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//比较的是引用
        System.out.println(str1.equals(str2));//比较的是字符串的内容

        String str3 = "hello";
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }

    public static void func(String str,char[] array){
        str = "abcdef";
        array[0] = 'g';
    }
    public static void main5(String[] args) {
        String str1 = "hello";
        char[] val = {'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);//
        System.out.println(Arrays.toString(val));
    }

    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);

        str1 = "abc";

        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "hel"+"lo";
        /*final int a = 10;
        int c = a+30;*/
        System.out.println(str1 == str2);//true
        String str3 = new String("hel")+"lo";
        System.out.println(str3 == str1);//false
    }

    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//false

        String str3 = "hello";
        System.out.println(str1 == str3);//true
    }

    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
        String str2 = new String("abcdef");
        System.out.println(str2);
        char[] val = {'a','b','c','d','e','f'};
        String str3 = new String(val);
        System.out.println(str3);
    }
}
