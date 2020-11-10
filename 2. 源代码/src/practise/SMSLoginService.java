package practise;

public class SMSLoginService implements ILoginService {
	
	public SMSLoginService() {
        //把自己，和自己处理的loginType注册到缓存
      ILoginService.loginServerMap.put("2",this);
	}

	@Override
	public boolean login() {
		System.out.println("短信验证码登录成功");
		return true;
	}

}
