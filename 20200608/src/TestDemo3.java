/**
 * @program: 2020.6.8
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-08 23:34
 **/

/**
 * 基于比较器比较
 */
class Person{
    public String name;
    public int age;
    public int score;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        Person person1 = new Person("hehe", 16, 80);
        Person person2 = new Person("enen", 18, 60);

        AgeComparator ageComparator = new AgeComparator();

        System.out.println(ageComparator.compare(person1 , person2));

    }
}