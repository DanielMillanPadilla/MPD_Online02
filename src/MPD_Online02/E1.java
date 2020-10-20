package MPD_Online02;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Menu para pasar de pulgadas a cm y viceversa
 * @author Daniel Millan
 * @version 1.0
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        double c=(2.54);
        
  
        // Pedimos la opción 
        System.out.println( "Elije:  1-De pulgada a cm    2-De cm a pulgada"); 
          int seleccion= entrada.nextInt();
          
        //AL pedir un menú lo mas conveniente es usar Swith
        
        switch(seleccion){
            
            //case 1 de Pulgada a cm
            case 1:
                System.out.println("introduzca las pulgadas");
                double p=entrada.nextDouble();
                double rpulg=(p*c);
                System.out.println ("El numero de pulgadas "+p+" es igual a  "+rpulg+"cm");
                break;
            
            // case 2 de cm a pulgadas
            case 2: 
                System.out.println("Introduzca los cm");
                double cm=entrada.nextDouble();
                double rcm=(cm/c);
                System.out.println ("El numero de cm "+cm+" es igual a  "+rcm+"pulgadas");
                
                break;
                
                         }        
            
            
            
        }
    
                
} 
    
