/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre ;
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        System.out.println("Hola mundo yo soy " + nombre + " y este es mi primer programa en Java");
        
        int num1 = 2;
        int num2 = 5;
        int suma = num1 + num2 ;
        System.out.print(suma);
        System.out.println("");
        double division = num2 / num1 ;
        System.out.print(division);
        System.out.println("");
        boolean bandera = num1 < num2 ;
        System.out.print(bandera);
        System.out.println("");
        num1++;
        System.out.print(num1);
        System.out.println("");
        
        String nomb = "Luis";
        int edad = 30 ;
        
        System.out.println(nomb +" " + edad );
        System.out.println("");
        
        
        boolean band ;
        double coma ;
       
        
        System.out.println("Ingrese el valor booleano");
        band = leer.nextBoolean();
        System.out.println("Ingrese el valor con decimales");
        coma = leer.nextDouble();
        System.out.println("Ingrese el valor char");
        
                
        
        
        
    }
    
}
