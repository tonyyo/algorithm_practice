package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:

 Description

Find the count of numbers less than N having exactly 9 divisors

1<=T<=1000,1<=N<=10^12


Input

First Line of Input contains the number of testcases. Only Line of each testcase contains the number of members N in the rival gang.


Output

Print the desired output.


Sample Input 1

2
40
5
Sample Output 1

1
0

 * @Modify By:
 *
 * */

import java.util.Scanner;

public class 有九个因素的数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        for (int k = 0; k < caseNum; k++) {
            int N = scanner.nextInt();
            int count = 0;
            for (int i = 1; i < N; i++) {
                if (judgePrime(i)){
                    if(Math.pow(i, 8) <= N && i != 1) {
                        System.out.println(i);
                        count++;
                    }
                }
                for (int j = 0; j < N; j++) {
                    if(judgePrime(i) && judgePrime(j) && i != 1 && j != 1 && i != j){
                        if ((Math.pow(i, 2) * Math.pow(j, 2))<=N){
                            System.out.println(i+" "+j);
                            count++;
                        }
                    }
                }
            }
            System.out.println(count/2);
        }
    }
    static boolean judgePrime(int num) {
        boolean flag = true;
        if(num == 2 ) return true;
        if(num == 3 ) return true;
        if(num % 6 != 1 && num % 6 !=5) flag = false; // TODO: 19-10-22  不在6的倍数的两侧的一定不是质数
        for(int j = 5; j <= Math.sqrt(num); j+=2) { // TODO: 19-10-22 在6的倍数两侧的也可能不是质数，
            // TODO: 19-10-22   一个数若可以进行因数分解，那么分解时得到的两个数一定是一个小于等于sqrt(n)，一个大于等于sqrt(n)，
            //  据此，上述代码中并不需要遍历到n-1，遍历到sqrt(n)即可，因为若sqrt(n)左侧找不到约数，那么右侧也一定找不到约数。
            if(num%j == 0) flag = false;
        }
        return flag;
    }
}
