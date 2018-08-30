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
public class TestStatic {

    static int a = 1;
    int        b = 1;
    TestStatic t = new TestStatic();

    public static void a() {
        // b = 2; static methods cannot access instance variables directly
        a = 2;
        // t.b(); // static methods cannot access instance methods directly
    }

    public void b() {
        a = 9;
        a();
    }

}
