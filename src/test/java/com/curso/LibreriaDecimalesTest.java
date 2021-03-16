package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LibreriaDecimalesTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Suma5y8()
    {
        assertTrue( 13.2== Libreria.suma(5.1,8.1));
    }
    
    @Test
    public void Suma5y0()
    {
        assertTrue( 5.1== Libreria.suma(5.1,0));
    }
    
    @Test
    public void Suma5ymenos3()
    {
        assertTrue( 1.9== Libreria.suma(5,-3.1));
    }
    
    @Test
    public void Resta5y8()
    {
        assertTrue( -3== Libreria.resta(5.1,8.1));
    }
    
    @Test
    public void RestaMenos5yMenos8()
    {
        assertTrue( -13.2== Libreria.suma(-5.1,-8.1));
    }
    
}
