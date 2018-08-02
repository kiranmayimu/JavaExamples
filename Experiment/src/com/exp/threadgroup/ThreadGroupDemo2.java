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
public class ThreadGroupDemo2 {

    public static void main(final String[] args) throws Exception {

        ThreadGroup pg = new ThreadGroup("Parent Group");
        ThreadGroup cg = new ThreadGroup(pg, "Child Group");

        MyThread t1 = new MyThread(pg, "Thread 1");
        MyThread t2 = new MyThread(pg, "Thread 2");

        t1.start();
        t2.start();

        // counts
        System.out.println(pg.activeCount() + " Parent activeCount" + "\n");
        System.out.println(pg.activeGroupCount() + " Parent activeGroupCount" + "\n");

        System.out.println(cg.activeCount() + " Child activeCount" + "\n");
        System.out.println(cg.activeGroupCount() + " Child activeGroupCount" + "\n");

        // list
        pg.list();

        Thread.sleep(10000);

        System.out.println(pg.activeCount() + " Parent activeCount" + "\n");
        System.out.println(pg.activeGroupCount() + " Parent activeGroupCount" + "\n");

        pg.list();
    }
}