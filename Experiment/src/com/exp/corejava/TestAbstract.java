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
public abstract class TestAbstract { // class cant be final

    // instance variable
    public int m;

    // instance method
    void print() {
        System.out.println(m);
    }

    // instance block
    {

    }

    // static block
    static {

    }

    // static method
    public static int add(final int a, final int b) {
        return b;
    }

    // constructor
    public TestAbstract() {
    }

    // abstract method cant be static or final
    public abstract int add1(final int a, final int b);
}