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
public class FindEvenOrOddWithoutModulus {

    public static void main(final String[] args) {

        int n = 5;

        if (((n / 2) * 2) == n) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}
