package com.studyalgorithms.SortData;


import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 1, 6, 3, 7, 4};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入排序方法：1.冒泡排序 2.选择排序 3.插入排序 4.希尔排序 5.归并排序");

        switch (scanner.nextInt()){
            case 1:
                System.out.println("冒泡排序" + Arrays.toString(new SortMethod().bubbleSortMethod(Arrays.copyOf(arr,arr.length))));
                break;
            case 2:
                System.out.println("选择排序" + Arrays.toString(new SortMethod().selectSortMethod(Arrays.copyOf(arr,arr.length))));
                break;
            case 3:
                System.out.println("插入排序" + Arrays.toString(new SortMethod().insertionSortMethod(Arrays.copyOf(arr,arr.length))));
                break;
            case 4:
                System.out.println("希尔排序" + Arrays.toString(new SortMethod().shellSortMethod(Arrays.copyOf(arr,arr.length))));
                break;
            case 5:
                System.out.println("归并排序" + Arrays.toString(new SortMethod().mergeSortMethod(Arrays.copyOf(arr,arr.length))));
                break;
            default:
                System.out.println("输入错误");
                break;
        }


    }
}
