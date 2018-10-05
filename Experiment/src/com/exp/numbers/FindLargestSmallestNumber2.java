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
public class FindLargestSmallestNumber2 {

    public static void main(final String[] args) {

        int[] array = new int[] { 3, 2, 1, 7, 4, 5, 6, 9, 8 };

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int element : array) {

            if (element > largest) {

                second_largest = largest;
                largest = element;

            }

            else if ((element > second_largest) && (element != largest)) {
                second_largest = element;
            }
        }
        System.out.println("Second largest element is : " + second_largest);
    }
}
