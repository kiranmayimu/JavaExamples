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
class HelloWorld {

    public static void main(final String[] args) {

        Hello hello = new Hello();

        // 1
        hello.show((x) -> {
            System.out.println("Hello India..");
        });

        // 2
        hello.show((x) -> {
            System.out.println("Hello Japan..");
        });

        // 3
        Greeting g1 = (x) -> {
            System.out.println("China");
        };
        g1.show(g1);
    }
}

interface Greeting {

    void show(final Greeting g);

}

class Hello {

    public void show(final Greeting g) {
        g.show(g);
    }
}

class HelloIndia implements Greeting {

    @Override
    public void show(final Greeting g) {
        System.out.println("Hello India..");
    }
}

class HelloJapan implements Greeting {

    @Override
    public void show(final Greeting g) {
        System.out.println("Hello Japan..");
    }
}