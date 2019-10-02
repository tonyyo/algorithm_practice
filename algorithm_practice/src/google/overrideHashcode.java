package google;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class overrideHashcode {
    public static void main(String[] args){
//        HashMap h2=new HashMap();
//        for (int i=0;i<10;i++)
//            h2.put(new Element(i), new Figureout());// TODO: 19-9-29 1处
//        System.out.println("h2:");
//        System.out.println("Get the result for Element:");
//        Element test=new Element(5);// TODO: 19-9-29 ： 2处
//        if (h2.containsKey(test))// TODO: 19-9-29 按理来说这里应该时恒成立，但是呢，但是内存地址不同， 所以无法比较
//            System.out.println((Figureout)h2.get(test));
//        else
//            System.out.println("Not found");
        System.out.println(new Element1(3));
        System.out.print(new Element(3));
    }
}
class Element{
    int number;
    public Element(int n){
        number=n;
    }
    @Override // TODO: 19-9-29 右击，Generate，自动生成两个方法，改为值比较就好，不需比较地址
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element)) return false;
        Element element = (Element) o;
        return number == element.number;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override // TODO: 19-9-29 重写toString方法可输出类中属性及值，而不在输出乱码
    public String toString() {
        return "Element{" +
                "number=" + number +
                '}';
    }
}
class Element1 {
    int number;

    public Element1(int n) {
        number = n;
    }
}
class Figureout{
    Random r=new Random();
    boolean possible=r.nextDouble()>0.5;
    public String toString(){
        if (possible)
            return "OK!";
        else
            return "Impossible!";
    }
}
