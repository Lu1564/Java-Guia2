/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc6pag22;
import java.util.Scanner ;

/**
 *
 * @author Luis
 */
public class Ejerc6pag22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        if (num1>25 || num2 > 25){
            System.out.println("Alguno de los datos es mayor a 25");
         
        } else {
            System.out.println("Ninguno de los datos es mayor de 25");
        }
    }
    
}
