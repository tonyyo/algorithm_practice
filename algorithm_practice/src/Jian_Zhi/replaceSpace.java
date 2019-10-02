package Jian_Zhi;/*
 * @Author:vincent
 * @Describe:
 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Modify By:
 *
 * */

public class replaceSpace {
    public static void main(String[] args) {
        String string = "We Are Happy";
        System.out.println(replaceSpace(new StringBuffer(string)));
    }
    public static  String replaceSpace(StringBuffer str) {
        String string = str.toString();
//        string = string.replaceAll(" ","20%");
        // TODO: 19-9-26 调用了string的函数后，要重新赋值给String，不然等于白做。上面的方式也可以，
        //  不过下面的方式更装逼，星号表示0个或多个
       string = string.replaceAll("[\\s*]","%20");
        return  string;
    }
}
