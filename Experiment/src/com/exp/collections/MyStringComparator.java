/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.Comparator;

/**
 * @author kiranmayi.mu
 *
 */
public class MyStringComparator implements Comparator {

    @Override
    public int compare(final Object a, final Object b) {

        String s1 = a.toString();

        String s2 = (String) b;

        // return s2.compareTo(s1); // descending

        return -s1.compareTo(s2); // descending
    }
}
