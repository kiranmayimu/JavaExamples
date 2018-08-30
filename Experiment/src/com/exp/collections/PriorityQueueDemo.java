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

    public static void main(final String[] args) {

        PriorityQueue q = new PriorityQueue<>();

        // Just returning
        System.out.println(q.peek()); // null
        // q.element(); //java.util.NoSuchElementException

        // Remove and return
        System.out.println(q.poll()); // null
        // q.remove(); //java.util.NoSuchElementException

        // q.offer(null); null pointer

        q.offer(4);
        q.offer(3);
        q.offer(7);
        q.offer(2);
        q.offer(8);
        q.offer(1);
        q.offer(1); // duplicates are allowed

        System.out.println(q); // [1, 3, 1, 4, 8, 7, 2]

        System.out.println(q.peek()); // 1 (just return top)

        System.out.println(q.element()); // 1 (just return top)

        System.out.println(q.remove()); // 1 (remove and return top)

        System.out.println(q); // [1, 3, 2, 4, 8, 7]

        System.out.println(q.poll()); // 1 (remove and return top)

        System.out.println(q); // [2, 3, 7, 4, 8]

        // String sorting
        PriorityQueue pq = new PriorityQueue<>(new MyStringComparator());
        pq.offer("z");
        pq.offer("g");
        pq.offer("a");
        pq.offer("c");
        System.out.println(pq); // [z, g, a, c]
    }
}