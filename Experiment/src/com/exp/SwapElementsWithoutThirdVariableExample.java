/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2017 EVRY. ALL RIGHTS RESERVED
 */
package com.exp;

public class SwapElementsWithoutThirdVariableExample {

    public static void main(final String[] args) {

        int num1 = 6;
        int num2 = 3;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

    }
}
