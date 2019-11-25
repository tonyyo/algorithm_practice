package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 选择排序 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 4, 22, 56, 5, 15, 4};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int i = 1; i <list.size() ; i++) {// TODO: 19-10-15 选择的次数为n-1
            int min = Integer.MAX_VALUE;
            int compare = list.get(i-1); // TODO: 19-10-15 记录比较位置的数值
            int pos = i-1;   // TODO: 19-10-15  记录比较位置
            for (int j = i; j < list.size(); j++) {// TODO: 19-10-14 裁剪n-1次
                //min = min > list.get(j)?list.get(j):min;
               min = Math.min(min,list.get(j));
            }
            List<Integer> subList = list.subList(i, list.size());
            int index = subList.indexOf(min)+i;// TODO: 19-10-14 获得那个最小值第一次出现的位置
            // TODO: 19-10-14 list.get(i-1)这个值可能比后面的数都小，不能无脑交换
            if(min < compare) {
                int temp = list.get(index);
                list.set(index,compare);
                list.set(pos ,temp);
            }
        }
        for (int num :
                list) {
            System.out.print(num+" ");
        }
    }
}
