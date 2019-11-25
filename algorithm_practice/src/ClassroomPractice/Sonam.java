package ClassroomPractice;/*
 * @Author:vincent
 * @Describe:
 * @Modify By:
 *
 * */
import java.math.BigInteger;
import java.util.Scanner;

public class Sonam {
    static class Ele{
        BigInteger l,r, realLeft, realRight;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        for (int z = 0; z < a; z++){
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            scanner.nextLine();
            Sonam.Ele[] eles = new Sonam.Ele[n];
            String[] nums = scanner.nextLine().trim().split(" ");
            int index = 0;
            for (int i = 0; i < n; i++){
                eles[i] = new Sonam.Ele();
                eles[i].l = new BigInteger(nums[index++]);
                eles[i].r = new BigInteger(nums[index++]);

            }
            eles[0].realLeft = eles[0].l;
            eles[0].realRight = eles[0].r;
            for (int i = 1; i < n && nums.length > index; i++){
                eles[i].realLeft = eles[i - 1].realRight.add(new BigInteger("1"));
                eles[i].realRight = eles[i].realLeft.add( eles[i].r).subtract(eles[i].l);
            }
            nums = scanner.nextLine().trim().split(" ");
            index = 0;
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < q && nums.length > index; k++){
                BigInteger ll = new BigInteger(nums[index++]);
                for (int i = 0; i < n; i++){
                    if(eles[i].realLeft.compareTo(ll) <= 0 && ll.compareTo(eles[i].realRight) <= 0){
                        BigInteger tt = ll.subtract(eles[i].realLeft).add(eles[i].l);
                        sb.append(tt.toString() + " ");
                    }
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
