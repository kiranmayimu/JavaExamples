/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp;

/**
 * @author kiranmayi.mu
 *
 */
public class BubbleSort {

    public static void bubble_sort(final int array[]) {

        for (int i = 0; i < (array.length - 1); i++) {

            for (int j = 0; j < (array.length - 1 - i); j++) {

                int k = j + 1;

                if (array[j] > array[k]) {

                    // array[j].compareTo(array[k]) > 0

                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void printNumbers(final int[] input) {
        for (int element : input) {
            System.out.print(element + ", ");
        }
        System.out.println("\n");
    }

    public static void main(final String[] args) {

        int[] input = new int[] { 21, 3, 10, 7, 1 };

        bubble_sort(input);

        printNumbers(input);
    }
}