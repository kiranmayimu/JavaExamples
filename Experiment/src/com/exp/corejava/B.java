/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.corejava;

import java.io.FileNotFoundException;

/**
 * @author kiranmayi.mu
 *
 */
public class B extends A {

    int num = 20;

    @Override
    public int add(final int a, final int b) throws ArithmeticException, FileNotFoundException {
        return a;
    }

    public static void main(final String[] args) {

        A a = new B();

        System.out.println(a.num);
    }
}
