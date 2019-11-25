package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.List;

public class 堆排序 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 4, 22, 56, 5, 15, 4};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        // TODO: 19-10-14 以--的方式，每次去除掉最后一个元素 即最大元素,只需要去除n-1个元素，i不能=0
        for (int i = list.size()-1; i > 0 ; i--) {
            // TODO: 19-10-14 建堆
            buildHeap(list,i);
            // TODO: 19-10-14 交换最大元素和最后一个元素
            swap(list,0,i);
            for (int num :list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static void buildHeap(List<Integer> list,int LastIndex){
        // TODO: 19-10-14 从最后一个元素开始，开始建立最大堆
        // TODO: 19-10-15 以父节点为循环条件，一直到根节点为止
        for (int i = (LastIndex-1)/2; i >=0 ; i--) {
            int tempParent = i; // TODO: 19-10-14 记录父节点位置
            int biggerIndex = 2*i+1;;// TODO: 19-10-14 记录左右节点较大值的节点的位置，初始值为左节点
            // TODO: 19-10-14 如果有右节点 且 右节点的值更大
            if(biggerIndex < LastIndex && list.get(biggerIndex) < list.get(biggerIndex+1))
                biggerIndex++;
            if (list.get(biggerIndex) > list.get(tempParent))
                swap(list,biggerIndex,tempParent);
        }
    }
    static void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
}
