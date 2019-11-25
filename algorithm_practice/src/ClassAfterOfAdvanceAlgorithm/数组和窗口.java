package ClassAfterOfAdvanceAlgorithm;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.*;

public class 数组和窗口 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        // TODO: 19-10-16 空格也是字符，不能用toCharArray
        String[] split = line.split(" ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            int num = Integer.valueOf(split[i]);
            list.add(num);
        }

        int SUM = 0;
        for (int i = 0; i + size <= list.size(); i++) {
            int sum = Integer.MIN_VALUE;
            for (int j = i; j < i + size; j++) {
                sum = sum < list.get(j) ? list.get(j) : sum;
            }
            SUM = SUM + sum;
        }
        System.out.println(SUM);
    }
}
