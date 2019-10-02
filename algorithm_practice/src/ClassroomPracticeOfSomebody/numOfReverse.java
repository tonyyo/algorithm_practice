package ClassroomPracticeOfSomebody;
import java.util.*;
/*
* @Author:vincent
* @Describe:第四题:倒置个数
* @Date:下午8:47 19-9-26
*/
public class numOfReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int c = 0; c < size; c++) {
            int n = scanner.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i< n; i++){
                nums[i] = scanner.nextInt();
            }
            System.out.println(reversePairs(nums));
        }
    }

    public static int reversePairs(int[] nums) {
        int count = mergeSort(nums, 0, nums.length - 1);
        return count;
    }
    private static int mergeSort(int[] nums, int start, int end){
        if(start>=end){
            return 0;
        }
        int mid = (start + end) / 2;
        int count = mergeSort(nums, start, mid) + mergeSort(nums, mid+1, end);
        for(int i = start, j = mid+1; i<=mid; i++){
            while(j <= end && nums[i] > nums[j]) {
                j++;
            }
            count += j-(mid+1);
        }
        Arrays.sort(nums, start, end+1);
        return count;
    }
}

