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
public class SystemThreadGroupCount {

    public static void main(final String[] args) {

        ThreadGroup systemGroup = Thread.currentThread().getThreadGroup().getParent();

        Thread[] t = new Thread[systemGroup.activeCount()];

        systemGroup.enumerate(t);

        for (Thread v : t) {
            System.out.println("Name is " + v.getName() + " Am I daemon a daemon thread ?  " + v.isDaemon() + "\n");
        }
    }
}
