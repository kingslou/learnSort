public class Sort {
    public static int[] arrayInt = {0,1,5,3,2,6,4,9,7,8};
    public static void main(String[] args) {
        System.out.print("排序算法学习");
        int[] sortResult = SortUtils.sortResult(arrayInt,true);
        System.out.print("选择排序后");
        for(int i : sortResult){
            System.out.print(i+"");
        }
    }
}
