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
public class ThreadJoinDemo1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread running " + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args) throws InterruptedException {
        ThreadJoinDemo1 t = new ThreadJoinDemo1();
        t.start();
        // main thread has to wait to wait until child completes
        t.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread running " + i);
        }
    }
}
