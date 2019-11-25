package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.Scanner;

public class 订单问题 {

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tc= sc.nextInt();
        while(tc-- >0)
        {
            int N= sc.nextInt();
            int X= sc.nextInt();
            int Y= sc.nextInt();

            int A[]=new int[N];
            int B[]=new int[N];

            for(int i=0;i<N;i++)
                A[i]=sc.nextInt();
            for(int i=0;i<N;i++)
                B[i]=sc.nextInt();

            int dp[][]=new int[X+1][Y+1];

            for(int i=1;i<=X;i++)
                dp[i][0]= A[i-1] + dp[i-1][0];
            for(int i=1;i<=Y;i++)
                dp[0][i]= B[i-1] + dp[0][i-1];

            for(int i=1;i<=X;i++)
            {
                for(int j=1;j<=Y;j++)
                {
                    if(i+j <= N)
                    {
                        int op1= A[i+j-1] + dp[i-1][j];
                        int op2= B[i+j-1] + dp[i][j-1];

                        dp[i][j] = Math.max( op1 , op2 );
                    }
                    else
                        dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1] );
                }
            }

            System.out.println(dp[X][Y]);
        }
    }

}
