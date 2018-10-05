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
public class FindSecondLargestNumber1 {

    public static void main(final String[] args) {

        int[] a = new int[] { 3, 2, 1, 7, 4, 5, 6, 9, 8 };

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                // descending order
                if (a[i] < a[j]) { // (a[i] > a[j]) ascending order

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println("Second largest element is : " + a[1]);
    }
}
