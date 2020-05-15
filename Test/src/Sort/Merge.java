package Sort;

import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] array) {
        mergeSortHelper(array, 0, array.length);
    }

    // [low, high) 前闭后开区间, 两者差值小于等于 1, 区间中就只有 0 个元素或者 1 个元素
    private static void mergeSortHelper(int[] array, int low, int high) {
        if (high - low <= 1) {
            return;
        }
        int mid = (low + high) / 2;
        // 这个方法执行完, 就认为 low, mid 已经排序ok
        mergeSortHelper(array, low, mid);
        // 这个方法执行完, 就认为, mid, high 也已经排序ok
        mergeSortHelper(array, mid, high);

        // 当把左右区间已经归并排序完了, 说明左右区间已经是有序区间了.
        // 接下来就可以针对两个有序区间进行合并了.
        merge(array, low, mid, high);
    }
    // [low, mid)   有序区间
    // [mid, high)  有序区间
    // 把这两个有序区间合并成一个有序区间.
    public static void merge(int[] array, int low, int mid, int high) {
        int[] output = new int[high - low];
        int outputIndex = 0;  // 记录当前 output 数组中被放入多少个元素了
        int cur1 = low;
        int cur2 = mid;

        while (cur1 < mid && cur2 < high) {
            // 这里写成 <= 才能保证稳定性.
            if (array[cur1] <= array[cur2]) {
                output[outputIndex] = array[cur1];
                outputIndex++;
                cur1++;
            } else {
                output[outputIndex] = array[cur2];
                outputIndex++;
                cur2++;
            }
        }
        // 当上面的循环结束的时候, 肯定是 cur1 或者 cur2 有一个先到达末尾, 另一个还剩下一些内容
        // 把剩下的内容都一股脑拷贝到 output 中
        while (cur1 < mid) {
            output[outputIndex] = array[cur1];
            outputIndex++;
            cur1++;
        }

        while (cur2 < high) {
            output[outputIndex] = array[cur2];
            outputIndex++;
            cur2++;
        }

        // 把output中的元素再搬运回原来的数组
        for (int i = 0; i < high - low; i++) {
            array[low + i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] array = {6,3,4,7,2,1,9,0};
        System.out.print("排序前：");
        System.out.print(Arrays.toString(array));
        System.out.println();
        mergeSort(array);
        System.out.print("排序后：");
        System.out.print(Arrays.toString(array));
    }
}
