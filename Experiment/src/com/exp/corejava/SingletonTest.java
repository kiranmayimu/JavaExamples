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
public class SingletonTest {

    public static void main(final String[] args) {
        // instantiating SingletonClass class with variable x
        SingletonClass x = SingletonClass.getInstance();

        // instantiating SingletonClass class with variable y
        SingletonClass y = SingletonClass.getInstance();

        // instantiating SingletonClass class with variable z
        SingletonClass z = SingletonClass.getInstance();

        // changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}