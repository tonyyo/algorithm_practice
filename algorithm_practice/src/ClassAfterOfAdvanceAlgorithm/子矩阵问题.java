package ClassAfterOfAdvanceAlgorithm;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 子矩阵问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print(MaximalRectangle(matrix));
    }
    static int LargestRectangleArea(int[] height) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < height.length; i++) {
            list.add(height[i]);
        }
        List<Integer> tempList = new ArrayList<>();
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(0)){
                tempList.add(list.get(i));
                if(i == list.size()-1)
                {
                    int Min = Integer.MAX_VALUE;
                    for (int j = 0; j < tempList.size(); j++) {
                        Min = Math.min(Min, tempList.get(j));
                    }
                    Max = Math.max(Max, Min * tempList.size());
                    System.out.println(Max + " " + tempList.size());
                    tempList.clear();
                }
            }
            else {
                if (!tempList.isEmpty()) {
                    int Min = Integer.MAX_VALUE;
                    for (int j = 0; j < tempList.size(); j++) {
                        Min = Math.min(Min, tempList.get(j));
                    }
                    Max = Math.max(Max, Min * tempList.size());
                    System.out.println(Max + " " + tempList.size());
                    tempList.clear();
                }
            }
        }
        return Max;
    }
        static int MaximalRectangle(int[][] rec){
            int m = rec.length;//行
            int n = rec[0].length;//列
            int max = 0;
            for (int i = 0; i < m; i++) {
                int[] h = new int[rec[0].length];//按列长建数组
                for (int j = 0; j < n; j++) {
                    if (i == 0)
                        h[j] = rec[i][j];
                    else {
                        h[j] = rec[i][j] == 0 ? 0 : rec[i - 1][j] + 1;
                        rec[i][j] = h[j];  //更新数组
                    }
                }
                max = Math.max(max, LargestRectangleArea(h));

            }
            return max;
        }

}
