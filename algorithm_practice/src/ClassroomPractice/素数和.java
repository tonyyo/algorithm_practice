package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.*;

public class 素数和 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int T = in.nextInt();

            for (int t=0;t<T;t++) {
                int a=in.nextInt();
                twoAdd(a);

            }
        }
        private static void twoAdd(int n){
            for(int i=2;i<n/2+1;i++){
                if(isPrime(i)&&isPrime(n-i)){
                    System.out.println((i)+" "+(n-i));
                    break;
                }
            }
        }
        //判断素数
        private static boolean isPrime(int m){
            boolean flag = true;
            for(int i=2;i<Math.sqrt(m)+1;i++){
                if(m%i==0){
                    flag = false;
                    break;
                }
            }
            return flag;
        }
}

