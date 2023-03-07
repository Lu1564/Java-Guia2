/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta. 
 */
package ejerc8pag25;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class Ejerc8Pag25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota del 1 al 10");
        int nota = leer.nextInt();
        
        while (nota<0 || nota>10){
            System.out.println("Nota invalida ingrese nuevamente");
            int nota = leer.nextInt();
            
        }
    }
    
}
