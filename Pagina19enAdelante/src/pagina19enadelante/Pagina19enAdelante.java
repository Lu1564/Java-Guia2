/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagina19enadelante;

import java.util.Scanner;

        
/**
 *
 * @author Luis
 */
public class Pagina19enAdelante {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
 System.out.println("Ingresa tu nombre");
 String nombre = leer.nextLine();

 System.out.println("Ingresa tu edad");
 int edad = leer.nextInt();
 if (edad >= 18) { 
     System.out.println("Es mayor de edad"); 
 } else {
     System.out.println("Es menor de edad");
 }
 
 
 
 }
}