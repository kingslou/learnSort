public class SortUtils {

    /***
     * 选择排序
     * 从数组一端选择一个数组中的一个元素,
     * 通过比较对比取出最小值(或者最大值)放在array的左边(右边 这里主要视遍历的开始为左还是右)
     * 逐个遍历
     * @param arraySort
     * @return
     */
    public static int[] sortResult(int[] arraySort, boolean asc) {
        for (int i = 0; i < arraySort.length; i++) {
            int minPos = i;
            //遍历从第一个后面的所有数据，找出最大 或者最小的一个
            for (int j = i + 1; j < arraySort.length; j++) {
                if (asc) {
                    //如果右边最小的
                    if (arraySort[j] < arraySort[minPos]) {
                        minPos = j;
                    }
                } else {
                    //找出右边最大的
                    if (arraySort[j] > arraySort[minPos]) {
                        minPos = j;
                    }
                }

            }
            //交换数据
            if (asc) {
                if (arraySort[i] > arraySort[minPos]) {
                    int temp = arraySort[i];
                    arraySort[i] = arraySort[minPos];
                    arraySort[minPos] = temp;
                }
            } else {
                if (arraySort[i] < arraySort[minPos]) {
                    int temp = arraySort[i];
                    arraySort[i] = arraySort[minPos];
                    arraySort[minPos] = temp;
                }
            }

        }
        return arraySort;
    }

    /***
     * 快速排序
     * 选择一个元素(一般取array的第一个元素),然后作为目标元素,
     * 将array中比目标元素小的放在目标元素左边,比目标元素大的放在目标元素右边;
     * 然后继续用相同方式排列左右两边的array
     * @param arraySort
     * @return
     */
    public static int[] sortResult1(int[] arraySort){

        return arraySort;
    }
}
