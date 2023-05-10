package com.academy.techcenture;

import org.junit.*;

public class DummyTest extends BaseTest{
    @BeforeClass
    public static void beforeClassConfig(){
        System.out.println("Doing some config in before class method");
    }@AfterClass
    public static void afterClassConfig(){
        System.out.println("Doing some config in after class method");
    }
    @Before
    public void setUp(){
        System.out.println("Setting up");
    }
    @After
    public void tearDown(){
        System.out.println("After method running");
    }
    @Test
    public void test1() {
        System.out.println("Starting test 1");
        Assert.assertEquals("Numbers are not equal: ",25,25);
        System.out.println("Ending test 1");

    }

    @Test
    public void test2() {
        System.out.println("Starting test 2");
        Assert.assertTrue("Something went wrong",  6>3);
        System.out.println("Ending test 2");

    }

    @Test
    public void test3() {
        System.out.println("Starting test 3");
       // Assert.assertArrayEquals("arrays are not equal: ", );
        System.out.println("Ending test 3");

    }
}
