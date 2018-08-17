/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2017 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.numbers;

public class NumberFactorial {

    public static void main(final String[] args) {

        int factorial = 5;

        int number = factorial;

        for (int i = number - 1; i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
