package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import jdk.management.cmm.SystemResourcePressureMXBean;

import java.util.ArrayList;
import java.util.Scanner;

public class numOfReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        int len = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(scanner.nextInt());
        }


//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (i < j && list.get(i) > list.get(j))
//                    count++;
//                else if (i > j && list.get(i) < list.get(j))
//                    count++;
//                else
//                    continue;
//            }
//        }
//        System.out.print(count/2);
    }
}
