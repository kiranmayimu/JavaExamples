/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2017 EVRY. ALL RIGHTS RESERVED
 */
package com.exp;

public class FindLargestSmallestNumber {

    public static void main(final String[] args) {

        int numbers[] = new int[] { 0, 43, 53, 54, 32, 65, 63, 980, 43, 23 };

        // assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largetst = numbers[0];

        for (int number : numbers) {

            if (number > largetst) {
                largetst = number;
            } else if (number < smallest) {
                smallest = number;
            }

        }
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
    }
}
