/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2017 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.numbers;

public class FindEvenOrOddNumber {

    public static void main(final String[] args) {

        // create an array of 10 numbers
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int number : numbers) {

            /*
             * use modulus operator to check if the number is even or odd.
             * If we divide any number by 2 and reminder is 0 then the number is
             * even, otherwise it is odd.
             */

            if ((number % 2) == 0) {
                System.out.println(number + " is even number.");
            } else {
                System.out.println(number + " is odd number.");
            }
        }
    }
}
