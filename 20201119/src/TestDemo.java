class Person{
    private String name;
    private int age;

    public Person(){
        System.out.println("Person<init>");
    }

    /*public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
    }*/
    //alt + insert(自动加构造方法)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
    }
    public void eat() {
        System.out.println(this.getName());
        System.out.println(this.age);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);
        Person person2 = new Person("bit",19);
        System.out.println(person2);
    }
}
