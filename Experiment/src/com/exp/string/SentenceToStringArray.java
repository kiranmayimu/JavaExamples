/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2017 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.string;

public class SentenceToStringArray {

    public static void main(final String[] args) {

        String str = "software is produced by EVRY FS. Unauthorized redistribution";

        String[] words = str.split("\\s");

        for (String word : words) {

            System.out.println(word);
        }
    }
}
