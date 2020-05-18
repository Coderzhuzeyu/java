/**
 * @program: 2020.4.29
 * @description:多态
 * @author: zhuzeyu
 * @create: 2020-04-29 16:54
 **/

/**
 * 向上转型
 *     向上转型->父类引用  引用子类对象
 *     生向上转型的时机：
 *        a.直接赋值
 *        b.传参
 *        c.返回值
 *     向上转型后  通过父类的引用  只能访问父类自己的方法或属性
 *     父类引用  只能访问自己特有的
 *
 * 重写：override（覆盖/覆写）
 *        1.方法名相同
 *        2.返回值相同
 *        3.参数列表相同
 *    不同的类-》继承关系上
 *    调用时用的是 子类的重写方法
 *    重写的注意事项：
 *        1.需要重写的方法  不能被final修饰。被final修饰后 他是密封方法 不可以修改
 *        2.被重写的方法，访问修饰限定符一定不能是私有的
 *        3.被重写的方法，子类当中的访问修饰限定 要 大于等于 父类的访问修饰限定
 *                  (private < 默认权限(default) < protected < public)
 *        4.被static修饰的方法是不可以被重写的
 *
 *  运行时绑定（也叫动态绑定）：
 *      1.父类引用  引用子类对象（向上转型）。同时 父类对象引用调用同名的覆盖方法（重写）
 *      此时就会发生运行时绑定。
 *      2.子类帮父类构造时，父类构造方法中调用了父类的func方法，子类中也有同名的覆盖方法（重写）
 *      此时就会发生运行时绑定。（构造方法 中也 可以发生 动态绑定）
 *
 *  反编译java代码:
 *      javap -c 类名
 *
 *  向下转型-》 将父类的引用  赋值给  子类
 *      注意：向下转型非常不安全 很少会使用
 *      关键字  instanceof
 *              A instanceof B  判断 A 是不是 B 的一个实例
 */

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
        //System.out.println("Animal(String)");
        eat();
    }
    //重写
    public void eat() {
        System.out.println(this.name + "Animal::eat()");
    }
}

class Cat extends Animal {
    public int count = 99;
    public Cat(String name){
        super(name);//显式调用 并不是继承了父类的构造方法

        //super.data;//（直接）访问父类的属性
        System.out.println(super.name + "Cat(String)");
    }

    //重写
    public void eat() {
        //this.data  :调用当前对象的属性 （例如 this.name）（先查找本类，如果本类没有，就调用父类）
        System.out.println(this.name + "的示例法cat::eat()");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        //this.data  :调用当前对象的属性 （例如 this.name）（先查找本类，如果本类没有，就调用父类）
        System.out.println(this.name + "Bird::fly()");
    }
}


public class TestMain {

    /**
     * 运行时绑定：
     *    1.子类帮父类构造
     *    2.父类构造方法中调用了父类的func方法
     *    3.子类中也有同名的覆盖方法（重写）
     */
    public static void main(String[] args) {
        Cat cat = new Cat("八哥");
        //cat.eat();
    }

    /**
     * 向下转型-》 将父类的引用  赋值给  子类
     * 演示 不安全的向下转型
     * @param args
     */
    public static void main7(String[] args) {
        Animal animal = new Cat("八哥");

        // A instanceof B  判断 A 是不是 B 的一个实例
        if(animal instanceof Bird){
            Bird bird = (Bird)animal;
            bird.fly();
        }else {
            System.out.println("hhhh");
        }

//        Bird bird = (Bird)animal;//  ClassCastException:类型转换异常
//        bird.fly();
    }

    /**
     * 向下转型
     * 向下转型-》 将父类的引用  赋值给  子类
     * 注意：向下转型非常不安全 很少会使用
     * @param args
     */
    public static void main6(String[] args) {
        Animal animal = new Bird("八哥");
        animal.eat();

        //animal.fly();//error  通过父类的引用  只能访问父类自己的方法或属性

        //向下转型-》 将父类的引用  赋值给  子类
        Bird bird = (Bird) animal;//强转
        bird.fly();
    }

    /**
     * 多态
     * 向上转型
     * 重写：override
     * 运行时绑定(也叫动态绑定)
     * @return
     */

    //运行时绑定(也叫动态绑定)
    public static void main5(String[] args) {
        Animal animal = new Cat("咪咪");//向上转型
        animal.eat();//重写
    }

    //向上转型
    //向上转型->父类引用  引用子类对象
    //发生向上转型的时机：
    //   a.直接赋值
    //   b.传参
    //   c.返回值
    //向上转型后  通过父类的引用  只能访问父类自己的方法或属性
    //父类引用  只能访问自己特有的


    //返回值
    public static Animal func(){
        /*Cat cat = new Cat("咪咪");
        return cat;*/
        return new Cat("咪咪");
    }
    public static void main4(String[] args) {
        Animal animal = func();
        animal.eat();
    }

    //传参
    public static void func(Animal animal){
        animal.eat();
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("咪咪");
        func(cat);
    }

    //直接赋值
    public static void main2(String[] args) {
        //向上转型->父类引用  引用子类对象
        Animal animal = new Cat("咪咪");//直接赋值
        animal.eat();
        //animal.count;//error  向上转型后  通过父类的引用  只能访问父类自己的方法或属性
        //父类引用  只能访问自己特有的
    }

    public static void main1(String[] args) {
        Animal animal = new Animal("豆豆");
        Cat cat = new Cat("咪咪");
    }
}
