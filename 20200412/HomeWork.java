/*import java.util.Scanner;
import java.util.Random;*/
import java.util.*;//代表导入java.util下所有的包   lua  cocos2d
public class HomeWork {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 3;
		while (count != 0) {
			System.out.println("请输入你的密码：");
			String password = scan.nextLine();
			if(password.equals("123456")) {
				System.out.println("密码正确，登录成功！");
				break;
			}else {
				count--;
				System.out.println("你还有"+count+"次机会！");
			}
		}
	}


	public static void main10(String[] args) {
		for (int n = 1; n <= 999999;n++ ) {

			int count = 0;//123
			int tmp = n;
			while (tmp != 0) {//1
				tmp = tmp/10;//0
				count++;//3
			}

			//count == 3   n == 123
			tmp = n;//123  
			int sum = 0;
			while (tmp != 0) {
				sum += Math.pow(tmp%10,count);//3,count     2,count   1,count
				tmp = tmp/10;//0
			}
			
			if(sum == n) {
				System.out.println(sum+" is my result!");
			}
		}
	}

	public static void main9(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			//99
			if(i / 10 == 9) {
				count++;
			}else if(i % 10 == 9) {
				count++;
			}
		}
		System.out.println(count);
	}


	/**
	 * 1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 
	 * @param args [description]
	 */
	public static void main8(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double sum = 0;
		int flg = 1;

		for (int i = 1;i <= n ;i++ ) {
			sum = sum + 1.0/i * flg;
			flg = -flg;
		}
		System.out.println(sum);
	}


	public static void main7(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();//18

		int b = scan.nextInt();//2
		int c = b;
		while (a%b != 0) {
			c = a % b;//6
			a = b;//18
			b = c;//6
		}
		System.out.println(c);
	}


	public static void main6(String[] args) {
		for (int i = 1; i <= 9;i++ ) {
			for (int j = 1;j <= i;j++ ) {
				//System.out.print(" i*j= "+ i * j);
				System.out.print(i + "*" + j +"="+i*j +" ");
			}
			System.out.println();
		}
	}

	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int year = 1000; year <= n ;year++ ) {

			if(year%100!=0 && year%4==0 || year %400==0) {
				System.out.println(year+" 是闰年！");
			}

		}
	}


	public static void main4(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();


		for (int i = 1; i <= n;i++) {

			int j = 2;
			for (; j <= (int)Math.sqrt(i) ;j++ ) {
				if(i % j == 0) {
					//System.out.println(n+"  不是素数！");
					break;
				}
			}

			if(j > (int)Math.sqrt(i)) {
				System.out.println(i+" 是素数！");
			}
		}
	}


	public static void main3(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();


		/*for (int i = 2; i < n ;i++ ) {
			if(n % i == 0) {
				System.out.println(n+"不是素数！");
				break;
			}
		}*/

		/*for (int i = 2; i <= n/2 ;i++ ) {
			if(n % i == 0) {
				System.out.println(n+"不是素数！");
				break;
			}
		}*/

		for (int i = 2; i <= (int)Math.sqrt(n) ;i++ ) {
			if(n % i == 0) {
				System.out.println(n+"  不是素数！");
				break;
			}
		}

	}


	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		if(n <= 18) {

		}else if (n >= 19 && n <= 28) {
			
		}else if (n >= 29 && n <= 55) {
			
		}else {
			
		}

	}

	/**
	 * 猜数字：
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randNum = random.nextInt(100)+100;//[0-100)
		System.out.println(randNum);
		while (true) {
			System.out.println("请输入你要猜的数字：");
			int num = scan.nextInt();
			if(num < randNum) {
				System.out.println("你猜的数字小了！");
			}else if(num == randNum) {
				System.out.println("你猜的数字对了！");
				break;
			}else  {
				System.out.println("你猜的数字大了！");
			}
		}


	}
}