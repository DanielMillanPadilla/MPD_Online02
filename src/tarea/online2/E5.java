package tarea.online2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 10 siguientes numeros pares al introducido por el teclado
 * @author Daniel Millan
 * @version 1.0
 */
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero=entrada.nextInt();
        
      for (int i=0; i<=18; i+=2){
          
          if (numero%2==0){
          System.out.println("Los diez siguientes numeros pares son:  " +(numero+i));
        
                   
      }
          else if (numero%2!=0){
              int a=numero+1;
          
              System.out.println("Los diez siguientes numeros pares son:" +(a+i));
          }
      
      }
        
        
        
    }
    
}
