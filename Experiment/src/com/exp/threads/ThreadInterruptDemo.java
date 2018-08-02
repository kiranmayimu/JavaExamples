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
public class ThreadInterruptDemo extends Thread {

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("child thread running " + i);
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted here");
        }
    }

    public static void main(final String[] args) {
        ThreadInterruptDemo t = new ThreadInterruptDemo();
        t.start();
        t.interrupt();
        System.out.println("main ends");
    }
}
