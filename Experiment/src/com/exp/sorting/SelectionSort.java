/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.sorting;

/**
 * @author kiranmayi.mu
 *
 */
public class SelectionSort {

    public static void selection_sort(final int array[]) {

        int min, temp = 0;

        for (int i = 0; i < array.length; i++) {

            min = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[min]) {

                    min = j;

                }
            }

            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
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

        selection_sort(input);

        printNumbers(input);
    }
}