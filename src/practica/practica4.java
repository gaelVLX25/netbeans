
package practica;

import java.util.Scanner;

/**
 *
 * @author Anahi
 */
public class practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa la longitud del lado del pentágono: ");
        double lado = entrada.nextDouble();
        
        System.out.print("Ingresa el valor de la apotema del pentágono: ");
        double apotema = entrada.nextDouble();
        
        double perimetro = 5 * lado;
        double area = ((perimetro * apotema) / 2);
        
        System.out.println("El perímetro del pentágono es: " + perimetro);
        System.out.println("El área del pentágono es: " + area);
        
    }
    
}
