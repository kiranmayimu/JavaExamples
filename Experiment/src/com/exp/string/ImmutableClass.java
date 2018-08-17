/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.string;

/**
 * @author kiranmayi.mu
 *
 */
public final class ImmutableClass {

    private final int i;

    private ImmutableClass(final int i) {
        this.i = i;
    }

    public ImmutableClass modify(final int i) {

        if (this.i == i) {
            return this;
        } else {
            return new ImmutableClass(i);
        }
    }

    public static void main(final String[] args) {

        ImmutableClass i1 = new ImmutableClass(10);

        ImmutableClass i2 = i1.modify(100);

        ImmutableClass i3 = i1.modify(10);

        System.out.println(i1 == i3); // true
        System.out.println(i1 == i2); // false

    }
}
