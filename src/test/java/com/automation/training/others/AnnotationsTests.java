package com.automation.training.others;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsTests{
    /*@BeforeClass
    public void beforeClass(){
        System.out.println("Running before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Running after class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Running before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Running after test");
    }
    @BeforeMethod
    public void before(){
        System.out.println("Login in the app");
    }
    @AfterMethod
    public void after(){
        System.out.println("Login out the app");
    }
    @Test
    public void test0(){
        System.out.println("test 0");
    }
    @Test(groups = {"group1"})
    public void test1(){
        System.out.println("test 1");
    }
    @Test
    public void test2(){
        System.out.println("test 2");
    }*/

    @Test(groups = {"group1"})
    public void testEqualsIgnoreCase(){
        String a = "hOla MuNDO";
        String b = "hola mundo";
        Assert.assertTrue(a.equalsIgnoreCase(b));
        System.out.println("test ignore case");
    }
    @Parameters({"stringA","stringB"})
    @Test(groups = {"group1","group2"})
    public void testConcat(String a,String b){
        /*String a = "I love";
        String b = " test automation";*/
        String resultado = a + b;
        Assert.assertEquals(resultado, "I love test automation");
        System.out.println("test concat");
    }
    @Test(groups ={"group2"})
    public void testCount(){
        String a = "I love";
        Assert.assertEquals(a.length(),6);
        System.out.println("test count");
    }
}
