
package practica;

import java.util.Scanner;

/**
 *
 * @author Anahi
 */
public class practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa la base del triángulo: ");
        double base = entrada.nextDouble();
        
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = entrada.nextDouble();
        
        double area = (base*altura)/2;
        
        System.out.println("el area es =" + area);
        
    }
    
}
