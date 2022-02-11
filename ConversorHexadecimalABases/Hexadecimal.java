package ConversorHexadecimalABases;


/**
 * Write a description of class Hexadecimal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.nio.charset.StandardCharsets;

import java.util.Scanner;

public class Hexadecimal
{
    // instance variables - replace the example below with your own
    private String número;
    
    
    /**
     * Constructor for objects of class Hexadecimal
     */
    public Hexadecimal()
    {
        // initialise instance variables
        
                       
         }
        public void setNombre(String número){
            this.número = número;
    }
         
         
    /**
     * Convertir de Hexadecimal a decimal
     * 
     */
    public int decimal()
    {
        // put your code here
        int n = número.length();//cantidad de caracteres en mi cadena
        int x=0;
       
        while (x<n){
        ascii = número.codePointAt(x); //devuelve el código ASCII en la posición del parámetro x
        a = número. charAt(x); //devuelve el caracter según la posición del parámetro x 
        System.out.println(a);
            
        System.out.println(número.charAt(x) + " = " + número.codePointAt(x));
    }
        return 1;
    }
}
