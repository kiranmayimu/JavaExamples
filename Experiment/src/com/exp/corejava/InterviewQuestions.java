/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.corejava;

/**
 * @author kiranmayi.mu
 * 
 */
public class InterviewQuestions {

    public static void main(final String[] args) {

        // 1
        System.out.println("first");
        int a = 3;

        int b = 4;

        String s = "7";

        System.out.println(a + b + s); // 77

        // 2
        System.out.println("second");
        long[] a1 = new long[] { 3, 4, 5 };
        long[] b1 = fix(a1);
        System.out.println(a1[0] + a1[1] + a1[2] + "");
        System.out.println(b1[0] + b1[1] + b1[2]);

        // 3
        System.out.println(88 << 3); // 20
    }

    private static long[] fix(final long[] a1) {
        a1[1] = 7;
        return a1;
    }

}
