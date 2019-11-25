package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 4, 22, 56, 5, 15, 4};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        for (int j = 0; j < list.size()-1; j++) { // TODO: 19-10-15 冒泡的次数为n-1
            // TODO: 19-10-14 一次冒泡需要比较的次数 ,此处跳出循环条件必须为k+1,不然会越界
            for (int k = 0; k + 1 < list.size()-j; k++) {
                if(list.get(k) > list.get(k+1)){
                    int temp = list.get(k);
                    list.set(k,list.get(k+1));
                    list.set(k+1,temp);
                }
            }
        }
        for (Integer num :
                list) {
            System.out.print(num + " ");
        }
    }
}
