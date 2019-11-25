package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.Scanner;

public class 数组查询 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int sum =maxSumSubarray(A, N);
            System.out.println(sum);
        }
    }
    public static int maxSumSubarray(int A[], int n) {
        int cur = A[0];
        int max = A[0];
        int s = n;
        int[] x = new int[s];
        int[] y = new int[s];
        x[0] = A[0];
        for (int i = 1; i < n; i++) {
            cur = Math.max(A[i], cur + A[i]);
            max = Math.max(max, cur);
            x[i] = cur;
        }
        cur = max = y[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            cur = Math.max(A[i], cur + A[i]);
            max = Math.max(max, cur);
            y[i] = cur;
        }
        int fans = max;
        for (int i = 1; i < n - 1; i++) {
            fans = Math.max(fans, x[i - 1] + y[i + 1]);
        }
        return fans;

    }
}
