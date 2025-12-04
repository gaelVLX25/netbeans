package practica;
import java.util.Scanner;
public class pre_examen1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String[] nombres = new String[4];
        int[] edades = new int[4];
        int mayorEdad = 0;

        // 2. Bucle para Ingresar Datos y Encontrar la Mayor Edad
        System.out.println("--- Ingreso de Edades ---");
        for (int i = 0; i < 4; i++) {
            System.out.println("--- Persona " + (i + 1) + " ---");

            // nombre
            System.out.print("Nombre: ");
            nombres[i] = leer.nextLine();

            // la edad
            System.out.print("Edad: ");
            edades[i] = leer.nextInt();
            leer.nextLine(); 

            // Actualizar la edad máxima
            if (edades[i] > mayorEdad) {
                mayorEdad = edades[i];
            }
        }
        leer.close();

        // 3. Bucle para Determinar a los Mayores
        String resultadoNombres = "";
        int contadorEmpate = 0;

        for (int i = 0; i < 4; i++) {
            if (edades[i] == mayorEdad) {
                // Si la edad actual es igual a la mayor edad encontrada:
                if (contadorEmpate > 0) {
                    // Si ya hay alguien en la lista, agregamos la coma y el espacio para el empate
                    resultadoNombres += ", ";
                }
                resultadoNombres += nombres[i];
                contadorEmpate++;
            }
        }

        // Resultado
        System.out.println("\n--- Resultado ---");

        if (contadorEmpate == 1) {
            // Caso: Sin empate
            System.out.println(resultadoNombres + " es la persona con mayor edad: " + mayorEdad + " años.");
        } else {
            // Caso: Empate
            System.out.println(resultadoNombres + " tienen la misma mayor edad: " + mayorEdad + " años.");
        }
    }
}

    

   
