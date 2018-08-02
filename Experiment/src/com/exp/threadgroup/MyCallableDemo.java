/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.threadgroup;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author kiranmayi.mu
 *
 */
public class MyCallableDemo {

    public static void main(final String[] args) throws InterruptedException, ExecutionException {

        MyCallable[] jobs = {
                new MyCallable(2),
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
                new MyCallable(60)
        };

        ExecutorService ex = Executors.newFixedThreadPool(3);

        for (MyCallable job : jobs) {

            Future f = ex.submit(job);
            System.out.println(f.get());
        }

        ex.shutdown();
    }
}
