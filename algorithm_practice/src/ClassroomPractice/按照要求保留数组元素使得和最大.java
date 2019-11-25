package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class 按照要求保留数组元素使得和最大 {

    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0) {

            int n=sc.nextInt();

            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0; i<n; i++)
                a.add(sc.nextInt());

            Collections.sort(a);

            int sum=0;
            while(!a.isEmpty()) {

                int x = a.remove(a.size()-1);
                int ind=Collections.binarySearch(a, (x-1));
                sum += x;

                if(ind>=0)
                    a.remove(ind);
            }

            System.out.println(sum);
            --t;
        }
    }
}
