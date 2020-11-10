package practise;

//抽象目标类
public interface ISubject {
	 /*增加观察者*/  
    public void insert(IHuman observer);  
      
    /*删除观察者*/  
    public void remove(IHuman observer);  
      
    /*通知所有的观察者*/  
    public void notifyObj();  
      
    /*自身的操作*/  
    public void operation();  
}
