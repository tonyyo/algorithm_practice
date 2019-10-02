package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.*;

public class toStringSource {
    public static void main(String[] args) {
        HashMap h1=new HashMap();
        Random r1=new Random();
        // TODO: 19-9-29 随机产生1000个随机数，并计算产生的随机数的个数
        for (int i=0;i<1000;i++){
            // TODO: 19-9-29 取随机值
            Integer t=new Integer(r1.nextInt(20));
            if (h1.containsKey(t))
                ((Ctime)h1.get(t)).count++;
            else
                // TODO: 19-9-29 此时count=1
                h1.put(t, new Ctime());
        }
        System.out.println(h1);
    }

}

class Ctime{
    int count=1;
    public String toString(){
        // TODO: 19-9-29 Integer.toString方法底层实现是用除法分别算出个位十位求出来的
        return Integer.toString(count);
    }
}