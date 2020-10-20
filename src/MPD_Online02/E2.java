package MPD_Online02;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Mostar suma, resta, multiplicacion y division de numero introducido por teclado
 * @author Daniel Millan
 * @version 1.0
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada=new Scanner(System.in);
         
         System.out.println("Introduzca dos numeros por teclado");
         
         int numero1=entrada.nextInt();
         int numero2=entrada.nextInt();
         
         System.out.println(("el primer numero es ")+numero1+ ("   el segundo numero es  ")+numero2);
         System.out.println("La suma de ambos numero es "+(numero1+numero2));
         System.out.println("La reta de ambos numero es "+(numero1-numero2));
         System.out.println("La multiplicacion de ambos numero es "+(numero1*numero2));
         System.out.println("La division de ambos numero es "+(numero1/numero2));
         
         
        
        
        
        
    }
    
}
