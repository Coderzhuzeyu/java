import java.util.Scanner;
public class TestDemo{
//5阶乘的和  5!+4!+3!+2!+1!
public static void main(String[] args) {
	int num = 5;
	int i = 1;
	int ret = 1;
	int sum = 0;
	while(i <= num){
		ret*=i;
		i++;
		m+=ret;
	}
	System.out.println(sum);
} 

	//5!=  5*4*3*2*1
	
public static void main10(String[] args) {
	int i = 1;
	int ret = 1;
	while(i <= 5){
		ret*=i;
		i++;
	}
	System.out.println(ret);
}

	/**
	 * 面试问题：
	 * 不能做switch参数的类型有哪些？
	 * long float double boolean
	 *
	 * break尽量不要省略
	 * @param args [description]
	 */

	public static void main9(String[] args) {
		int a = 1;
		switch(a){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("请输入正确的数字! ");
				break;

		}
	}

public static void main8(String[] args) {
	//else只会和最近的if 结合
	int x = 10;
	int y = 10;
	if (x == 10) 
	 	if (y == 10)
	 		System.out.println("aaa");
		else
	 		System.out.println("bbb");



}



	public static void main7(String[] args) {
		Scanner scan = new Scanner(System.in);
		//退出循环->使用场景   OJ   笔试的环境
		//退出循环 1.Ctrl+C(直接中断程序)     2.Ctrl+D(正常退出)
		while (scan.hasNext()) {
			int year = scan.nextInt();
		if((year%4==0 && year%100!=0) ||(year%400==0)) {
			System.out.println("闰年!");
		}else{
			System.out.println("不是闰年!");
		}
	}

}
		


	public static void main6(String[] args) {
		int a = 10; 
		if(a == 10) {
		System.out.println("hello");	
	}
}

public static void main5(String[] args) {
	Scanner scan = new Scanner(System.in);
	//String str = scan.nextLine();
	String str = scan.next();
	System.out.println(str);
}


public static void main4(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	System.out.println(a);

	String str = scan.next();
	System.out.println(str);
}


	public static void main3(String[] args) {
		/*int i = 10;
		i = i++;
		System.out.println(i);*/
		/*int a = 10; 
		int b = 20; 
		System.out.println(a == b); 
		System.out.println(a != b);   
		System.out.println(a < b); 
		System.out.println(a > b); 
		System.out.println(a <= b); 
		System.out.println(a >= b);*/
		System.out.println(10 > 20 && 10 / 0 == 0); 

		System.out.println(10 < 20 || 10 / 0 == 0);
	}
		/*int a = 10; 
		int b = 20; 
		System.out.println(!(a < b));
		boolean flg = true;
		System.out.println(!flg);// !只能作用于bolean类型
	}*/





public static void main2(String[] args) {
		
		/*System.out.println(10%3);
		System.out.println(-10%3);
		System.out.println(10%-3);
		System.out.println(-10%-3);*/


		int a = 10;
		int b = ++a;//a=11   b = a
		System.out.println(b);
		int c = a++;//c = a; a = a+1;  12
		System.out.println(c);//11

}



	public static void main1(String[] args) {
		
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println((float)5/2);
		System.out.println((float)(5/2));
		
	}
}
