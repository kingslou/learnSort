import java.util.Arrays;

public class Sort {
    public static int[] arrayInt = {0,1,5,3,2,6,4,9,7,8};
    public static void main(String[] args) {
        System.out.print("排序算法学习");
        int[] sortResult = SortUtils.sortResult(Arrays.copyOf(arrayInt,arrayInt.length),false);
        System.out.print("选择排序后");
        for(int i : sortResult){
            System.out.print(i+"");
        }

        System.out.print("冒泡排序");
        int[] sortResult1 = SortUtils.sortResult2(Arrays.copyOf(arrayInt,arrayInt.length));
        System.out.print("冒泡排序后");
        for(int i : sortResult1){
            System.out.print(i+"");
        }
    }
}
