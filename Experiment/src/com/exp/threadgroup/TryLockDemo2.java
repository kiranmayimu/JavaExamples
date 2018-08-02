/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.threadgroup;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author kiranmayi.mu
 *
 */
public class TryLockDemo2 extends Thread {

    static ReentrantLock l = new ReentrantLock();

    public TryLockDemo2(final String name) {
        super(name);
    }

    @Override
    public void run() {

        try {
            if (l.tryLock(5000, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + " : Got lock");
                Thread.sleep(1000);
            } else {
                System.out.println(Thread.currentThread().getName() + " : Other work");
            }
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        TryLockDemo1 t1 = new TryLockDemo1("first thread");
        TryLockDemo1 t2 = new TryLockDemo1("second thread");
        t1.start();
        t2.start();
    }
}
