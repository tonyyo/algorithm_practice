/*
 * @Author:vincent
 * @Describe:第八题
 * @Date:下午4:35 19-9-17
 */
/*
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String s1 = scanner.nextLine();
            String[] arr = s1.split(" ");
            Integer sum = 0;
            for (int j = 0; j < Integer.valueOf(arr[arr.length-1]); j++) {
                sum = sum + Integer.valueOf(arr[j]);
            }
            if (sum != 0)
                sums.add(sum);
        }
        int count=0;
        for (Integer sum : sums) {
            count++;
            if (count == sums.size())
                System.out.print(sum);
            else
            {
                System.out.println(sum);
                System.out.println();
            }
        }
    }
}*/




/*
 * @Author:vincent
 * @Describe:第七题
 * @Date:下午4:32 19-9-17
 */
/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String line = scanner.nextLine();
            String[] s = line.split(" ");
            Integer sum = 0;
            for (int j = 0; j < s.length; j++) {
                sum = sum + Integer.valueOf(s[j]);
            }
            sums.add(sum);
        }
        int count=0;
        for (Integer sum : sums) {
            count++;
            if (count == sums.size())
                System.out.print(sum);
            else
            {
                System.out.println(sum);
                System.out.println();
            }
        }
    }
}*/

/*
 * @Author:vincent
 * @Describe:第六题
 * @Date:下午4:25 19-9-17
 */
/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String s1 = scanner.nextLine();
            String[] arr = s1.split(" ");
            Integer sum = 0;
            for (int j = 1; j < Integer.valueOf(arr[0])+1; j++) {
                sum = sum + Integer.valueOf(arr[j]);
            }
            if (sum != 0)
                sums.add(sum);
        }
        int count=0;
        for (Integer sum : sums) {
            count++;
            if (count == sums.size())
                System.out.print(sum);
            else
                System.out.println(sum);
        }
    }
}*/



/*
 * @Author:vincent
 * @Describe:第五题报错，同第四题
 * @Date:下午4:23 19-9-17
 */

/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String s1 = scanner.nextLine();
            String[] arr = s1.split(" ");
            Integer sum = 0;
            for (int j = 1; j < Integer.valueOf(arr[0])+1; j++) {
                sum = sum + Integer.valueOf(arr[j]);
            }
            if (sum != 0)
                sums.add(sum);
        }
        int count=0;
        for (Integer sum : sums) {
            count++;
            if (count == sums.size())
            {
                System.out.print(sum);
            }
            else
                System.out.println(sum);
        }
    }
}*/
/*
 * @Author:邱瑜
 * @Describe:采用nextInt比直接采用nextLine要好，不会那么麻烦
 * @Date:下午9:37 19-9-17
 */
/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int count = input.nextInt();
        int sum=0;
        while(count!=0)
        {
            int s = input.nextInt();
            for(int i = s;i>0;i--)
            {
                int temp = input.nextInt();
                sum+=temp;
            }
            System.out.println(sum);
            count--;
            sum = 0;
        }
    }
}*/
/*
 * @Author:vincent
 * @Describe:第四题
 * @Date:下午4:19 19-9-17
 */
/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String s1 = scanner.nextLine();
            String[] arr = s1.split(" ");
            Integer sum = 0;
            for (int j = 1; j <= Integer.valueOf(arr[arr.length-1]); j++) {
                sum = sum + Integer.valueOf(arr[j]);
            }
            if (sum != 0)
                sums.add(sum);
        }
        int count=0;
        for (Integer sum : sums) {
                count++;
                if (count == sums.size())
                    System.out.print(sum);
                else
                    System.out.println(sum);
        }
    }
}*/
/*
 * @Author:邱渝
 * @Describe:
 * @Date:下午9:41 19-9-17
 */
/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int count = 3;
        int sum=0;
        while(count!=0)
        {
            int s = input.nextInt();
            for(int i = s;i>0;i--)
            {
                int temp = input.nextInt();
                sum+=temp;
            }
            if(sum != 0)
                System.out.println(sum);
            count--;
            sum = 0;
        }
    }
}*/


/*
 * @Author:vincent
 * @Describe:第三题
 * @Date:下午3:35 19-9-17
 */
/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            String[] s = line.split(" ");
            Integer sum = 0;
            for (int j = 0; j < s.length; j++) {
                sum = sum + Integer.valueOf(s[j]);
            }
            sums.add(sum);
        }
        for (Integer sum : sums) {
            if (sum != 0)
                System.out.println(sum);
        }
    }
}*/


/*
import java.util.ArrayList;
import java.util.Scanner;
*/
/*
 * @Author:vincent
 * @Describe:第二题
 * @Date:下午12:43 19-9-17
 *//*

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String line = scanner.nextLine();
            String[] s = line.split(" ");
            Integer sum = 0;
            for (int j = 0; j < s.length; j++) {
                sum = sum + Integer.valueOf(s[j]);
            }
            sums.add(sum);
        }
        for (Integer sum : sums) {
            System.out.println(sum);
        }
    }
}
*/


/*
 * @Author:vincent
 * @Describe:第一题
 * @Date:下午12:42 19-9-17
 *//*public class Main{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                int j = scanner.nextInt();
                int sum = i + j;
                System.out.println(sum);
            }
        }
    }*/
