package practise;

public class GestureLoginService implements ILoginService {
	
	public GestureLoginService() {
        //把自己，和自己处理的loginType注册到缓存
      ILoginService.loginServerMap.put("3",this);
	}

	@Override
	public boolean login() {
		System.out.println("手势密码登录成功");
		return true;
	}

}

