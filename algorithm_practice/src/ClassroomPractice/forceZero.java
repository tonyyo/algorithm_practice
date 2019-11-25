package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class forceZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int z = scanner.nextInt();
        for (int a = 0; a < z; a++) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++){
                nums[i] = scanner.nextInt();
            }
            double[] res = calPoint(nums);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < res.length; i++){
                sb.append(df.format(res[i]) + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
    public static double[] calPoint(int nums[]){
        double[] res = new double[nums.length - 1];
        for (int i = 0; i < res.length;i++){
            res[i] = calPoint(nums,i,nums[i]*1.0,nums[i+1] * 1.0);
        }
        return res;
    }
    public static double calPoint(int[] nums, int index, double begin, double end){

        double x;
        double delta = 0.00000000001;
        while (end - begin > delta){
            double temp = 0;
            x = (end + begin)/2;
            for(int i = 0; i <= index;i++){
                temp += 1.0 / (x - nums[i]);
            }
            for (int i = index + 1; i < nums.length; i++){
                temp -= 1.0 / (nums[i] - x);
            }

            if (temp > 0)
            {
                begin = x;
            } else if(temp < 0){
                end = x;
            } else{
                return x;
            }
        }
        return begin;
    }
}
