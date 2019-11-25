package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 和最大的连续降序字符 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int t = 0; t < T; t++) {
            String str = in.nextLine();
            char[] c = str.toCharArray();
            Arrays.sort(c);
            List<Character> result = result(c);
            for (int i = result.size() - 1; i >= 0; i--)
                System.out.print(result.get(i));
            System.out.println();
        }
    }
    public static List result(char[] c) {
        int len = c.length;
        List<Character> list_result = new ArrayList<Character>();
        int maxcount = 0;
        for (int i = 0; i < len; i++) {

            for (int j = i + 1; j < len; j++) {
                List<Character> list = new ArrayList<Character>();
                list.add(c[i]);
                char temp = c[i];
                int delt = c[j] - temp;
                list.add(c[j]);
                temp = c[j];
                for (int k = j + 1; k < len; k++) {
                    if ((c[k] - temp) == delt) {
                        list.add(c[k]);
                        temp = c[k];
                    }
                }
                if (list.size() > maxcount) {
                    list_result = list;
                    maxcount = list.size();
                } else if (list.size() == maxcount) {

                    int sum1 = 0;
                    int sum2 = 0;
                    for (int s = 0; s < maxcount; s++) {
                        sum1 += (int) list.get(s);
                    }
                    for (int s = 0; s < list.size(); s++) {
                        sum2 += (int) list_result.get(s);
                    }
                    if (sum1 > sum2) {
                        list_result = list;
                        maxcount = list.size();
                    }
                }
            }
        }
        return list_result;
    }
}