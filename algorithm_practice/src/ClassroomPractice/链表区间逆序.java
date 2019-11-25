package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 链表区间逆序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < caseNum; i++) {
            String link = sc.nextLine();
            String regex = " ";
            String[] linkArray = link.split(regex);
            int length = Integer.valueOf(linkArray[0]);
            int k = Integer.valueOf(linkArray[linkArray.length-1]);
            ArrayList<String> realLinkList = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                realLinkList.add(linkArray[j+1]);
            }
            for (int j = 0; j + k <= length ; j=j+k) {
                List<String> tempList = realLinkList.subList(j, j + k);
                Collections.reverse(tempList);
            }
            for (int j = 0; j < realLinkList.size(); j++) {
                if(j != realLinkList.size()-1)
                    System.out.print(realLinkList.get(j)+" ");
                else
                    System.out.print(realLinkList.get(j));
            }
            System.out.println();
        }
    }
}
