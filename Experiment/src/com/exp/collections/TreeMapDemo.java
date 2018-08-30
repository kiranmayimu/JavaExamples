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
public class TreeMapDemo {

    public static void main(final String[] args) {

        TreeMap t = new TreeMap<>();

        t.put(3, "a");
        t.put(4, "b");
        t.put(4, "n");
        t.put(2, "c");
        t.put(1, "d");
        t.put(6, null);

        // t.put("heterogeneous", "d"); // ClassCastExcep heterogeneous elements not allowed in TreeMap

        // t.put(null, "d"); // Null pointer key cannot be null

        System.out.println(t); // {1=d, 2=c, 3=a, 4=n, 6=null}
    }
}
