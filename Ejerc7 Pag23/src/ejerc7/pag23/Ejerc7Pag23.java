/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc7.pag23;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class Ejerc7Pag23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor (del 1-4) ");
        int num = leer.nextInt();
        
        switch (num){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break ;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No pertenece a una opcion valida");
                
        } 
        
    }
    
}
