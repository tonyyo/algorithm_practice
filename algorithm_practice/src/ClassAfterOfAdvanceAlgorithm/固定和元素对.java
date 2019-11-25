package ClassAfterOfAdvanceAlgorithm;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 固定和元素对 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String str = sc.nextLine();
        String[] split = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            list.add(Integer.valueOf(split[i]));
        }
        int sum = sc.nextInt();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j)))
                    continue;
                else{
                    if (list.get(i) + list.get(j) == sum)
                        count++;
                }
            }
        }
        System.out.print(count/2);
    }
}
