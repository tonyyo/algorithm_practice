package ClassroomPracticeOfSomebody;/*
 * @Author:vincent
 * @Describe:第一题:按数值排序1 8 5 5 4 6 4 19982 183 23
 解题思路：该解题思路用的及其巧妙，首先声明了一个counts的TreeMap来计数，又声明了一个TreeMap<Integer,TreeSet<Integer>>,键用来存总共有多少个个数，值用来存这么多个数的值，
 且TreeSet还具有自然排序的功能，按照键来循环
 输出出来的序列还是有序的。
 * @Modify By
 *
 * */
import java.util.*;

public class SortByNumberOfValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int c = 0; c < size; c++) {
            int n = scanner.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i< n; i++){
                // TODO: 19-9-28 处理输入时最好就是用nextInt
                nums[i] = scanner.nextInt();
            }
            sortWithFreq(nums);
        }
    }
    public static void sortWithFreq(int nums[]){
        TreeMap<Integer, TreeSet<Integer>> res = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO: 19-9-28 逆序输出，绝了
                return o2-o1;
            }
        });
        Map<Integer, Integer> counts = new TreeMap<>();

        for (int i = 0; i < nums.length; i++){
            // TODO: 19-9-28  如果map中含有指定的key，就返回该key对应的value，否则使用该方法的第二个参数作为默认值返回
            // TODO: 19-9-28 该方法融合了contains方法、get方法和设置默认值的方法，要是我就先判断，若不存在就取值为0，若存在就取出来
            int cur = counts.getOrDefault(nums[i],0);//看看之前map键中是否有数组中的值，如果有，则将其数量获取到，然后下面好进行计数
            if(cur != 0){
                // TODO: 19-9-28 String vlaues = map.get("key");//获取map中键值为“key”的值，此处的remove方法时treeSet中的
                res.get(cur).remove(nums[i]);//如果计数不等于0，说明该数值中类似的值不止一个，应该存入别的set中，将该计数对应的set中的数组值抹去
            }
            counts.put(nums[i],++cur);//将数组中的值存入count的键中，并用其值进行计数，如果有重复就覆盖，并更新计数
            // TODO: 19-9-28 同理，如果有这样键，则将其值取出，如果没有，则新增一个set
            TreeSet<Integer> set = res.getOrDefault(cur, new TreeSet<>());//将计数得来的值存入一个set集合
            set.add(nums[i]);//将数组中的值存入set，这样的话，res中的键存的是计数，值存的是数组中的值
            res.put(cur, set);//将计数存入res的键中，并将set集合存入值中
        }
        // TODO: 19-9-28 要求输出一串东西时用StringBuilder再好不过， 因为其可以append
        StringBuilder sb = new StringBuilder();
        for (int n : res.keySet()){
            TreeSet<Integer> set = res.get(n);
            // TODO: 19-9-28 用该种方法很巧妙，要是我就用foreach循环了
            while(!set.isEmpty()) {
                int num = set.pollFirst();//去除g第一个元素，并删除
                for (int i = 0; i < n; i++) {
                    sb.append(num + " ");
                }
            }
        }
        // TODO: 19-9-28 行尾去空格
        System.out.println(sb.toString().trim());
    }
}
