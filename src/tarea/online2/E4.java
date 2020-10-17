package tarea.online2;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Comprobar si numero introducido es positivo 
 * @author Daniel Millan
 * @version 1.0
 */
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero=entrada.nextDouble();
        
      if (numero>0){
          System.out.println("El numero es positivo");
          
                   
      }
      
        
        
        
        
    }
    
}
