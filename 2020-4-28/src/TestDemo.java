//import com.bit.demo1.Test;
import com.bit.demo1.TestDemo3;
import com.bit.demo2.Animal;

/**
 * @program: 2020.4.28
 * @description:继承、访问修饰限定符
 * @author: 
 * @create: 2020-04-27 17:43
 **/

public class TestDemo extends Animal {

    public void func(){
        Animal animal = new Animal();
        //System.out.println(animal.name);//错误
        // protected  不同包中的子类可以访问（用super）
        System.out.println(super.name);
    }

    public static void main(String[] args) {

    }

    public static void main1(String[] args) {
//        //Test类 在  demo1包  的  TestDemo3.java 类中
//        //是包访问权限
//        //不能在 demo1包 外访问
//        Test test = new Test();
//        System.out.println(test.a);//错误

//        TestDemo3 test = new TestDemo3();
//        System.out.println(test.b);//错误 b 是包访问权限
    }
}
