package MPD_Online02;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Introducir dos numeros y sumar o restar segun se indique por el teclado 
 * @author Daniel Millan
 * @version 1.0
 */
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduzca dos numeros");
        int n1=entrada.nextInt();
        int n2=entrada.nextInt();
        
        System.out.println(" Elija  1-sumar   2-restar");
        int opcion=entrada.nextInt();
        switch (opcion){
            
            case 1: 
                System.out.println("la suma es :  " +(n1+n2));
                break;
            case 2:
                System.out.println("La resta es:  "+(n1-n2));
                break;
                
                
                
        }
    }
    
}
