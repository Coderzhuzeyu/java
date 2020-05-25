import java.util.*;

/**
 * @program: 2020.5.13
 * @description:集合
 * @author: zhuzeyu
 * @create: 2020-05-13 08:48
 **/
public class TestMain {

    //包装类
    public static void main(String[] args) {
        //Integer 如果给定的范围是 i >= -128 && i <= 127,每次都会在这个下标取数
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);//true
        Integer a1 = 200;
        Integer b1 = 200;
        System.out.println(a1 == b1);//false
        int c = 200;
        int d = 200;
        System.out.println(c == d);//true
    }

    //自动装箱拆箱
    public static void main5(String[] args) {
        Integer a = 10;//自动装箱

        int b = a;//自动拆箱

    }

    //手动装箱拆箱
    public static void main4(String[] args) {
        int i = 10;
        //装箱操作，新建一个Integer 类型对象 ，将 i 的值放入对象的某个属性中
        Integer ii = Integer.valueOf(i);//第一种（常用）
        Integer ij = new Integer(i);//第二种
        //拆箱操作，将 Integer 对象中的值取出，放到一个基本数据类型中
        int j = ii.intValue();
        double d = ii.doubleValue();

    }

    //哈希表
    public static void main3(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        map.put("及时雨","宋江");
        map.put("及时雨","宋江2");//如果 k（这里指 及时雨 ） 值多次出现，v值只取最新的（这里取宋江2）
        System.out.println(map);//哈希表 的打印顺序不一定就是存储顺序
        String s = map.get("及时雨");//根据 k 查找
        System.out.println(s);
        String s1 = map.get("艹艹艹");//没有的话返回 null
        System.out.println(s1);
        String s2 = map.getOrDefault("艹艹艹","hhhh");//如果没有给定一个默认值
        System.out.println(s2);
        System.out.println(map.containsKey("及时雨"));//查找是否存在 k
        System.out.println(map.containsValue("宋江"));//查找是否存在 v

        System.out.println("============================");

        Set< Map.Entry< String,String > > set = map.entrySet();//将所有键值对返回
        for (Map.Entry<String,String> entry : set) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }

    //链表
    public static void main2(String[] args) {
        Collection<String> collection = new LinkedList<>();
        collection.add("spdz");
        collection.add("-");
        collection.add("dttp");
        System.out.println(collection);
        for (String s :collection) {
            System.out.print(s + " ");
        }
        System.out.println();
        collection.remove("-");
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());
    }

    //顺序表
    public static void main1(String[] args) {
        Collection collection = new ArrayList();
        System.out.println(collection);

        Collection<Integer> collection2 = new ArrayList<>();//元素只能是int
        collection2.add(111);
        System.out.println(collection2);

        Collection<String> collection1 = new ArrayList<>();//元素只能是String
        collection1.add("bit");
        collection1.add("java");
        collection1.add("hhhh");
        collection1.add("wwww");
        collection1.add("zzzz");
        System.out.println(collection1);
        collection1.remove("java");//删除
        System.out.println(collection1);
        System.out.println(collection1.size());//元素个数
        Object[] objects = collection1.toArray();//变为数组
        System.out.println(Arrays.toString(objects));
        collection1.clear();//清空
        System.out.println(collection1);
        System.out.println(collection1.isEmpty());//是否为空
    }
}
