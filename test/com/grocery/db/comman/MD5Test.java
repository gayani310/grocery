/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grocery.db.comman;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gayani
 */
public class MD5Test {
    
    public MD5Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMd5 method, of class MD5.
     */
    @Test
    public void testGetMd5() {
        System.out.println("getMd5");
        String input = "1";
        String expResult = "1";
        String result1 = MD5.getMd5(input);
        String result2 = MD5.getMd5(expResult);
        assertEquals(result1, result2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
