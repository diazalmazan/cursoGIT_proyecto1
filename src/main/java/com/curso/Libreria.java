package com.curso;

/**
 * Paso 1 Escrito el API: application programing interface
 *
 */
public class Libreria 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    
    public static int resta(int numero1, int numero2){
        return numero1 - numero2;
    }
    
    public static double suma(double numero1, double numero2){
        return numero1 + numero2;
    }
    
    public static double resta(double numero1, double numero2){
        return numero1 - numero2;
    }
    
    public static int otra(){
        return 0;
    }
    
}
