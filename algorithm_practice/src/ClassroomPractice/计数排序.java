package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.Arrays;
import java.util.Scanner;

public class 计数排序 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,4,6,7,5,4,3,2,1,4,5,10,9,10,3};
        sortCount(arr, 1, 10);
        System.out.println(Arrays.toString(arr));
    }

    //计数排序的初步实现，使用了多余的空间，可以尝试不使用多余的空间
    public static void sortCount(int[] arr, int m, int n) {
        int len = arr.length;
        int[] tem = new int[n - m + 1];
        for(int i = 0; i < len; i++) {
            tem[arr[i] - m] += 1;
        }
        for(int i = 0, index = 0; i < tem.length; i++) {
            int item = tem[i];
            while(item-- != 0) {
                arr[index++] = i + m;
            }
        }
    }

}
