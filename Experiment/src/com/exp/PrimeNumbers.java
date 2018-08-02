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
public class PrimeNumbers {

    public static void main(final String[] args) {

        int temp = 0;

        for (int i = 2; i < 10; i++) {

            for (int j = 2; j < i; j++) {

                if ((i % j) == 0) {
                    temp = temp + 1;
                }
            }

            if (temp == 0) {
                System.out.println(i);
            } else {
                temp = 0;
            }
        }

    }
}
