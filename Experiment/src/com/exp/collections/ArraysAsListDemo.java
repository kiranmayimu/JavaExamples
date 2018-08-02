/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author kiranmayi.mu
 *
 */
public class ArraysAsListDemo {

    public static void main(final String[] args) {

        String[] objArray = { "g", "a", "n", "e" };

        List list = Arrays.asList(objArray);

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.set(0, "w")); // replace existing value and returns old value
        System.out.println(list);

        // System.out.println(list.remove(0)); // java.lang.UnsupportedOperationException //cant alter the size by using list reference
        // System.out.println(list.set(0, 1)); // java.lang.ArrayStoreException: java.lang.Integer // heterogeneous element by using list reference
    }
}
