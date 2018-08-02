/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kiranmayi.mu
 *
 */
public class IteratorDemo {

    public static void main(final String[] args) {

        ArrayList list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        Iterator itrtr = list.iterator();

        while (itrtr.hasNext()) {
            int a = (int) itrtr.next();
            if ((a % 2) == 0) {
                System.out.println(a);
            } else {
                itrtr.remove();
            }
        }
        System.out.println(list);
    }
}
