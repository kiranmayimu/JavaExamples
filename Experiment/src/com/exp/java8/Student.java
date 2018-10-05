/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author kiranmayi.mu
 *
 */
class Student {

    int    id;
    String name;

    public Student(final int id, final String name) {
        this.id = id;
        this.name = name;
    }
}

class SortStudent {

    public static void main(final String[] args) {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(4, "Amruth"));
        list.add(new Student(2, "Anusha"));
        list.add(new Student(6, "kiran"));
        list.add(new Student(3, "karthik"));
        list.add(new Student(1, "sanju"));
        list.add(new Student(5, "saheer"));

        // names sort
        printSortedNames(list);

        // only k
        printConditionally(list, (x) -> {
            return x.name.startsWith("k");
        });
    }

    private static void printConditionally(final List<Student> list, final Predicate<Student> condition) {

        for (Student s : list) {
            if (condition.test(s)) {
                System.out.println(s.id + " " + s.name);
            }
        }

    }

    private static void printSortedNames(final List<Student> list) {

        /*
         * Collections.sort(list, new Comparator<Student>() {
         * 
         * @Override
         * public int compare(final Student s1, final Student s2) {
         * return s2.name.compareTo(s1.name);
         * }
         * 
         * });
         */

        // or

        Collections.sort(list, (x, y) -> {
            return y.name.compareTo(x.name);
        });

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}