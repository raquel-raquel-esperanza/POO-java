// Importar la clase Scanner
import java.util.Scanner;

// Método principal
public class Funciones {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Imprimir el mensaje y leer la entrada del usuario
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextInt();

        // Imprimir el mensaje y leer la entrada del usuario
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextInt();

        // Imprimir el menu de operaciones
        System.out.println("Escriba la operacion que desea realizar: ");

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int operacion = scanner.nextInt();
        double resultado = 0;

        switch (operacion) {
            case 1:
                resultado = sumar(num1, num2);
                break;      
            case 2:
                resultado = restar(num1, num2);
                break;       
            case 3:
                resultado = multiplicar(num1, num2);
                break;       
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                break;
        }

       

        // Imprimir el resultado de la suma
        System.out.println("El resultado es: " + resultado);

        scanner.close();

    }

    //funcion para sumar
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    //funcion para restar
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    //funcion para multiplicar
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    //funcion para dividir
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
    
}
