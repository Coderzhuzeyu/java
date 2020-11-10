package practise;

import java.util.ArrayList;
import java.util.List;

//具体目标类
public abstract class AbstractSubject implements ISubject {  
  
    private List<IHuman> list = new ArrayList<IHuman>();  
    
    @Override
    public void insert(IHuman observer) {  
    	list.add(observer);  
    }  
  
    @Override
    public void remove(IHuman observer) {  
    	list.remove(observer);  
    }  

    //实现响应方法
    @Override
    public void notifyObj() {
        for (IHuman iObserver : list) {
			iObserver.message();
		}
    }  
}
