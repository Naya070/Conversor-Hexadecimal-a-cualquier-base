package ConversorHexadecimalABases;


  import java.util.ArrayList;
  import java.util.List;
  
 class BaseMenorADiez extends Hexa {
    

     private double x, d_resto, c; 
     private int resto;

    /**
     * Constructor for objects of class Conversor
     */
     public BaseMenorADiez(String numEntrada)
    {
        // initialise instance variables
        super(numEntrada); // invocando el constructor de superclase
        
    }
    
        
    /**
     * Este método transforma de hexadecimal a cualquier base.
     * 
     */
    
    public String ConvBaseMenoraDiez(double BaseRequerida)
    {
        // put your code here
        double base =  BaseRequerida;
        ConvDecimal();
         
       decimal = this.decimal;
       
         System.out.println("BINARIO");
        
        int Entero= (int) decimal;
        int i =0;
        String result="";
        
        List<String> arr = new ArrayList<>();
       
        while (Entero >= base){
            int B= (int) base;
            d_resto = Entero % base;
             resto = (int) d_resto;       
            System.out.println(resto);
            Entero = Entero/B;
            if (resto > 9){
            arr.add(  String.valueOf((char)(resto + 55)));
            } else{
            arr.add(  String.valueOf(resto));
            }
            
            
            }
           
        if (Entero < base){
            d_resto = Entero % base;
                 resto = (int) d_resto;    
            System.out.println(resto);
             if (resto > 9){
            arr.add(  String.valueOf((char)(resto + 55)));
            } else{
            arr.add(  String.valueOf(resto));
            }
            
        }
          for( int j = arr.size()-1; j>=0; j-- ){
            System.out.println("item");
            System.out.println(arr.get(j));
            result = result + arr.get(j);
            }            
           return result ;
        }
    } 
       