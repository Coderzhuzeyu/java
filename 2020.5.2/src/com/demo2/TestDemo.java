package com.demo2;

import java.util.Arrays;

/**
 * @program: 2020.5.2
 * @description:接口的使用实例
 * @author:zzy
 * @create: 2020-05-03 22:17
 **/

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

    public static void main2(String[] args) {
        Student student1 = new Student("bit",18,60);
        Student student2 = new Student("bao",29,59);
        Student student3 = new Student("sha",17,90);

//        if (student1.compareTo(student2) < 0) {
//            System.out.println(student1.name + "的年龄<" + student2.name);
//        }

//        Student[] students = new Student[]{student1,student2,student3};
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Arrays.sort(students);// 在 sort 方法中会自动调用 compareTo 方法
        System.out.println(Arrays.toString(students));

    }

    public static void main1(String[] args) {
        int[] array  = {12,4,89,43,56};
        Arrays.sort(array);//排序
        System.out.println(Arrays.toString(array));
    }


}
