/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author kiranmayi.mu
 *
 */
public class NavigableSetDemo {

    public static void main(final String[] args) {

        NavigableSet t = new TreeSet<>();

        t.add(2);
        t.add(3);
        t.add(5);
        t.add(6);
        t.add(9);

        System.out.println(t);// [2, 3, 5, 6, 9]

        System.out.println("floor : " + t.floor(9));
        System.out.println("lower : " + t.lower(0));

        System.out.println("ceiling : " + t.ceiling(9));
        System.out.println("higher : " + t.higher(5));

        System.out.println("pollFirst : " + t.pollFirst());
        System.out.println("pollLast : " + t.pollLast());

        System.out.println(t.descendingSet());

        System.out.println(t);
    }
}