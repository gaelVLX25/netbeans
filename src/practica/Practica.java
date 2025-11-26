package practica;

import java.util.Scanner;

/**
 *
 * @author Anahi
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, resultado;
        
        System.out.print("escribir primer valor: ");
        num1 = entrada.nextInt();
        
        System.out.print("escribir segundo valor: ");
        num2 = entrada.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("el resultado es =" + resultado );
        }
    }

