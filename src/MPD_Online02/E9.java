/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MPD_Online02;
import java.util.Scanner;

/**
 * Indicar si numero introducido por teclado es par o impar.
 * @author Daniel Millan
 * @version 1.0
 */ 
 
  
public class E9 {

    /**
     * @param args the command line arguments
     * El metodo utilizado es el metodo Main
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        System.out.println("introduzca un numero");
        int numero=entrada.nextInt();
        
        if (numero%2==0){
            System.out.println("el numero es par");
        }
        if (numero%2!=0){
            System.out.println("el numero es impar");
        }
        
        
    }
    
}
