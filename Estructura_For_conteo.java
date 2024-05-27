// Importar la clase Scanner
import java.util.Scanner;

// Clase principal
public class Estructura_For_conteo { 

    // Método principal
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Imprimir el mensaje y leer la entrada del usuario
        System.out.print("Ingrese la cantidad de numeros que desea imprimir: ");
        int num = scanner.nextInt();

        // Imprimir los números del 0 al 9
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        // Cerrar el objeto Scanner
        scanner.close();
    }
        
}
