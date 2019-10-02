package ClassroomPracticeOfSomebody;
/*
* @Author:vincent
* @Describe:第三题：相对交换
* @Date:下午8:53 19-9-26
*/
import java.util.*;



public class relative_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int c = 0; c < size; c++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i< n; i++){
                nums[i] = scanner.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();
            int orderArray[] = new int[m];
            for (int i = 0; i < m; i++){
                orderArray[i] = scanner.nextInt();
                map.put(orderArray[i],0);
            }
            sortOccurrences(nums,orderArray,map);
        }
    }

    private static void sortOccurrences(int[] nums, int[] orderArray,  Map<Integer,Integer> map) {
        if (nums.length == 1){
            System.out.println(nums[0]);
            return;
        }else if(nums.length == 0){
            System.out.println();
            return;
        }
        int index = nums.length-1;
        for (int i = nums.length - 1; i >= 0; i--){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                nums[index--] = nums[i];
            }
        }
        int index2 = 0;
        for (int i = 0; i < orderArray.length; i++){
            int n = map.get(orderArray[i]);
            for (int j = 0; j < n; j++){
                nums[index2++] = orderArray[i];
            }
        }
        Arrays.sort(nums,index2,nums.length);
        StringBuilder sb = new StringBuilder();
        for (int i =0; i< nums.length;i++){
            sb.append(nums[i] +" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void sortWithFreq(int nums[]){
        TreeMap<Integer, TreeSet<Integer>> res = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }
}
