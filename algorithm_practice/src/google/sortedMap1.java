package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.*;

public class sortedMap1 {
    @org.junit.Test
    public void test() {
        HashMap<String, String> map = new HashMap<>();
        map.put("3", "33");
        map.put("1", "11");
        map.put("2", "22");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("排序之前:" + entry.getKey() + " 值" + entry.getValue());

        }
        System.out.println("======================================================");
        SortedMap<String, String> sort = new TreeMap<String, String>(map);
        // TODO: 19-9-29 map集合用迭代器
        Set<Map.Entry<String, String>> entry1 = sort.entrySet();
        Iterator<Map.Entry<String, String>> it = entry1.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("排序之后:" + entry.getKey() + " 值" + entry.getValue());
        }
    }
}
