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
public class StringMethods {

    public static void main(final String[] args) {

        String s = "abcdefg";

        // charAt
        System.out.println(s.charAt(3)); // d
        // System.out.println(s.charAt(13)); // java.lang.StringIndexOutOfBoundsException: String index out of range: 13

        // equals
        System.out.println(s.equals("ABCDEFG"));    // false
        System.out.println(s.equalsIgnoreCase("abcdefg"));    // true

        // substring
        System.out.println(s.substring(3));     // defg
        System.out.println(s.substring(2, 6));  // cdef

        // length
        // length variable for arrays
        // length() method for strings
        System.out.println(s.length()); // 7

        // replace
        System.out.println(s.replace('a', 'b')); // bbcdefg

        // case
        System.out.println(s.toUpperCase()); // ABCDEFG
        System.out.println(s.toLowerCase()); // abcdefg

        // trim
        s = "  ab cde fg   ";
        System.out.println(s.trim()); // ab cde fg

        // replaceAll
        s = s.replaceAll(" ", "");
        System.out.println(s); // abcdefg

        // index
        s = "abcdefge";
        System.out.println(s.indexOf('e')); // 4
        System.out.println(s.lastIndexOf('e')); // 7

        // interview
        String a = "abc";
        String b = a.toUpperCase();
        String c = a.toLowerCase();
        System.out.println(a == b); // false
        System.out.println(a == c); // true

        // interview - 4 objects
        String x = new String("abc");
        String y = "bcd";
        x = x + y;
    }
}