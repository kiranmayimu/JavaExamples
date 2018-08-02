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
public class TreeSetComparatorDemo {

    public static void main(final String[] args) {

        TreeSet t = new TreeSet<>(new TreeSetComparator());

        t.add(10);
        t.add(2);
        t.add(34);
        t.add(3);

        System.out.println(t);
    }
}
