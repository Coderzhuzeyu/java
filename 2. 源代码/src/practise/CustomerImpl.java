package practise;

public class CustomerImpl implements IHuman{
	
	@Override
	public void message() {
		System.out.println("顾客：消息已收到，马上就去");
	}

}
