import java.util.*;

/*
* @Author:dawei
* @Describe:第二题
* @Date:下午9:04 19-9-26
*/
public class Main {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        String []strArr = {"1","2","3"};
        // TODO: 19-9-30 创建数组对象要确定长度
        int[] arrCopy = new int[arr.length];
        // TODO: 19-9-30 拷贝数组
        System.arraycopy(arr,0,arrCopy,0,4);
        // TODO: 19-9-30 只有字符串数组才能这么转为list
        List<String> strings = Arrays.asList(strArr);


    }
}