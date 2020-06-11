/**
 * @program: 2020.6.11
 * @description:
 * @author:  Coderzhuzeyu
 * @create: 2020-06-11 21:02
 **/

class Animal{
    public void func() {
        System.out.println("Animal::func");
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        new Animal().func();//Animal::func

        new Animal() {

        }.func();//Animal::func

        //匿名内部类
        new Animal() {
            @Override
            public void func() {
                System.out.println("重写了func方法");
            }
        }.func();//重写了func方法

        Animal animal = new Animal();
        animal.func();//Animal::func
    }
}
