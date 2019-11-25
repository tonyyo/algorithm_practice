package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:输入一串数字，按个数多少排序1 8 5 5 4 6 4 19982 183 23
 * @Modify By:
 *
 * */

import java.util.*;

public class 按照数值个数排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        int len = sc.nextInt();
        int[] nums= new int[len];
        for (int j = 0; j < caseNum; j++) {
            for (int i = 0; i < len; i++) {
                nums[i] = sc.nextInt();
            }
        }
        sortOfCounts(nums);
    }
    public static void sortOfCounts(int[] nums){
        TreeMap<Integer, TreeSet<Integer>> countsNum = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }.reversed());
        TreeMap<Integer, Integer> numCounts = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = numCounts.getOrDefault(nums[i],0);
            // TODO: 19-9-28 如果numCounts中有值了，那么就需要将该值进行重新分配，故要删除它
            if (count!=0){
                countsNum.get(count).remove(nums[i]);
            }
            numCounts.put(nums[i],++count);
            TreeSet<Integer> tempSet = countsNum.getOrDefault(count,new TreeSet<Integer>());
            tempSet.add(nums[i]);
            countsNum.put(count,tempSet);
        }

        StringBuilder stringBuilder = new StringBuilder();
        Set<Map.Entry<Integer,TreeSet<Integer>>> entries= countsNum.entrySet();
        Iterator<Map.Entry<Integer,TreeSet<Integer>>> iterator = entries.iterator();
        // TODO: 19-9-29 成功用迭代器将TreeMap<Integer,TreeSet<Integer>>输出
        while (iterator.hasNext()){
            Map.Entry<Integer,TreeSet<Integer>> entry = iterator.next();
            for (Integer num :
                    entry.getValue()) {
                for (int i = 0; i < entry.getKey(); i++) {
                    stringBuilder.append(num+" ");
                }
            }
        }

//        for (Integer count : countsNum.keySet()) {
//            // TODO: 19-9-28 转化不了， object类型无法转化为treeSet类型
//          /*  for (TreeSet<Integer> set: countsNum.get(count)){
//            }*/
//            // TODO: 19-9-28 这泛型最好不要省，不然有时候会转换不过来。报转换错误
//            TreeSet<Integer> numSet = countsNum.get(count);
//            // TODO: 19-9-28 不能这样，equals只能比较对象，而null不是对象，该条件会一直成立，陷入死循环报 OutOfMemoryError
////            while (!numSet.equals(null))
//            while (!numSet.isEmpty())
//            {
//                Integer num = numSet.pollFirst();
//                for (int i = 0; i < count; i++) {
//                    stringBuilder.append(num + " ");
//                }
//            }
//        }

        System.out.print(stringBuilder.toString().trim());


    }
}
