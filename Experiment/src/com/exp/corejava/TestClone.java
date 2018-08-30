/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.corejava;

/**
 * @author kiranmayi.mu
 *
 */
public class TestClone {

    static void shallowCopy() {

        StudentClone s1 = new StudentClone(100, "Saheer");
        StudentClone s2 = s1; // Shallow copy
        s2.eid = 200;

        System.out.println("s1 id " + s1.eid);
        System.out.println("s2 id " + s2.eid);
    }

    static void deepCopy() throws CloneNotSupportedException {

        StudentClone s1 = new StudentClone(300, "Saheer");

        StudentClone s2 = (StudentClone) s1.clone();// Deep Copy

        s2.eid = 400;

        System.out.println("s1 id " + s1.eid);
        System.out.println("s2 id " + s2.eid);
    }

    public static void main(final String[] args) throws CloneNotSupportedException {
        shallowCopy();
        deepCopy();
    }
}