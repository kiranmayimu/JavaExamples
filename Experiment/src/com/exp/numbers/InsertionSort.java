/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.numbers;

/**
 * @author kiranmayi.mu
 *
 */
public class InsertionSort {

    private static void insertion_sort(final int[] input) {

        int temp, j;

        for (int i = 1; i < input.length; i++) {

            temp = input[i];

            j = i;

            while ((j > 0) && (input[j - 1] > temp)) {

                input[j] = input[j - 1];
                j = j - 1;
            }
            input[j] = temp;
        }
    }

    private static void printNumbers(final int[] input) {
        for (int element : input) {
            System.out.print(element + ", ");
        }
        System.out.println("\n");
    }

    public static void main(final String[] args) {

        int[] input = new int[] { 1, 21, 3, 10, 7, 1 };

        insertion_sort(input);

        printNumbers(input);
    }
}
