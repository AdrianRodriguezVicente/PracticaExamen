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
public class ShapeTest {
    
    public ShapeTest() {
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
     * Test of area method, of class Figura.
     */
    
    //este es un cuadrado
    /*
    @Test
    public void testArea() {
        System.out.println("area");
        Figura instance = new Figura(1,5);
        double expResult = 25.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    
    //este es un circulo 
    /*
    @Test
    public void testArea() {
        System.out.println("area");
        Figura instance = new Figura(2,5);
        double expResult = 25.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    
    //esto es un triangulo
    /*
    @Test
    public void testArea() {
        System.out.println("area");
        Figura instance = new Figura(3,5);
        double expResult = 25.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    
    //esa forma no existe
    @Test
    public void testArea() {
        System.out.println("area");
        Figura instance = new Figura(0,5);
        double expResult = 0.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("No existe esa forma");
    }
    
}
