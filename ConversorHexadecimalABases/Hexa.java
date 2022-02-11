package ConversorHexadecimalABases;

import java.util.ArrayList; 

public class Hexa
{
    // instance variables - replace the example below with your own
    public String num;
    public double decimal;
    
    
    /**
     * Constructor para objetos de la clase Hexa
     * Ingrese un número hexadecimal
     * el número debe ir entre comillas
     * Las letras deben ir en mayúsculas
     * Ejemplos: "1A2" , "FFF"
     */
    public Hexa(String numEntrada)
    {
        // initialise instance variables
      num = numEntrada; //número en hexadecimal colocado por el usuario
      
      
    }

    /**
     * Convertir de Hexadecimal a decimal
     * Con este método puedes convertir tu valor hexadecimal puesto en el constructor a un valor decimal.
     * 
     */
    public int ConvDecimal()
    {
                // put your code here
                int n = num.length(); //cantidad de caracteres en mi cadena
                int PosiciónCar = 0; //posición de carácter
                int ascii;
                
                double b;
                b = 0;
                
                double decimal;
                decimal = 0;
                
                double c;
                c = 0;
        
        while (n!=0){
         
        ascii = num.codePointAt(PosiciónCar); //devuelve el ASCII según el parámetro PosiciónCar 
        
          if (ascii >= 49 && ascii <= 57){
        b =  (num.codePointAt(PosiciónCar)- 48); 
                                // convertir num en ASCII y restarle 48 para guardar equivalencia, guardar en b
        
                        c= (b * Math.pow(16,n-1));  // potencia 16 elevado a la n-1
                         --n;
                        
              
    }
         else 
          
        if (ascii >= 65 && ascii <= 70){
                    b =  (num.codePointAt(PosiciónCar)- 55);
                                                 // convertir letra en ASCII y restarle 55 para guardar equivalencia, guardar en b
                    c= (b * Math.pow(16,n-1));
                    --n;
                                   
    }
         else {System.out.println("Excepción");}
        
                 decimal = decimal +c;
                 
                 
                ++PosiciónCar;
        
    }

            this.decimal = decimal;
            
            int dec = (int) decimal;
            
            return dec;  
         
    }
}
 
