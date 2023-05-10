package com.academy.techcenture;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {
    @BeforeClass
    public static void beforeClassConfig(){
        System.out.println("Doing some config in before class method");
    }@AfterClass
    public static void afterClassConfig(){
        System.out.println("Doing some config in after class method");
    }
}
