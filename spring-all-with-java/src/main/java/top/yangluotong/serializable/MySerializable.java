package top.yangluotong.serializable;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Slf4j
public class MySerializable implements Serializable {
    private static final long serialVersionUID = -1401926379672375921L;

    public static void main(String[] args) {


        try {
            System.out.println("in try");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("in catch");
        } finally {
            System.out.println("i'm finally");
        }
        log.info("hello {} this is a {}", "kate", 2);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            log.info("{}",random.nextInt(100));
            list.add(random.nextInt(100));
        }
        Collections.sort(list);
        Collections.reverse(list);
        list.forEach(x-> System.out.println(x));


    }

}
