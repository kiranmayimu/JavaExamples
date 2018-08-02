/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.threadgroup;

import java.util.concurrent.Callable;

/**
 * @author kiranmayi.mu
 *
 */
public class MyCallable implements Callable {

    int num;

    public MyCallable(final int num) {
        this.num = num;
    }

    @Override
    public Object call() throws Exception {

        System.out.println(Thread.currentThread().getName() + " is responsible to find sum of first " + num + " numbers ");

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }

        return sum;
    }

}
