package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */
import java.util.ArrayList;
import java.util.List;

public class 快速排序 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        sort(list,0,list.size()-1);
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j)+" ");
        }
    }
    public static void sort(List<Integer> list,int i,int j){ // TODO: 19-10-14 i 列表开始位置，j为列表结束,该函数为一次快速排序
        int low = i,high = j;  // TODO: 19-10-14 因为我们会跳过与基准值相等的值，所以第一个元素既是基准值也是头标，应该参与交换，
        if(i >= j)
            return;// TODO: 19-10-14 递归出口，如果low跟high重合了就跳出递归

        int temp_jizhun = list.get(i);// TODO: 19-10-14 设置第一个值为基准值
        while(low < high){
            // TODO: 19-10-14 从尾部先开始，防止如果本身就是排好序的序列，那么此时尾部指针会从尾部一直移到头部，头部指针动不了。此时重合，跳出循环。
            // TODO: 19-10-14 如果从头部开始，头部指针压根移不动
            while(list.get(high) >= temp_jizhun && low < high){// TODO: 19-10-14 high 用来找比基准值小的值,跳过比基准值大的值
                high--;
            }
            // TODO: 19-10-14 此处的low<high保证了当low和high相等后，low不会再向前++了。这两个while循环不是并列关系，而是先后关系。
            while(list.get(low) <= temp_jizhun && low < high){// TODO: 19-10-14 low用来找比基准值大的值，跳过比基准值小的值
                low++;
            }
            if (high > low){  // TODO: 19-10-14 确保大于high大于low时才交换，防止相等时，增加空间复杂度
                int temp1 = list.get(high);
                list.set(high,list.get(low));
                list.set(low,temp1);
            }
        }
        list.set(i,list.get(high)); // TODO: 19-10-14 high和low已经重合，将基准值交换到此处
        list.set(high,temp_jizhun);

        sort(list,i,low-1);
        sort(list,low+1,j);
    }
}
