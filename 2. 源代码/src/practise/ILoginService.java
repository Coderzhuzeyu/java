package practise;

import java.util.HashMap;
import java.util.Map;

//抽象策略类
public interface ILoginService {
	// 缓存登录方式和处理策略对象的关系
	Map<String, ILoginService> loginServerMap = new HashMap();

	/**
	 * 登录
	 * 
	 * @return
	 */

	boolean login();
}

