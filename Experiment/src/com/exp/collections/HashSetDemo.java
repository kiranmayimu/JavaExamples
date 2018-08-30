/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.HashSet;

/**
 * @author kiranmayi.mu
 *
 */
public class HashSetDemo {

    public static void main(final String[] args) {

        HashSet hs = new HashSet<>();

        hs.add("one");
        hs.add("two");
        hs.add("one"); // false

        System.out.println(hs); // [one, two]
        System.out.println(hs.size()); // 2

        hs.remove("one");
        System.out.println(hs); // [two]
        System.out.println(hs.size()); // 1
    }
}
