// Importar la clase Scanner
import java.util.Scanner;

// Clase principal
public class Estructura_for_anidada {
    
    // Método principal
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Imprimir el mensaje y leer la entrada del usuario
        System.out.print("Ingrese el numero de filas: ");
        int height = scanner.nextInt();

        // Imprimir el mensaje y leer la entrada del usuario
        System.out.print("Ingrese el numero de columnas: ");
        int width = scanner.nextInt();
       
        scanner.close();
        //Imprime las Filas
        for (int i = 0; i < height; i++) {
            //numeros aleatorios
            int Xrandom = (int) (Math.random() * 9) + 1;
            //Imprime los numeros
            System.out.print(Xrandom + " ");

            //Imprime las columnas
            for (int j = 0; j < width; j++) {
                //numeros aleatorios
                int Yrandom = (int) (Math.random() * 9) + 1;
                //Imprime los numeros
                System.out.print(Yrandom + " ");
            }
            //salto de linea
            System.out.println();
        }
        
    }


}
