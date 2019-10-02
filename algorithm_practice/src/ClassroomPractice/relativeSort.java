package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.*;

public class relativeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> relativeList = new ArrayList<>();
        for (int i = 0; i < len1; i++) {
            numList.add(sc.nextInt());
        }
        for (int i = 0; i < len2; i++) {
            relativeList.add(sc.nextInt());
        }

        TreeMap<Integer, Integer> treeMap = new TreeMap();
        for (Integer num :
                numList) {
            // TODO: 19-9-30 这个方法用来计数刚刚好，嘿嘿
            int count = treeMap.getOrDefault(num,0);
            treeMap.put(num , ++count);
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer relative : relativeList) {
            // TODO: 19-9-30 当代码没错，思路正确，很可能就是有写变量定义错了位置
            // TODO: 19-9-30 如下，遍历TreeMap时，每次循环都要重新定义迭代器。
            Set<Map.Entry<Integer, Integer>> numCountEntries = treeMap.entrySet();
            Iterator<Map.Entry<Integer, Integer>> entryIterator = numCountEntries.iterator();
            while (entryIterator.hasNext()){
                Map.Entry<Integer, Integer> entry = entryIterator.next();
                if (relative.equals(entry.getKey())){
                    for (int i = 0; i < entry.getValue(); i++) {
                        stringBuilder.append(relative+" ");
                    }
                    // TODO: 19-9-30 key不会重复，避免不必要的循环
                    break;
                }
            }
        }
        for (Integer remove : relativeList) {
            treeMap.remove(remove);
        }
        for (Integer num : treeMap.keySet()) {
                    stringBuilder.append(num+" ");
        }
        System.out.print(stringBuilder.toString().trim());
    }
}
