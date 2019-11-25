package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 数字重组问题 {
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        for (int i = 0; i < caseNum; i++) {
            flag = false;
            String tempStr = scanner.next();
            int tempnum = Integer.valueOf(tempStr);
            int count = 0;
            List<Integer> list = new ArrayList<>();
            while (tempnum !=0 ){
                int num = tempnum % 10;
                list.add(num);
                tempnum = tempnum / 10;
            }
            fullArrrange(list,0);
            if(flag == false)
                System.out.println("Not Possible");
        }

    }
    static void fullArrrange(List<Integer> list, int index){
        if(index >= list.size()) {
            String tempStr = "";
            for (int num :
                    list) {
                tempStr = tempStr + num;
            }
            int num = Integer.valueOf(tempStr);
            if(num % 17 ==0) {
                System.out.println(num);
                flag = true;
            }
        }
        for (int j = index; j < list.size(); j++) {
            swap(list,index,j);
            fullArrrange(list,index+1);
            swap(list,index,j);
        }
    }
    static void swap(List<Integer> list,int index1,int index2){
        int t = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,t);
    }
}
