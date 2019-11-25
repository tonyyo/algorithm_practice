package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 倒置个数 {

    static ArrayList<Integer> list = new ArrayList<>();
    static int count =  0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            list.add(scanner.nextInt());
        }
        mergeSort(0,list.size()-1);
        for (int num :
                list) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(count);
    }
    static void mergeSort(int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid+1,right);
            merge(left,right);
        }

    }
    static void merge(int left, int right){
        int mid = (left + right) / 2, p1=left, p2=mid+1;
        List<Integer> tempList = new ArrayList<>();
        while(p1 <= mid && p2 <= right){
            if (list.get(p1) <= list.get(p2)){
                tempList.add(list.get(p1++));
            }
            else{
                tempList.add(list.get(p2++));
                // TODO: 19-10-17 如果左边部分中的靠左元素满足，那么左半部分在该元素右边的元素都会满足，因为是升序的
                count+=mid-p1+1;
            }
        }
        while(p1 <= mid){
            tempList.add(list.get(p1++));
        }
        while(p2 <= right){
            tempList.add(list.get(p2++));
        }

        for (int i = left; i <= right; i++) {
            list.set(i,tempList.get(i-left));
        }

    }
}
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (i < j && list.get(i) > list.get(j))
//                    count++;
//                else if (i > j && list.get(i) < list.get(j))
//                    count++;
//                else
//                    continue;
//            }
//        }
//        System.out.print(count/2);