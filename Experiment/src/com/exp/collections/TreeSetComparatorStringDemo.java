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
public class TreeSetComparatorStringDemo {

    public static void main(final String[] args) {

        TreeSet t = new TreeSet<>(new MyStringComparator());

        t.add("poos");
        t.add("gisgis");
        t.add("tirgsla");
        t.add("abhi");
        t.add("vasvi");
        t.add("moni");
        t.add("ps");
        t.add("kiran");

        System.out.println(t);
    }
}
