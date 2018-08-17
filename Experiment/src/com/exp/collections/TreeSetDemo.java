/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.TreeSet;

/**
 * @author kiranmayi.mu
 *
 */
public class TreeSetDemo {

    public static void main(final String[] args) {

        TreeSet t = new TreeSet();

        t.add("Z");
        System.out.println(t.add("Z"));

        t.add("B");

        t.add("S");

        t.add("A");

        // t.add(1); // ClassCastException heterogeneous elements not allowed in TreeMap

        // t.add(null); //null ptr

        // t.add(new StringBuffer("g")); //java.lang.StringBuffer cannot be cast to java.lang.Comparable

        System.out.println(t);
    }
}
