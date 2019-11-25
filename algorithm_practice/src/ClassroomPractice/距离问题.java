package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.awt.*;
import java.util.*;
import java.util.List;


public class 距离问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- != 0) {
            int count = sc.nextInt();
            Integer[][] array = new Integer[count][2];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            System.out.println(compairDis(array));
        }
    }

    private static int compairDis(Integer[][] array) {
        Map<Integer, Integer> x = new HashMap<>();
        Map<Integer, Integer> y = new HashMap<>();
        Map<Integer[], Integer> xy = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int x_count = x.containsKey(array[i][0]) ? x.get(array[i][0]) : 0;
            x.put(array[i][0], x_count + 1);
            int y_count = y.containsKey(array[i][1]) ? y.get(array[i][1]) : 0;
            y.put(array[i][1], y_count + 1);
            int xy_count = xy.containsKey(array[i]) ? xy.get(array[i]) : 0;
            xy.put(array[i], xy_count + 1);
        }
        int xAns = 0, yAns = 0, xyAns = 0;
        for (Integer xCoordinatePair : x.keySet()) {
            int xFrequency = x.get(xCoordinatePair);
            int sameXPairs = (xFrequency * (xFrequency - 1)) / 2;
            xAns += sameXPairs;
        }
        for (Integer yCoordinatePair : y.keySet()) {
            int yFrequency = y.get(yCoordinatePair);
            int sameYPairs = (yFrequency * (yFrequency - 1)) / 2;
            yAns += sameYPairs;
        }
        for (Integer[] xyCoordinatePair : xy.keySet()) {
            int xyFrequency = xy.get(xyCoordinatePair);
            int sameXYPairs = (xyFrequency * (xyFrequency - 1)) / 2;
            xyAns += sameXYPairs;
        }
        return (xAns + yAns - xyAns);
    }
}