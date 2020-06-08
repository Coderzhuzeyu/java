import java.util.Arrays;

/**
 * @program: 2020.6.8
 * @description:
 * @author: Coderzhuzeyu
 * @create: 2020-06-08 22:22
 **/

/**
 * 基于Comparble接口类的比较
 * 缺点: 每次业务不同，需要去修改类本身
 */
class Student2 implements Comparable<Student2>{
    public String name;
    public int age;
    public int score;

    public Student2(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //根据年龄比较
    @Override
    public int compareTo(Student2 o) {
        return this.age - o.age;
    }

//    public int compareTo(Student o){
//        return this.age - o.age;
//    }
}

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int compareTo(Student o) {
        return this.score - o.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("hehe",16,80);
        Student student2 = new Student("enen",18,60);
        Student student3 = new Student("arar",20,90);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        //Integer 是一个类，是int的扩展
        //数组中的 sort方法 比较的是 int类型，Integer类型实现了Comparable,
        //      所以可以用compareTo方法
        //现在要用 sort方法 比较Student类型，
        //      要先让 Student类型 实现 Comparable，重写compareTo方法
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
    }

    public static void main1(String[] args) {
        Student2 student1 = new Student2("hehe",16,80);
        Student2 student2 = new Student2("enen",18,60);
        if (student1.compareTo(student2) > 0) {
            System.out.println("学生1年龄 大于 学生2年龄");
        }else {
            System.out.println("学生2年龄 大于 学生1年龄");
        }
    }

}
