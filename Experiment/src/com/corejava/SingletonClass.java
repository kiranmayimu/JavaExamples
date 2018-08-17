/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.corejava;

/**
 * @author kiranmayi.mu
 *
 */
public class SingletonClass {

    // static variable single_instance of type Singleton
    private static SingletonClass single_instance = null;

    // variable of type String
    public String                 s;

    // private constructor restricted to this class itself
    private SingletonClass() {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static SingletonClass getInstance() {

        if (single_instance == null) {
            single_instance = new SingletonClass();
        }

        return single_instance;
    }
}
