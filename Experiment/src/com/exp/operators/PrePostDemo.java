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
public class PrePostDemo {

    public static void main(final String[] args) {

        int i = 3;

        System.out.println(i++); // 3

        i++;

        System.out.println(i);    // 5

        ++i;

        System.out.println(i);    // 6

        System.out.println(++i);  // 7

        System.out.println(i++);  // 7

        System.out.println(i);    // 8
    }
}
