/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.collections;

import java.util.Stack;

/**
 * @author kiranmayi.mu
 *
 */
public class StackDemo {

    public static void main(final String[] args) {

        Stack s = new Stack<>();
        s.push("A");
        s.push("C");
        s.push("B");
        s.push(null);
        s.push("D");

        System.out.println(s); // [A, C, B, null, D]

        System.out.println(s.peek()); // LIFO - D

        System.out.println(s.search("A")); // 4 - offset
        System.out.println(s.search("Z")); // -1 if element is not present

        System.out.println(s.pop());
        System.out.println(s); // [A, C, B, null]

        System.out.println(s.pop());
        System.out.println(s); // [A, C, B]

        System.out.println(s.empty()); // false
    }
}
