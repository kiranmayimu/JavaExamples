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
public class InstanceofDemo {

    public static void main(final String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));

        System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));

        System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));

        System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));

        System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));

        System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
    }
}
