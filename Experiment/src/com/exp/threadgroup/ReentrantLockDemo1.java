/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.threadgroup;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author kiranmayi.mu
 *
 */
public class ReentrantLockDemo1 {

    public static void main(final String[] args) {

        ReentrantLock lock = new ReentrantLock();

        lock.lock();
        lock.lock();

        System.out.println(lock.isLocked());
        System.out.println(lock.isHeldByCurrentThread());
        System.out.println(lock.getQueueLength());
        System.out.println(lock.getHoldCount());

        lock.unlock();

        System.out.println(lock.getHoldCount());
        System.out.println(lock.isLocked());

        lock.unlock();

        System.out.println(lock.isLocked());
        System.out.println(lock.isFair());
    }
}
