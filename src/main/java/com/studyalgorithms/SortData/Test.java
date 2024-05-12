package com.studyalgorithms.SortData;


import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 1, 6, 3, 7, 4};

        System.out.println( "冒泡排序" + Arrays.toString(new SortMethod().bubbleSortMethod(Arrays.copyOf(arr,arr.length))));

        System.out.println( "选择排序" + Arrays.toString(new SortMethod().selectSortMethod(Arrays.copyOf(arr,arr.length))));

        System.out.println( "插入排序" + Arrays.toString(new SortMethod().insertionSortMethod(Arrays.copyOf(arr,arr.length))));

        System.out.println( "希尔排序" + Arrays.toString(new SortMethod().shellSortMethod(Arrays.copyOf(arr,arr.length))));

        System.out.println( "归并排序" + Arrays.toString(new SortMethod().mergeSortMethod(Arrays.copyOf(arr,arr.length))));


    }
}
