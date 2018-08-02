/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.string;

/**
 * @author kiranmayi.mu
 *
 */
public class IndexOfChar {

    public static void main(final String[] args) {

        String str = "Hello worldhH";

        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            index = str.lastIndexOf("H");

        }

        System.out.println(index);
    }
}
