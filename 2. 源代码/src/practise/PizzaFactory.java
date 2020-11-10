package practise;

//工厂
public class PizzaFactory {
	
	public static Product getPizza(String type) {
		
		Product product = null;
		
		if(type.equals("1")) {
			product = new HamPizza();
		}else if(type.equals("2")){
			product = new CheesePizza();
		}else if(type.equals("3")) {
			product = new ChocolatePizza();
		}
		
		return product;
	}

}
