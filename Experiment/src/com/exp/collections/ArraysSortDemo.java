/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.Arrays;

/**
 * @author kiranmayi.mu
 *
 */
public class ArraysSortDemo {

    public static void main(final String[] args) {

        // primitive sorting
        int[] primitiveArray = { 3, 2, 1, 8 };

        System.out.println("Before sorting");
        for (int i : primitiveArray) {
            System.out.println(i);
        }

        Arrays.sort(primitiveArray);

        System.out.println("After sorting");
        for (int i : primitiveArray) {
            System.out.println(i);
        }

        // search
        System.out.println("Index is : " + Arrays.binarySearch(primitiveArray, 2));
        System.out.println("Insertion point is : " + Arrays.binarySearch(primitiveArray, 4));

        // Object sorting
        String[] objArray = { "g", "a", "n", "e" };

        System.out.println("Before sorting");
        for (String i : objArray) {
            System.out.println(i);
        }

        Arrays.sort(objArray);

        System.out.println("After sorting");
        for (String i : objArray) {
            System.out.println(i);
        }

        // search
        System.out.println("Index is : " + Arrays.binarySearch(objArray, "e"));
        System.out.println("Insertion point is : " + Arrays.binarySearch(objArray, "f"));

        // customized sorting
        Arrays.sort(objArray, new MyStringComparator());

        System.out.println("After customized sorting");
        for (String i : objArray) {
            System.out.println(i);
        }

        // search
        System.out.println("Index is : " + Arrays.binarySearch(objArray, "n", new MyStringComparator()));
        System.out.println("Insertion point is : " + Arrays.binarySearch(objArray, "b", new MyStringComparator()));
    }
}