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
public class ThreadGroupDemo1 {

    public static void main(final String[] args) {

        ThreadGroup g1 = new ThreadGroup("tg");
        Thread t1 = new Thread(g1, "Thread 1");
        Thread t2 = new Thread(g1, "Thread 2");
        g1.setMaxPriority(3);
        Thread t3 = new Thread(g1, "Thread 3");

        System.out.println("Names...");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName() + "\n");

        System.out.println("Priorities...");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority() + "\n");

        // tg
        System.out.println("Groups...");
        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());
        System.out.println(t3.getThreadGroup().getName() + "\n");

        // executed by main
        System.out.println("Parent...");
        System.out.println(t1.getThreadGroup().getParent().getName());
        System.out.println(t2.getThreadGroup().getParent().getName());
        System.out.println(t3.getThreadGroup().getParent().getName() + "\n");
    }
}