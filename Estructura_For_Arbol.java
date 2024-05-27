import java.util.Scanner;

public class Estructura_For_Arbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura del árbol: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            // Imprimir espacios para centrar el árbol
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos para formar la parte triangular del árbol
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Cambiar de línea para la siguiente fila
        }

        // Imprimir los caracteres "|||" centrados al final del árbol
        int spaces = height - 2;
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println("|||");
    }
}
