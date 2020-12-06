import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student {
    public String name;
    public String classes;
    public double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}

public class TestMain {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret  = new ArrayList<>();

        if(numRows == 0) {
            return ret;
        }
        List<Integer> oneRow = new ArrayList<>();
        ret.add(oneRow);

        ret.get(0).add(1);//第一行的元素 添加了一个1
        //直接从第2行开始进行计算
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);//当前行的第一个元素
            List<Integer> prevRow = ret.get(i-1);//前一行
            for(int j = 1; j < i;j++) {
                //[i,j] = [i-1,j] +[i-1,j-1]
                int x = prevRow.get(j);
                int y = prevRow.get(j-1);
                curRow.add(x+y);
            }
            //最后一个元素
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }



    public static List<Character> func(String str1,String str2) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(!str2.contains(ch+"")) {
                list.add(ch);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str = "welcome to bit";
        String str2 = "come";
        List<Character> ret = func(str,str2);
        for (char ch :ret) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main3(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main2(String[] args) {
        Student student = new Student("bit","火箭2班",15.9);
        Student student2 = new Student("gaobo","火箭2班",89.9);

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        System.out.println(list);
    }

    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add(1,"abc");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        list.add("java");
        list.add("bit");

        list.addAll(list1);
        System.out.println(list);

        String ret = list.remove(0);
        System.out.println(ret);

        list.remove("bit");
        System.out.println(list);

        System.out.println("=======get=======");
        ret = list.get(0);
        System.out.println(ret);//abc java

        System.out.println("=======set======");
        list.set(0,"haha");//更新
        System.out.println(list);

        System.out.println(list.contains("haha"));

        System.out.println(list.indexOf("haha1"));
        list.add("haha");//haha  java  haha
        //从后往前查找第一个haha出现的位置
        System.out.println(list.lastIndexOf("haha"));
        System.out.println("========subList==========");
        //haha  java  haha
        List<String> retList = list.subList(0,2);
        System.out.println(retList);//haha  java

        retList.set(0,"gaobo");
        System.out.println(retList);//gaobo java

        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
