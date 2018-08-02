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
public class ThreadJoinDemo2 extends Thread {

    static Thread mt;

    @Override
    public void run() {

        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("child thread running " + i);
        }
    }

    public static void main(final String[] args) throws InterruptedException {
        // child has to wait until main thread completes
        ThreadJoinDemo2.mt = Thread.currentThread();

        ThreadJoinDemo2 t = new ThreadJoinDemo2();
        t.start();

        // t.join(); //deadlock situation

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread running " + i);
        }
    }
}
