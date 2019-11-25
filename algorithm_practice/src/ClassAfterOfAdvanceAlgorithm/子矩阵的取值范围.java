package ClassAfterOfAdvanceAlgorithm;
import java.util.*;

/**
 * 最大值减去最小值小于或等于num的子数组数量
 * @author chaplinJ
 *
 */
public class 子矩阵的取值范围 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] split = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            list.add(Integer.valueOf(split[i]));
        }
        int num = sc.nextInt();
        int count1 = 0;
        for (int k = 2; k <= list.size(); k++) {
            for (int i = 0; i + k <= list.size(); i++) {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int j = i; j < i + k; j++) {
                    min = Math.min(min, list.get(j));
                    max = Math.max(max, list.get(j));
                }
                if(max - min > num)
                {
                    count1++;
                }
            }
        }
        System.out.print(count1);
    }
}

