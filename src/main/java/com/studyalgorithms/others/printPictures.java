package com.studyalgorithms.others;

import java.util.Scanner;

/**
 * @Author: weihu01
 * @Desctription: 打印一些图形练习
 * @Date: Created in 2024/6/1 17:44
 * @Version: 1.0
 */
public class printPictures {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.打印乘法表\n2.打印菱形");

        switch (scanner.nextLine()) {
            case "1":
                printMultiplicationTable();
                break;
            case "2":
                printDiamond();
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

    /**
     * 打印乘法表
     * 1 * 1 = 1
     * 1 * 2 = 2	2 * 2 = 4
     * 1 * 3 = 3	2 * 3 = 6	3 * 3 = 9
     * 1 * 4 = 4	2 * 4 = 8	3 * 4 = 12	4 * 4 = 16
     * 1 * 5 = 5	2 * 5 = 10	3 * 5 = 15	4 * 5 = 20	5 * 5 = 25
     * 1 * 6 = 6	2 * 6 = 12	3 * 6 = 18	4 * 6 = 24	5 * 6 = 30	6 * 6 = 36
     * 1 * 7 = 7	2 * 7 = 14	3 * 7 = 21	4 * 7 = 28	5 * 7 = 35	6 * 7 = 42	7 * 7 = 49
     * 1 * 8 = 8	2 * 8 = 16	3 * 8 = 24	4 * 8 = 32	5 * 8 = 40	6 * 8 = 48	7 * 8 = 56	8 * 8 = 64
     * 1 * 9 = 9	2 * 9 = 18	3 * 9 = 27	4 * 9 = 36	5 * 9 = 45	6 * 9 = 54	7 * 9 = 63	8 * 9 = 72	9 * 9 = 81
     */
    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }

    /**
     * 打印菱形
     * *
     * ***
     * *****
     * *******
     * *****
     * ***
     * *
     */
    public static void printDiamond() {

        // 菱形的行数 一半
        int n = 4;

        // 打印上半部分
        for (int i = 0; i < n; i++) {
            // 打印空格
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int t = 0; t < 2 * i + 1; t++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        // 打印下半部分
        for (int i = n - 2; i >= 0; i--) {

            // 打印空格
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int t = 0; t < 2 * i + 1; t++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
