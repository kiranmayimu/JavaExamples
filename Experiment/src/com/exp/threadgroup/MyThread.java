/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.threadgroup;

/**
 * @author kiranmayi.mu
 *
 */
public class MyThread extends Thread {

    public MyThread(final ThreadGroup g, final String name) {
        super(g, name);
    }

    @Override
    public void run() {

        System.out.println("child thread");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
