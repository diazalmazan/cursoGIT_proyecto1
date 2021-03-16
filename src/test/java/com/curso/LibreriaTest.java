package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LibreriaTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Suma5y8()
    {
        assertTrue( 13== Libreria.suma(5,8));
    }
    
    @Test
    public void Suma5y0()
    {
        assertTrue( 5== Libreria.suma(5,0));
    }
    
    @Test
    public void Suma5ymenos3()
    {
        assertTrue( 2== Libreria.suma(5,-3));
    }
    
    @Test
    public void Resta5y8()
    {
        assertTrue( -3== Libreria.resta(5,8));
    }
    
    @Test
    public void RestaMenos5yMenos8()
    {
        assertTrue( -13== Libreria.suma(-5,-8));
    }
    
}
