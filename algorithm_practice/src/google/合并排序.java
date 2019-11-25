package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import jdk.nashorn.internal.objects.Global;

import java.util.ArrayList;
import java.util.List;

public class 合并排序 {
    // TODO: 19-10-14 定义全局列表变量
    static int[] array = new int[]{ 10, 1, 4, 22, 56, 5, 15, 4};
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        mergeSort(0,list.size()-1);
        for(int num : list){
            System.out.print(num + " ");
        }
    }
    static void mergeSort(int left,int right){
        if(left < right)// TODO: 19-10-14 递归出口，当left = right时
        {
            int mid = (left + right) / 2;
            mergeSort(left,mid);
            mergeSort(mid+1,right);
            merge(left, mid, right);
        }
    }
    static void merge(int left, int mid, int right){
        // TODO: 19-10-14 定义一个临时列表存储合并后的值。
        List<Integer> tempList = new ArrayList<>();
        int p1 = left,p2 = mid+1;
        // TODO: 19-10-15 当左右两个部分都只剩一个元素时，p1=mid ,p2=right
        while(p1 <= mid && p2 <= right){
            // TODO: 19-10-15  两个对象不能用==比较大小
            if(list.get(p1).compareTo(list.get(p2)) < 0) {
                // TODO: 19-10-15 没有元素的list不能用set方法
                tempList.add(list.get(p1));
                p1++;
            }
            else {
                tempList.add(list.get(p2));
                p2++;
            }
        }
        // TODO: 19-10-15 其中一个列表中的数据全部小于另一个列表中的某个数据，
        //  把另一个已排好序的列表中的数据添加到新列表 
        while(p1 <=mid){
            tempList.add(list.get(p1++));
        }
        while(p2 <=right){
            tempList.add(list.get(p2++));
        }
        // TODO: 19-10-15 将排好序的列表替换掉原列表中对应的位置的值 
        for (int i = left; i <=right ; i++) {
            int temp = tempList.get(i-left);
            list.set(i, temp);
        }
    }
}
