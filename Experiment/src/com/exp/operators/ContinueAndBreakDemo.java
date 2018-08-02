/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.operators;

/**
 * @author kiranmayi.mu
 *
 */
public class ContinueAndBreakDemo {

    public static void main(final String[] args) {

        System.out.println("continue-----");
        for (int i = 0; i < 10; i++) {
            if ((i >= 5) && (i <= 8)) {
                continue;
            } else {
                System.out.println(i);
            }
            System.out.println("in --- continue");
        }

        System.out.println("break-----");
        for (int i = 0; i < 10; i++) {
            if ((i >= 5) && (i <= 8)) {
                break;
            } else {
                System.out.println(i);
            }
            System.out.println("in --- break");
        }
    }
}
