package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.List;

public class 希尔排序 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 4, 22, 56, 5, 15, 4};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        // TODO: 19-10-14 分成increase组，每组之间进行插入排序，
        // TODO: 19-10-14 希尔排序的目的时为了降低直接排序里向后移动元素的规模
        // TODO: 19-10-15 可以笼统的说，降低了交换的次数，但是没有降低比较的次数
        int increase = 4;
        while(increase > 0){
            // TODO: 19-10-14 插入（length/increase)-1 次
            for (int i = increase; i < list.size(); i++) {
                int insert = list.get(i);// TODO: 19-10-14 跟踪要插入的元素
                int inserIndex = i; // TODO: 19-10-14 跟踪插入元素的位置
                for (int j = i-increase; j >=0  ; j = j-increase) {// TODO: 19-10-14 从后往前开始比较
                    if (insert < list.get(j)) {// TODO: 19-10-14 如果比最后一个元素小，就交换顺序
                        swap(list, inserIndex, j);
                        insert = list.get(j);
                        inserIndex = j;
                    }
                }
            }
            increase/=2;
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
