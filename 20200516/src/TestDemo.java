/**
 * @program: 20200516
 * @description: ${description}
 * @author: zhuzeyu
 * @create: 2020-05-16 13:18
 **/
public class TestDemo {
   /*
   *字符串的 + 操作, 表示字符串拼接:
   * */
   public static void main1(String[] args) {
      String a = "hello";
      String b = "world";
      String c = a + b;
      System.out.println(c);
   }
/*
*字符串和整数进行拼接:
* */
public static void main2(String[] args) {
   String str = "result = ";
   int a = 10;
   int b = 20;
   String result = str + a + b;
   System.out.println(result);
}



   public static void main3(String[] args) {
      int a = 10;
      int b = 20;
      System.out.println("a = " + a + ",b = " + b);
   }

/*
* 变量命名推荐 小驼峰命名法, 当一个变量名由多个单词构成的时候,
 * 除了第一个单词之外, 其他单词首字母都大写.
* */
public static void main4(String[] args) {
   int maxValue = 100;
   String studentName = "张三";
   System.out.println(studentName);
}
/*
* byte 表示的数据范围是 -128 -> +127
* */



/*
* 1. 如果不取自增运算的表达式的返回值, 则前置自增和后置自增没有区别.
* 2. 如果取表达式的返回值, 则前置自增的返回值是自增之后的值, 后置自增的返回值是自增之前的值.
* */
   public static void main5(String[] args) {
      int a = 10;
      int b = ++a;
      System.out.println(b);
      int c = a++;
      System.out.println(c);
   }

   public static void main6(String[] args) {
      //& 和 | 如果操作数为 boolean 的时候, 也表示逻辑运算. 但是和 && 以及 || 相比, 它们不支持短路求值.
      System.out.println(10 > 20 & 10 / 0 == 0); // 程序抛出异常
      System.out.println(10 < 20 | 10 / 0 == 0);// 程序抛出异常
   }

   /*
   * 进行按位运算, 需要先把10和20转成二进制，分别为1010,10100
   *
   * */
   public static void main(String[] args) {
      int a = 10;
      int b = 20;
      System.out.println(a & b);
   }


/*
* 判断一个数字奇数还是偶数
* */





}
