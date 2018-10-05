/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.java8;

import java.util.function.IntBinaryOperator;

/**
 * @author kiranmayi.mu
 *
 */
public class Calculate {

    static void sum(final IntBinaryOperator operator) {
        System.out.println(operator.applyAsInt(10, 20));
    }

    public static void main(final String[] args) {

        sum((x, y) -> {
            return (x + y);
        });

        sum((x, y) -> {
            return x * y;
        });
    }
}
