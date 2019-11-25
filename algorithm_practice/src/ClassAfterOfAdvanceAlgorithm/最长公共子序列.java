package ClassAfterOfAdvanceAlgorithm;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.Scanner;
import java.util.TreeSet;

public class 最长公共子序列 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int caseNum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < caseNum; i++) {
            String first = sc.nextLine();
            String sec = sc.nextLine();
            char[] firstArray = first.toCharArray();
            char[] secArray = sec.toCharArray();
            TreeSet<Integer> treeSet = new TreeSet<>();

            int[][] count = new int[firstArray.length][secArray.length];
            int[][] flags = new int[firstArray.length][secArray.length];


            //分为两种情况讨论：
            //1、行列都为0  2、行列不都为0（行为0列不为0；行不为0列为0；行列都不为0）
            for (int j = 0; j < firstArray.length; j++) {
                for (int k = 0; k < secArray.length; k++) {
                    if (j == 0 && k == 0 ){
                        if(firstArray[j] == secArray[k]){
                            count[0][0] = 1;
                            flags[j][k] = 1;
                        }

                    }
                    else{
                        if(firstArray[j] == secArray[k]){//相等的情况分为i=0、j=0、i！=0&&j！=0
                            if (j == 0 && k!=0)
                                count[j][k]=count[j][k-1] +1;
                            else if (k == 0 && j!=0)
                                count[j][k]=count[j-1][k] +1;
                            else
                                count[j][k]=count[j-1][k-1] + 1;
                        }

                        else if(firstArray[j] < secArray[k]){//不相等的情况分为i=0、j=0、i！=0&&j！=0
                            if (j == 0 && k!=0)
                                count[j][k]=count[j][k-1];
                            else if (k == 0 && j!=0)
                                count[j][k]=count[j-1][k];
                            else
                                count[j][k]=Math.max(count[j-1][k], count[j][k-1]);
                            flags[j][k] = 2;
                        }
                        else if(firstArray[j] > secArray[k]){//不相等的情况分为i=0、j=0、i！=0&&j！=0
                            if (j == 0 && k!=0)
                                count[j][k]=count[j][k-1];
                            else if (k == 0 && j!=0)
                                count[j][k]=count[j-1][k];
                            else
                                count[j][k]=Math.max(count[j-1][k], count[j][k-1]);
                            flags[j][k] = 3;
                        }
                    }

                }
            }

            for (int j = 0; j < firstArray.length; j++) {
                for (int k = 0; k < secArray.length; k++) {
                    System.out.print(count[j][k]);
                }
                System.out.println();
            }
        }
    }
}
