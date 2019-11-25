package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.*;

class 如何花最少的钱购买蔬菜 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int n = Integer.parseInt(sc.nextLine());
            long sum = 0;
            long[][] a = new long[n][3];
            for(int i=0;i<n;i++) {
                String[] nums = sc.nextLine().split(" ");
                a[i][0] = Long.parseLong(nums[0]);
                a[i][1] = Long.parseLong(nums[1]);
                a[i][2] = Long.parseLong(nums[2]);
            }

            for(int i=1;i<n;i++){
                a[i][0] += Math.min(a[i-1][1] , a[i-1][2]) ;
                a[i][1] += Math.min(a[i-1][0] , a[i-1][2]) ;
                a[i][2] += Math.min(a[i-1][1] , a[i-1][0]) ;
            }

            sum = Math.min(a[n-1][0] , Math.min(a[n-1][1] , a[n-1][2]));
            System.out.println(sum);
        }
    }

}