/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @author kiranmayi.mu
 *
 */
public class HashMapDemo {

    public static void main(final String[] args) {

        HashMap map = new HashMap<>();

        String a = new String("2");
        String b = new String("2");
        System.out.println(a.equals(b));

        map.put("abhi", 1);
        map.put("poos", 8);
        map.put("vasvi", 64);
        map.put(1, "moni");
        map.put("ps", 3);
        map.put(3, "narga");
        map.put(3, "nargis");
        map.put(7, "tirgsla");
        map.put(null, "tirgsla");

        map.put(a, "one");
        map.put(b, "two");

        System.out.println("Map set is : " + map);

        System.out.println(map.put(null, "kiran"));

        System.out.println("Map set is : " + map);

        Set s = map.keySet();
        System.out.println("Key set is : " + s);

        Collection c = map.values();
        System.out.println("Values is : " + c);

        Set entrySet = map.entrySet();
        System.out.println("entry set is : " + entrySet);
    }
}