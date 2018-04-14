import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.lang.String;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午10:08
 */
public class BinarySearch {

  public static void main(String[] args) {
    Integer[] largeNumbers = {};
   /* for (int i = 0; i < 100000; i++) {
      largeNumbers[i] = i;
    }*/
    Hashtable<String, String> hashtable = new Hashtable<>();
    String key = "corsica";
    String value = "8724";

    hashtable.put(key, value);

    String[] arr = new String[100];
    List arrayList = new ArrayList();
    arrayList.add(1);
    arrayList.add("2");
    arrayList.add(true);
    System.out.println(arrayList.get(1));

    /*ArrayList跟数组区别
    自动扩容
    任意类型
    有序
     */

    arr[0] = "1";
    arr[1] = "1";
    arr[2] = "1";
    arr[3] = "1";

    System.out.println(key.hashCode());
    hashtable.get(key);

    String s = new String();


  }


}
