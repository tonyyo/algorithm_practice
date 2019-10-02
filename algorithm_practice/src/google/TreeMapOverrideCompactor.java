package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapOverrideCompactor {
    public static void main(String[] args) {
        demoTwo();
    }
    public static void demoTwo() {

            //需求:将字符串按照长度排序
            TreeMap<String,String> tm = new TreeMap<>(new Comparator<String>() {

                @Override
                public int compare(String s1, String s2) {        //按照字符串的长度比较
                    int num = s1.length() - s2.length();        //长度为主要条件
                    return num == 0 ? s1.compareTo(s2) : num;    //内容为次要条件
                }
                // TODO: 19-9-28 匿名内部类也可以调用方法，相当于一个实例对象
            }.reversed());
            tm.put("4","2");
            tm.put("19982","3");
            tm.put("183","1");
            tm.put("23","3");
            tm.put("ca","5");
            System.out.println(tm);
    }
}