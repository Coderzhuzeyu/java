package practise;

public class PasswordLoinService implements ILoginService {
	
	public PasswordLoinService() {
        //把自己，和自己处理的loginType注册到缓存
      ILoginService.loginServerMap.put("1",this);
	}

	@Override
	public boolean login() {
		System.out.println("用户名密码成功登陆");
		return true;
	}

}


