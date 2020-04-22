import java.util.Scanner;

public class TestDemo{

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for (int j = 1;j <= num;j++) {

			int ret = 1;
			for(int i = 1;i <= j;i++){
				ret*=i;
				}

			sum += ret;
		}

		System.out.println(sum);	

}
	public static void main1(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		while (num <= 100) {
			if(num % 15 == 0){
				System.out.println(num);
				//break;
				continue;
			}
			System.out.println("hhhhhh");
			num++;
		}

	}
}