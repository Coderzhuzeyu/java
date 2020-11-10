package practise;

public class LoginUtil {

	private ILoginService loginService;//维持一个抽象策略类的引用

	public LoginUtil() {
		//先初始化三种登录方式
		PasswordLoinService passwordLoinService = new PasswordLoinService();
		
		SMSLoginService smsLoginService = new SMSLoginService();
		
		GestureLoginService gestureLoginService = new GestureLoginService();
	}
	
	//登录类型
	public boolean login(String type) {
		
		//根据登录类型，获取对应登录策略处理对象
		loginService = ILoginService.loginServerMap.get(type);
		
        return loginService.login();//调用算法
		
	}

}
