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
public class RemoveChar {

    public static String removeChar(final String value, final char c) {

        if (value == null) {
            return null;
        }

        return value.replaceAll(Character.toString(c), "");

    }

    public static void main(final String[] args) {
        System.out.println(removeChar("kiirahsijdiosd", 'i'));
    }
}
