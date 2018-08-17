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
public class FibonacciSeries {

    public static void main(final String[] args) {

        int n = 3, t1 = 0, t2 = 1;

        for (int i = 1; i <= n; ++i) {

            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
