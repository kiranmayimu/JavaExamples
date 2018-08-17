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
public class CheckPrimeNumber {

    public static void main(final String[] args) {

        int num = 19;

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if ((num % i) == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        }
    }
}
