package top.yangluotong.equal;

import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class CollectionList {

    public static void main(String[] args) {
        //矢量
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(1, 100);
        System.out.println(vector.capacity());

        Stack<Integer> stack = new Stack<>();
        stack.add(1);

        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        hashtable.put(1, 1);

        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        ConcurrentSkipListMap<Integer, Integer> concurrentSkipListMap = new ConcurrentSkipListMap<>();

        Properties properties = new Properties();
        properties.setProperty("1", "1");



    }
}
