package MPD_Online02;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Divisiones del numero 100 parando cuando se introduce 0
 * @author Daniel Millan
 * @version 1.0
 */
public class E7 {
Scanner entrada=new Scanner(System.in);


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada=new Scanner(System.in);   
     int a=100;
     int numero;
     
     System.out.println("introduzca un numero");
     numero=entrada.nextInt();
    
     while(numero==0){
       System.out.println("La division por 0 no se puede realizar");
      break;
   }
     
     double b=(a/numero);
     System.out.println(a+"/"+numero+"="+b);
         
      
     
     while (numero>0){
         System.out.println("Introduzca un numero");
         numero=entrada.nextInt();
         if(numero==0){
       System.out.println("La division por 0 no se puede realizar");
       break;
   }
         b=(b/numero);  
     System.out.println((b*numero)+"/"+numero+"="+b);
    
    
   
 
     
     
        
        
    }
    
}
}