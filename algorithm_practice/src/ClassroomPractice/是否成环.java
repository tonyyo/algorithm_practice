package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 是否成环 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int t=0;t<T;t++) {


            String str = in.nextLine();
            String[] a = str.split(" ");
            int len=Integer.parseInt(a[0]);
            str = in.nextLine();
            a = str.split(" ");
            if(len==1)
            {
                if(a[0].charAt(0)==a[0].charAt(a[0].length()-1))
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else {
                boolean result = judge(a);
                if (result)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
    public static boolean judge(String[] str){
        List<String> list=new ArrayList<String>(Arrays.asList(str));
        String s=list.get(0);
        char c=s.charAt(0);
        list.remove(0);
        if(findCircle(s,list,c)){
            return true;
        }
        return false;
    }
    public static boolean findCircle(String s,List<String> strlist,char c){
        if(strlist.size()==1&&c==strlist.get(0).charAt(strlist.get(0).length()-1))
            if(s.charAt(s.length()-1)==strlist.get(0).charAt(0))
                return true;
        char tail=s.charAt(s.length()-1);
        for(int i=0;i<strlist.size();i++){
            if(tail==strlist.get(i).charAt(0)){
                List<String> newList=new ArrayList<>(strlist);
                newList.remove(i);
                if(findCircle(strlist.get(i),newList,c)){
                    return true;
                }
            }
        }
        return false;
    }


}
