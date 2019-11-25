package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:2 4 4 3 2 1 5 1 5 4 3 2
 * @Modify By:
 *
 * */

import java.lang.reflect.Array;
import java.util.*;

public class 最小交换次数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        for (int i = 0; i < caseNum; i++) {
            int len = sc.nextInt();
            ArrayList<Integer> tempArrayList1 = new ArrayList<Integer>();
            for (int j = 0; j < len; j++) {
               tempArrayList1.add(sc.nextInt());
            }
            System.out.println(miniNum(tempArrayList1));
        }
    }

    public static Integer miniNum(ArrayList<Integer> list){
        int count=0;
        ArrayList<Integer> sortList = new ArrayList<>();
        // TODO: 19-9-30 智障了，集合之间的拷贝 可以直接用addall,
        //  看源码发现底层居然是System.arraycopy,为浅拷贝，但是没关系，只要不用到引用数据类型就好
        sortList.addAll(list);
        Collections.sort(sortList);
        for (int pos = 0; pos < list.size(); pos++) {// TODO: 19-9-30 pos表明在该位置放正确排序的数
            int num = 0;// TODO: 19-9-30 num为对应这放错位置的那个数，需和正确位置的那个数进行交换。
            for (int j = 0; j < list.size(); j++) {
                if (pos != j && sortList.get(pos).equals(list.get(j)) ){
                    num = j;
                    // TODO: 19-9-30 count应该在这里计数
                    count++;
                    break;
                }
            }
            swap(list,pos,num);
            if (sorted(list))
                break;
        }
        return count;
    }


    public static void swap(ArrayList<Integer> list,int pos,int num){
        int temp = list.get(pos);
        // TODO: 19-9-30 指定list某个位置的值用set，而不是replace
        list.set(pos,list.get(num));
        list.set(num,temp);
    }

    public static boolean sorted(ArrayList<Integer> list){
        ArrayList<Integer> tempArrayList2 = new ArrayList<>();
        // TODO: 19-9-30 智障了，集合之间的拷贝 可以直接用addall,
        //  看源码发现底层居然是System.arraycopy,为浅拷贝，但是没关系，只要不用到引用数据类型就好
        tempArrayList2.addAll(list);
        Collections.sort(tempArrayList2);
        for (int i = 0; i < list.size(); i++) {
            if (tempArrayList2.get(i).equals(list.get(i)))
                return false;
        }
        return true;
    }
}
