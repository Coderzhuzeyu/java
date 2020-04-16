
public class TestDemo{

	public static void main(String[] args) {
		//int a = 10;
		//int b = a;
		long a = 10L;
		int b = (int)a;
		System.out.println(b);	
	}
/**
 * 常量只能初始化一次，且使用的时候一定要初始化
 * @param args [description]
 */
public static void main11(String[] args) {
	//int maxNum = 10;//变量命名用小驼峰
		final int MAXNum = 10;//
		System.out.println(MAXNum);
}
/**
 * 小于4个字节的数据类型 运行的时候 会发生类型的提升
 */
public static void main10(String[] args) {
	byte b = 10;
	byte c = 20;
	byte d = (byte)(b+c);
	System.out.println(d);
}

/**
 * 字符串数据类型：
 * String
 * @param args [description]
 */

	public static void main9(String[] args) {
		String Str = "\"hello\""; //"hello"
		System.out.println(Str); 
	}
/**
 * 布尔类型
 * 1.在java当中 布尔类型  没有明确的大小
 * 2.在java当中 布尔类型  只有两个取值  true  和  false
 * 3.在java当中  没有  所谓的 0是假  非0是真
 *    真只有 true  假只有false
 * 4.Boolean
 * @param args [description]
 */
public static void main8(String[] args) {
	boolean flg = false;
	System.out.println(flg);
}
/**
 * 短整型：short   2    -32768  到  32767
 * @param args [description]
 */
	public static void main7(String[] args) {
		short  sh = 12;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}
/**
 * 字节: byte   1个字节  数值   -128  -  127
 * 每一种数据类型  再给其赋值的时候  一定不能超过它的范围
 * @param args [description]
 */
public static void main6(String[] args) {
	byte b = 12;
	byte c = 21;
	System.out.println(b+" " + c);
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);

	System.out.println(Byte.MAX_VALUE+1);//默认  默认是以整型进行打印的
}
/**
 * 字符数据类型：
 *    char     2个字节 0-65535
 * Unicode-->它包含了很多， 比如: 中文，变得更大了。
 * Character
 * @param args [description]
 */
public static void main5(String[] args) {
	char ch = 'a';
	System.out.println(ch);

	char ch2 = '高';
	System.out.println(ch2);

	char ch3 = 97;
	System.out.println(ch3);
}

/**
 * 单精度  float
 * 1，double 8个字节  
 * 2，float  4个字节
 * @param args [description]
 */
public static void main4(String[] args) {
	float f = 12.3f;
	System.out.println(f);
}

/**
 * 双精度 浮点型
 * @param args [description]
 */
public static void main3(String[] args) {
	double d = 12.5;//12.5默认是双精度类型
	System.out.println(d);
	System.out.println(Double.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);

	int a = 1;
	int b = 2;
	System.out.println(a / b);

	double num = 1.1;
	System.out.println(num * num);

}








	/**
	 *String[] args:运行时命令行参数
	 * @param args [description]
	 */
public static void main2(String[] args) {
	
	for (int i = 0; i < args.length; i++){
		System.out.println(args[i]);
	}
	System.out.println("kaixin");
}


/**
 * 讲解长整型
 * @param args [description]
 */
	public static void main1(String[] args) {




		long a = 10L;

		System.out.println("a的值是："+ a);
		System.out.println("最大值:"+ Long.MAX_VALUE);//拼接
		System.out.println("最小值:"+ Long.MIN_VALUE);

		int b = 10;
		int c = 20;
		System.out.println(b+c);
		//注意：任何类型的数据 和 字符串进行拼接  结果就是字符串
		System.out.println("hhh"+b + c);
	}
}