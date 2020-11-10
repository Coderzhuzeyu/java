package practise;

import java.util.Scanner;

public class PizzaShop extends AbstractSubject{
	
	public static void main(String[] args) {
		PizzaShop shop = new PizzaShop();
		
		Scanner scanner = new Scanner(System.in);
		
		//插入当前排队的顾客，待开店后通知前来选购商品
		shop.insert(new CustomerImpl());

		LoginUtil loginUtil = new LoginUtil();

		System.out.println("请选择登录方式");
		System.out.println("1.用户名密码登陆");
		System.out.println("2.短信验证码登陆");
		System.out.println("3.手势密码登陆");
		
		System.out.print("请选择:");
		
		//获取用户的登陆类型
		String type = scanner.nextLine();
		
		//策略模式实现登陆
		boolean result = loginUtil.login(type);
		
		//如果登陆成功，通知顾客可以进店购买物品（观察者模式）
		if(result) {
			System.out.println("披萨店：开始营业了");
			shop.operation();
			
			//简单工厂模式实现菜谱购买
			shop.initMenu();
		}
	}
	
	//初始化菜单信息
	public void initMenu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("**********菜品列表**********");
		System.out.println("1.火腿披萨");
		System.out.println("2.芝士披萨");
		System.out.println("3.巧克力披萨");
		
		System.out.print("请选择产品:");
		
		//获取用户选择的菜品
		String type = scanner.nextLine();
		
		//使用简单工厂模式获取菜品
		Product product = PizzaFactory.getPizza(type);
		
		product.finish();
	}

	@Override
	public void operation() {
		
		//通知所有顾客
		notifyObj();
	}

}
