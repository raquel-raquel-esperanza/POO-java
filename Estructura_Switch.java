// Importar la clase Scanner
import java.util.Scanner; 

// Clase principal
public class Estructura_Switch { 

    // Método principal
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario 
        Scanner scanner = new Scanner(System.in); 

        // Imprimir el mensaje y leer la entrada del usuario
        System.out.print("Ingrese la marca del automóvil: "); 
        // Leer la entrada del usuario y asignarla a la variable marca
        String marca = scanner.nextLine(); 

        // Imprimir el mensaje y leer la entrada del usuario
        System.out.print("Ingrese el tipo de transmisión (Standard o Automatico): "); 
        // Leer la entrada del usuario y asignarla a la variable Transmision
        String Transmision = scanner.nextLine(); 

        // Crear un switch con la variable Transmision
        switch (Transmision) { 
            // Caso para la transmision Standard
            case "Standard": 
                // Imprimir el resultado
                System.out.println("El automóvil " + marca + " posee una transmision: " + Transmision + "; es más económico"); 
                // Romper el switch
                break; 
            // Caso para la transmision Automatico
            case "Automatico": 
                // Imprimir el resultado
                System.out.println("El automóvil " + marca + " posee una transmision: " + Transmision + "; es más comodo para conducir");
                // Romper el switch
                break;
            // Caso por defecto    
            default: 
                // Imprimir el resultado    
                System.out.println("El automóvil " + marca + " posee una transmision: " + Transmision + "; no es una transmision correcta");
                // Romper el switch
                break;
        }
    }
}
