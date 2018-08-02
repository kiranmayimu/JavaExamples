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
public class TreeSetComparator implements Comparator<Integer> {

    @Override
    public int compare(final Integer a, final Integer b) {

        // return a.compareTo(b); // natural order

        // return b.compareTo(a); // descending order

        // return -b.compareTo(a); // natural order

        // return -a.compareTo(b); // descending order

        // return +1; // Insertion order

        // return -1; // Reverse order

        return 0; // Only the first element
    }
}
