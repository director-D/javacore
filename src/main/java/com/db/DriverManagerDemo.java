package com.db;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 4/11/23 10:46
 * @Version: 1.0
 * @Description:
 */
public class DriverManagerDemo {

    public static void main(String[] args) {
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        if(drivers.hasMoreElements()){
            Driver driver = drivers.nextElement();
            System.out.println(driver.getMajorVersion() + " : " + driver.getMinorVersion());
        }
    }

}
