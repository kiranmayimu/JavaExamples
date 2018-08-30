/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author kiranmayi.mu
 *
 */
public class EnumerationDemo {

    public static void main(final String[] args) {

        Vector v = new Vector<>();

        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }

        System.out.println(v); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            int a = (int) e.nextElement();
            if ((a % 2) == 0) {
                System.out.println(a); // even numbers
            }
        }
    }
}
