/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author kiranmayi.mu
 *
 */
public class CollectionsSearchDemo {

    public static void main(final String[] args) {

        ArrayList list = new ArrayList();
        list.add("a");
        list.add("r");
        list.add("b");
        list.add("l");

        // natural sorting order
        Collections.sort(list);
        System.out.println("Afetr sorting" + list);
        System.out.println(Collections.binarySearch(list, "a")); // index
        System.out.println(Collections.binarySearch(list, "d")); // insertion point

        // cutomized sorting order
        Collections.sort(list, new MyStringComparator());
        System.out.println("Afetr sorting" + list);
        System.out.println(Collections.binarySearch(list, "l", new MyStringComparator())); // index
        System.out.println(Collections.binarySearch(list, "g", new MyStringComparator())); // insertion point
    }
}