package top.yangluotong.equal;

import java.io.InputStream;
import java.util.Scanner;

public class CompareObject {

    private String name;
    private String id;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


   

    public static void main(String[] args) throws ClassNotFoundException {
        CompareObject o1 = new CompareObject();
        o1.age = "1";
        o1.name = "2";
        o1.id = "3";
        CompareObject o2 = new CompareObject();
        o2.age = "1";
        o2.name = "2";
        o2.id = "3";
        System.out.println(o1.equals(o2));

        System.out.println("o1 hashcode:" + o1.hashCode());
        System.out.println("o2 hashcode:" + o2.hashCode());
        System.out.println(o1 == o2);

        Class<?> c1 = o1.getClass();
        Class<?> c2 = Class.forName("top.yangluotong.equal.CompareObject");

        System.out.println(c1.getName());
        System.out.println(c2.getName());

        InputStream resourceAsStream = CompareObject.class.getResourceAsStream("config.txt");
        Scanner in = new Scanner(resourceAsStream);
        while (in.hasNext()){
            System.out.println(in.next());
        }
    }
}
