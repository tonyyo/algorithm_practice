package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.Scanner;

public class 非递归快排 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {

            String str = in.nextLine();
            String[] a = str.split(" ");
            int len = a.length-1;
            int[] arr = new int[len];
            for (int k = 0; k < len; k++) {
                arr[k] = Integer.parseInt(a[k+1]);
            }
            mergeSort(arr);
            for (int j = 0; j < arr.length; j++) {
                if(j==arr.length-1)
                    System.out.print(arr[j]);
                else
                {
                    System.out.print(arr[j]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void mergeSort(int[] a){
        int len = 1;
        while(len < a.length){
            for(int i = 0; i < a.length; i += 2*len){
                merge(a, i, len);
            }
            len *= 2;
        }
    }

    public static void merge(int[] a, int i, int len){
        int start = i;
        int len_i = i + len;//归并的前半部分数组
        int j = i + len;
        int len_j = j +len;//归并的后半部分数组
        int[] temp = new int[2*len];
        int count = 0;
        while(i < len_i && j < len_j && j < a.length){
            if(a[i] <= a[j]){
                temp[count++] = a[i++];
            }
            else{
                temp[count++] = a[j++];
            }
        }
        while(i < len_i && i < a.length){//注意：这里i也有可能超过数组长度
            temp[count++] = a[i++];
        }
        while(j < len_j && j < a.length){
            temp[count++] = a[j++];
        }
        count = 0;
        while(start < j && start < a.length){
            a[start++] = temp[count++];
        }
    }
}
