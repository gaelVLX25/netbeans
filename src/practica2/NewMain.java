/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Anahi
 */
public class NewMain {

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
