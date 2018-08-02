/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.IdentityHashMap;

/**
 * @author kiranmayi.mu
 *
 */
public class IdentityHashMapDemo {

    public static void main(final String[] args) {

        String a = new String("2");
        String b = new String("2");
        System.out.println(a == b); // only when new, == returns false

        IdentityHashMap map = new IdentityHashMap<>();

        map.put("abhi", 1);
        map.put("poos", 8);
        map.put("vasvi", 64);
        map.put(1, "moni");
        map.put("ps", 3);
        map.put(3, "narga");
        map.put(a, "tirgsla");
        map.put(b, "kiran");

        System.out.println(map);

        System.out.println(map.keySet());

        System.out.println(map.get(a));
    }
}