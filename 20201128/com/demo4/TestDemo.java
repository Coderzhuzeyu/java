package com.demo4;

import java.util.Arrays;
/**
 *    接口的使用实例：
 *    一般情况下：自定义类型进行比较 需要是 可比较的。
 *    Comparable   Comparator  有区别的！！！
 */
class Student implements Comparable<Student> {
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score) {
            return 1;
        }else if(this.score == o.score) {
            return 0;
        }else {
            return -1;
        }
        //return 0;
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Student student1 = new Student("bit",18,79);
        Student student2 = new Student("gao",29,70);
        Student student3 = new Student("shasha",17,99);
        /*if(student1.compareTo(student2) < 0) {
            System.out.println("student1的年龄 < student2");
        }*/

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

    public static void main1(String[] args) {
        int[] array = {12,4,89,43,56};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int a = 10;
        int b = 20;
        if(a > b) {

        }
    }
}
