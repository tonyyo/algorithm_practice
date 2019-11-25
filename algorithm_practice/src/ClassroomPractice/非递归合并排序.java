package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.Scanner;
import java.util.Stack;

public class 非递归合并排序 {

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
            GenerQuickSort(arr,0,arr.length-1);
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
    public static int[] GenerQuickSort(int[] arr, int left, int right) {
        //定义一个栈
        Stack<Integer> stack = new Stack<>();
        //前提条件就是left < right
        if(left < right) {
            stack.push(left);  //将left压进栈中
            stack.push(right);  //将right压进栈中
            while(!stack.isEmpty()) {  //当栈不为空时，进行以后的操作
                int height = stack.pop();  //取出栈中第一位，我最后压进的是right，所以它是最末位的下标；
                int low = stack.pop();  //最底下的是left的下标。到底哪个对应那个，要看你是怎么压进去的

                int index = getTargetIndex(arr, low, height);  //得到基准数的下标
                if(index-1 > low) {   //判断基准数左边的数的下标与开始下标的大小
                    stack.push(low);    //根据情况压进去以基准数分开的下标的左半边部分的低位
                    stack.push(index -1);   //根据情况压进去以基准数分开的下标的左半边部分的高位
                }

                if(index+1 < height) {  //判断基准数右边的数的下标与开始下标的大小
                    stack.push(index + 1);   //根据情况压进去以基准数分开的下标的右半边部分的低位
                    stack.push(height);   //根据情况压进去以基准数分开的下标的右半边部分的高位
                }
            }
        }
        return arr;
    }

    //这是寻求中间位置的方法，此处不再赘述
    public static int getTargetIndex(int[] arr, int left, int right) {
        if(left >= right || arr == null) {
            return -1;
        }

        int key = arr[left];
        while(left < right) {
            while(key < arr[right] && left < right)
                right--;
            arr[left] = arr[right];

            while(key >= arr[left] && left < right)
                left++;
            arr[right] = arr[left];
        }
        arr[left] = key;

        return left;
    }
}
