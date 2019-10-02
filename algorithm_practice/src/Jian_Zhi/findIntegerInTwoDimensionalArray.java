package Jian_Zhi;
/*
* @Author:vincent
* @Describe:(用下面的方法虽然完美契合题意，但是时间超过了，还不如直接暴力破解。
* 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
* 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
* @Date:下午4:35 19-9-26
*/
public class findIntegerInTwoDimensionalArray {

    public static void main(String[] args) {
        int[][] arr = {{1,2},{4,5},{7,8},{10,11}};
        System.out.println(Find(5,arr));
    }

    public static boolean Find(int target, int [][] array) {
        int medium_rowNum=array.length/2;
        int medium_colNum=array[0].length/2;
        int i=medium_rowNum;
//        int j=medium_colNum;
        while(i>=0 && i<array.length)
        {
            // TODO: 19-9-26 此时这里的j要及时复位，不能定义在外面
            int j=medium_colNum;
            if(target == array[i][0])
                return true;
            else if (target > array[i][0])
            {
                while (j>=0 && j<array[0].length){
                    if (target == array[i][j])
                        return true;
                    else if (target < array[i][j])
                        j--;
                    else
                        j++;
                }
                i+=1;
            }
            else
            {
                while (j>=0 && j<array[0].length){
                    if (target == array[i][j])
                        return true;
                    else if (target < array[i][j])
                        j--;
                    else
                        j++;
                }
                i-=1;
            }
        }
        return false;
    }
}
