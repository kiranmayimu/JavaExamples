/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.starpattern;

/**
 * @author kiranmayi.mu
 *
 */
public class Pattern2 {

    public static void main(final String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 4; j >= i; j--) {

                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
