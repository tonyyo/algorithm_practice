package ClassAfterOfAdvanceAlgorithm;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import com.sun.xml.internal.ws.util.NoCloseOutputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 区间k最小 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] split = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            list.add(Integer.valueOf(split[i]));
        }
        int from = sc.nextInt();
        int to = sc.nextInt();
        int index = sc.nextInt();
        List<Integer> tempList  = list.subList(from-1,to);
        Collections.sort(tempList);
        System.out.print(tempList.get(index-1));
    }
}
