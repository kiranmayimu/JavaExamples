/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.java8;

/**
 * @author kiranmayi.mu
 *
 */

interface Foo {

    void foo();
}

@FunctionalInterface
interface Greeting1 {

    void print();

    default void pp(final int a) {
    }
}

class HellowWorld {

    void disp(final Foo greet) {
        greet.foo();
    }
}

class ClientCode {

    public static void main(final String[] args) {

        HellowWorld hello = new HellowWorld();
        // Greeting g= ()->System.out.println("Hello Japan");

        hello.disp(() -> {
            System.out.println("Hello India");
            System.out.println("Hello Japan");
        });
        // hello.disp(g);

    }

}

// int i=10;
// String p="Saheer";
// Greeting g= ()->System.out.println("Hello India");
