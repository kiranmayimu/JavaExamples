/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author kiranmayi.mu
 *
 */
public class SortedSetDemo {

    public static void main(final String[] args) {

        SortedSet t = new TreeSet();
        t.add("B");
        t.add("A");
        t.add("D");
        t.add("C");
        t.add("F");
        t.add("E");

        // methods of Sorted Set interface
        System.out.println("methods of Sorted Set interface");
        System.out.println("first : " + t.first());
        System.out.println("last : " + t.last());
        System.out.println("headSet : " + t.headSet("C"));
        System.out.println("tailSet : " + t.tailSet("C"));
        System.out.println("subSet : " + t.subSet("B", "F"));
    }
}
