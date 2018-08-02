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
public class ThreadYieldDemo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread running " + i);
        }

    }

    public static void main(final String[] args) {
        ThreadYieldDemo t = new ThreadYieldDemo();
        t.start();
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread running " + i);
        }
    }
}
