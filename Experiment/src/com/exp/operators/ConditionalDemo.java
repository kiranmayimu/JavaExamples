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
public class ConditionalDemo {

    public static void main(final String[] args) {

        int value1 = 1;
        int value2 = 2;

        if ((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }
        if ((value1 == 1) || (value2 == 1)) {
            System.out.println("value1 is 1 OR value2 is 1");
        }

        // ternary
        int result;
        boolean someCondition = false;
        result = someCondition ? value1 : value2;
        System.out.println(result);
    }
}
