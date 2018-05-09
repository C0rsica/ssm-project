package top.yangluotong.springbean;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yangluotong.constant.WEEKDAY;

import java.util.ArrayList;
import java.util.List;

//@Component
public class Country {
    final String NAME;

    public static int anInt;

    public Country(String NAME) {
        this.NAME = NAME;
    }

//    @Autowired
    Person person;

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        List<String> list1 = new ArrayList<String>();
//        System.arraycopy(list, 0, list1, 0, list.size());
        System.out.println(list1.size());


        int i = 0;
        //基本类型局部变量使用前要初始化,类变量不需要
        //JVM初始化方法内部变量需要消耗内存,交给开发者自己初始化
        final int j = 100;
        System.out.println(j);
        WEEKDAY today = WEEKDAY.MONDAY;
        System.out.println(today.getCode());
        System.out.println(today.getMsg());

        wildCard(list);
        List<Integer> list2 =new ArrayList<>();
        list2.add(1);
        list2.add(13);
        list2.add(21);
        list2.add(15);
        wildCard(list2);

    }

    public static void wildCard(List<?> list) {
        list.forEach(System.out::print);
    }


}
