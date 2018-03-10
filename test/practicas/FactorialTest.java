/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Neko
 */
public class FactorialTest {
    
    public FactorialTest() {
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
     * Test of calculo method, of class Factorial.
     */
    
    // Este primer test funciona porque es el factorial de 10 que no hace overflow y no es menor de 0
   
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 5;
        int expResult = 120;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
         // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    // este test da error al ser menor que 0
    /**
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = -1;
        int expResult = 0;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    
    //error por overflow
    /*
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 22;
        int expResult = 0;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    
}
