import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @program: 2020.5.6
 * @description: String
 * @author: 


    //利用反射--》自省的过程    反射（通过 反射 能修改 私有的）
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "hello";
        Class c1 = String.class;//1、通过class拿到class对象（这里是String的class对象）
        //2、通过getDeclaredField()拿到你要拿的字段（这里是String 的 value字段）
        Field field = c1.getDeclaredField("value");
        field.setAccessible(true);//3、通过setAccessible(true)获得权限
        char[] val = (char[]) field.get(str);//4、通过get()拿到要修改的
        val[0] = 'g';//5、修改
        System.out.println(str);
    }

    public static void main10(String[] args) {
        String str = "hello";
        str = "h" + str.substring(1);
        System.out.println(str);//没有改变原来的字符串，而是有生成了一个
    }

    public static void main9(String[] args) {
        String str = "hello";
        str = str + "world";
        str += "!!!";
        System.out.println(str);
        for (int i = 0; i < 10; i++) {
            str += 1;
        }//这样拼接会造成大量的临时变量
    }
    
    public static void main8(String[] args) {
        String str1 = "hello";
        // intern() 手动入池
        //  当前的这个字符串在常量池中是否存在？
        //      存在  把常量池中的引用赋值给当前的引用类型变量
        //     不存在 把字符串在常量池中生成，再把引用赋值给当前的引用类型变量
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);//true
    }

    public static void main7(String[] args) {
        String str1 = null;
        String str2 = new String("hello");

        System.out.println(str1.equals(str2));//NullPointerException
        System.out.println(str2.equals(str1));//false

        String str3 = "hello";
        System.out.println(str3.equals("hello"));

        System.out.println("hello".equals(str3));//方法更好
    }

    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
        String str3 = "hello";
        System.out.println(str1 == str3);//true
        System.out.println(str1.equals(str3));//true
    }

    public static void func(String str,char[] ch) {
        str = "abcdef";
        ch[0] = 'g';
    }

    public static void main5(String[] args) {
        String str1 = "hello";
        char[] ch1 = {'a'};
        System.out.println(str1);//hello
        System.out.println(Arrays.toString(ch1));//a
        System.out.println(str1);//hello
        System.out.println(Arrays.toString(ch1));//g
    }

    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1);//hello
        System.out.println(str2);//hello

        str1 = "abc";

        System.out.println(str1);//abc
        System.out.println(str2);//hello
    }

    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";// 常量 在编译时期已经被处理
//        final int a = 10;
//        int c = a + 30;
        System.out.println(str1 == str2);//true
        String str3 = new String("hel") + "lo";
        System.out.println(str1 == str3);//false
    }

    /**
     * 字符串常量池:
     *      放在堆里
     *      内容不重复的
     *
     * @param args
     */
    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//false

        String str3 = "hello";
        System.out.println(str1 == str3);//true

        System.out.println(str1.equals(str2));
    }

    public static void main1(String[] args) {
        String str1 = "hello";
        System.out.println(str1);
        String str2 = new String("abcdef");
        System.out.println(str2);
        char[] val = {'a','b','c','d','e','f'};
        String str3 = new String(val);
        System.out.println(str3);
        String str4 = new String(val,1,4);
        System.out.println(str4);
    }
}
