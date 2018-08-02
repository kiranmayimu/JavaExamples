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
public class TestThreadGroup {

    public static void main(final String[] args) {

        // maingroup
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        // systemgroup
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup g1 = new ThreadGroup("g1 group");
        System.out.println(g1.getParent().getName());

        ThreadGroup g2 = new ThreadGroup(g1, "g2 group");
        System.out.println(g2.getName());
        System.out.println(g2.getParent().getName());

        // MaxPriority
        System.out.println(g2.getMaxPriority());
        Thread t1 = new Thread(g2, "t1-g2");
        System.out.println(t1.getPriority());

        g2.setMaxPriority(3);
        Thread t2 = new Thread(g2, "t1-g2");
        System.out.println(t2.getPriority());

        System.out.println(g2.activeCount());
        System.out.println(g1.activeGroupCount());

        System.out.println(g1.isDaemon());
        System.out.println(g2.isDaemon());

        g1.setDaemon(true);
        System.out.println(g1.isDaemon());
    }
}