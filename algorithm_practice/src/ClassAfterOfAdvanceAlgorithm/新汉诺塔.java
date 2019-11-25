package ClassAfterOfAdvanceAlgorithm;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.Scanner;

public class 新汉诺塔 {
    static int count = 0;
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        int N = sc.nextInt();*/
        int N = 2;
        String A = "a",B = "b", C = "c";
        hanoi(N, A, B, C);
        System.out.print(count);
    }

    // TODO: 19-10-16 将n层汉诺塔从from 移到to，禁止从A移到C
    static void hanoi(int N, String from, String middle, String to){
        String A = from,B = middle, C = to;

        if(N==1) {//出口，当只有一层时
            move(A,B);
            move(B,C);
        }
        else{//必须要有else语句，不能盲目进入递归。
            hanoi(N-1, A, B, C);// TODO: 19-10-16 自己想办法从A-C，而不是程序中体现。
            move(A,B);
            hanoi(N-1, C, B, A);
            move(B,C);
            hanoi(N-1, A, B, C);
        }

    }
    static void move(String from, String to){
        //System.out.println(from + "-->" + to);
        count++;
    }

/*    // TODO: 19-10-16 将n层汉诺塔从from 移到to，普通汉诺塔问题
    static void hanoi(int N, String from, String middle, String to){
        String A = from,B = middle, C = to;

        if(N==1)//出口，当只有一层时，直接从from到to
            System.out.println(A + "-->" + C);
        else{//必须要有else语句，不能盲目进入递归。
            hanoi(N-1, A, C, B);//将前n-1个盘子，从from移到middle
            System.out.println(A + "-->" + C);//将最后一个盘子，从from移到to
            hanoi(N-1, B, A, C);//将n-1个盘子从middle移到to
        }

    }*/
}
