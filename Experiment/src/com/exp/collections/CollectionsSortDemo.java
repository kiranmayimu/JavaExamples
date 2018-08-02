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
public class CollectionsSortDemo {

    public static void main(final String[] args) {

        ArrayList list = new ArrayList();
        list.add("a");
        list.add("r");
        list.add("b");
        list.add("l");

        Collections.reverse(list);
        System.out.println("reverse order : " + list);

        // list.add(1); // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        // list.add(null); // java.lang.NullPointerException
        // should be homogeneous and no null for natural ordering
        Collections.sort(list);
        System.out.println("natural ordering : " + list);

        // customized sorting can be heterogeneous elements
        list.add(1);
        // list.add(null); //java.lang.NullPointerException
        Collections.sort(list, new MyStringComparator());
        System.out.println("customized sorting : " + list);
    }
}