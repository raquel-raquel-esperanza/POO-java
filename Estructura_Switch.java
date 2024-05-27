import java.util.Scanner;

public class Estructura_Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca del automóvil: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el tipo de transmisión (Standard o Automatico): ");
        String Transmision = scanner.nextLine();

        switch (Transmision) {
            case "Standard":
                System.out.println("El automóvil " + marca + " posee una transmision: " + Transmision + "; es más económico");
                break;
            case "Automatico":
                System.out.println("El automóvil " + marca + " posee una transmision: " + Transmision + "; es más comodo para conducir");
                break;
            default:
                System.out.println("El automóvil " + marca + " posee una transmision: " + Transmision + "; no es una transmision correcta");
                break;
        }
    
    }

    
}
