/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.TreeMap;

/**
 * @author kiranmayi.mu
 *
 */
public class TreeMapComparatorStringDemo {

    public static void main(final String[] args) {

        TreeMap t = new TreeMap<>(new MyStringComparator());

        t.put("b", 1);
        t.put("a", 1);
        t.put("c", 1);
        t.put("d", 1);

        System.out.println(t);
    }
}
