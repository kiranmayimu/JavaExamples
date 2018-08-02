/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.threads;

/**
 * @author kiranmayi.mu
 *
 */
public class DisplaySynchronizedDemo {

    public static void main(final String[] args) {

        Display d = new Display();

        DisplayThread t1 = new DisplayThread(d, "kiran");
        DisplayThread t2 = new DisplayThread(d, "puchi");

        t1.start();
        t2.start();
    }
}
