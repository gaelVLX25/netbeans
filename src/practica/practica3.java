
package practica;

import java.util.Scanner;

/**
 *
 * @author Anahi
 */
public class practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("escribir primer valor: ");
        double n1 = entrada.nextDouble();
        
        System.out.print("escribir segundo valor: ");
        double n2 = entrada.nextDouble();
        
        System.out.print(" escribir tercer valor: ");
        double n3 = entrada.nextDouble();
        
        double promedio = (n1 + n2 + n3)/3;
        System.out.println("el promedio es: " + promedio);
    }
    
}
