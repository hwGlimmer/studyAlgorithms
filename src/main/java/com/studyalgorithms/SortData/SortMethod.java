package com.studyalgorithms.SortData;

import cn.hutool.core.date.TimeInterval;

/**
 * @Author: weihu01
 *
 * @Desctription: 排序相关算法
 *
 * @Date: Created in 2024/4/26 12:45
 *
 * @Version: 1.0
 */
public class SortMethod {


    /**
     *  冒泡排序
     *  时间复杂度：O(n^2)
     *  空间复杂度：O(1)
     *
     * （1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
     * （2）这样对数组的第 0 个数据到 N-1 个数据进行一次遍历后，最大的一个数据就“沉”到数组第N-1 个位置。
     * （3）N=N-1，如果 N 不为 0 就重复前面二步，否则排序完成。
     * @param arr
     * @return
     */
    public int[] bubbleSortMethod(int[] arr) {

        int n = arr.length;

        // 比较N趟
        for (int i=0; i < n-1; i++){

            // 每次比较前后两个位置，如果前面的大，则交换，使得大的数字沉底
            for (int j = 0; j < n-i-1; j++){

                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    /**
     * 选择排序 稳定，不占用额外空间，比冒泡交换次数少
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     *
     * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
     * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕
     * @param arr
     * @return
     */
    public int[] selectSortMethod(int arr[]){

        int n = arr.length;

        for (int i=0; i < n-1; i++ ){

            int min = i;

            for (int j=i+1; j < n; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }

        return arr;
    }


    /**
     * 插入排序
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     *
     * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入，参考打扑克牌
     * @param arr
     * @return
     */
    public int[] insertionSortMethod(int arr[]){

        int n = arr.length;

        for (int i=1; i < n; i++){
            // 被比较的下标
            int index = i-1;

            // 抽出来作为插入值排序的目标值
            int insertVal = arr[i];

            // 如果没有前面的数大，则数字后移，被比较的值下标继续往前移动
            while (index >= 0 && arr[index] > insertVal){
                arr[index+1]  = arr[index];
                index --;
            }

            // 比较完之后，将被抽出来的数插入到符合条件的位置
            arr[index+1] = insertVal;
        }

        return arr;
    }


    /**
     * 希尔排序
     * 时间复杂度: 取决于增量序列
     * 空间复杂度: O(1)
     * 直接插入排序的升级版,将相距某个增量的记录两两组合成一个子序列，然后对每个子序列进行直接插入排序
     * @param arr
     * @return
     */
    public int[] shellSortMethod(int arr[]){

        int n = arr.length;

        // 设置增量为一半
        for (int gap=n/2; gap>0; gap /=2){

            // 每个增量内进行插入排序
            for (int i=gap; i<n; i++){
                int index = i-1;

                int insertVal = arr[i];

                while (index >=0 && arr[index] > insertVal){
                    arr[index+1] = arr[index];
                    index --;
                }
                arr[index+1] = insertVal;
            }
        }

        return arr;
    }


}
