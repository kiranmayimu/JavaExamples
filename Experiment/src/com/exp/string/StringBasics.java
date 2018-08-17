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
public class StringBasics {

    public static void main(final String[] args) {

        // String overrides equals() for content comparision
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");

        System.out.println(s1 == s2); // true

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true

        System.out.println(s1 == s3); // false

        // StringBuffer does not override equals() for content comparision

        StringBuffer sb1 = new StringBuffer("kiran");
        StringBuffer sb2 = new StringBuffer("kiran");

        System.out.println(sb1 == sb2); // false

        System.out.println(sb1.equals(sb2)); // false
    }
}
