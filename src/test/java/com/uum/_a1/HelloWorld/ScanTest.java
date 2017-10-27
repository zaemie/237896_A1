/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a1.HelloWorld;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class ScanTest {
    
    public ScanTest() {
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
     * Test of scan method, of class Scan.
     */
    @Test
    public void testScan() {
        System.out.println("scan");
        String[] listJavaFile = {};
        Scan instance = new Scan();
        instance.scan(listJavaFile);
        
    }

    /**
     * Test of filterJava method, of class Scan.
     */
    @Test
    public void testFilterJava() {
        System.out.println("filterJava");
        Collection<File> listAllFileName = new ArrayList<>();
        String[] expResult = {};
        String[] result = Scan.filterJava(listAllFileName);
        assertArrayEquals(expResult, result);
        
    }
    
}
