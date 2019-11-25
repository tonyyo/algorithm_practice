package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.List;

public class 插入排序 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 4, 22, 56, 5, 15, 4};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        // TODO: 19-10-15 插入排序和选择排序一个是在前面一部分比较大小，一个是在后面一部分比较大小
        // TODO: 19-10-14 插入n-1次
        for (int i = 1; i < list.size(); i++) {
            int insert = list.get(i);// TODO: 19-10-14 跟踪要插入的元素
            int inserIndex = i; // TODO: 19-10-14 跟踪插入元素的位置
            for (int j = i-1; j >=0  ; j--) {// TODO: 19-10-14 从后往前开始比较
                if (insert < list.get(j)) {// TODO: 19-10-14 如果比最后一个元素小，就交换顺序
                    swap(list, inserIndex, j);
                    insert = list.get(j);
                    inserIndex = j;
                }
            }
        }
        for (int num :
                list) {
            System.out.print(num + " ");
        }
    }
    static void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
}
