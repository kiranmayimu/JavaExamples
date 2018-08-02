/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.PriorityQueue;

/**
 * @author kiranmayi.mu
 *
 */
public class PriorityQueueDemo {

    /**
     * @param args
     */
    public static void main(final String[] args) {

        PriorityQueue q = new PriorityQueue<>();

        System.out.println(q.peek()); // null
        System.out.println(q.poll()); // null

        // q.element(); //java.util.NoSuchElementException

        // q.remove(); //java.util.NoSuchElementException

        q.offer(4);
        q.offer(3);
        q.offer(7);
        q.offer(2);

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.remove());

        System.out.println(q.poll());

        q.offer(1);
        q.offer(1); // duplicates are allowed

        // q.offer(null); null pointer

        System.out.println(q);

        // String sorting
        PriorityQueue pq = new PriorityQueue<>(new MyStringComparator());
        pq.offer("z");
        pq.offer("g");
        pq.offer("a");
        pq.offer("c");
        System.out.println(pq);
    }
}