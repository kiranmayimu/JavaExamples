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
public class MyThread extends Thread {

    @Override
    public void start() {
        super.start();
        System.out.println("start method");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }

    public static void main(final String[] args) {
        MyThread t = new MyThread();
        t.start();
        // t.start(); //java.lang.IllegalThreadStateException
        System.out.println("main method");
    }
}
