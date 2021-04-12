import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Map> strList = new ArrayList<>();
        Map map = new HashMap();
        map.put("name","zhangshan");
        map.put("value","1111");
        strList.add(map);

        // 这行获取我们的stream流对象，我们的操作都是通过这个流对象进行操作的。
        Stream<Map> stream = strList.stream();
        // 首先我们做一个简单的循环遍历
        stream.forEach(System.out::println);
        System.out.println(Math.round(0.33333333 * 100)/100);

        double f = 1000;

        System.out.println(String.format("%.2f", f));
    }
}
