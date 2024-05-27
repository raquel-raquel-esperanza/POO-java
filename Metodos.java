import java.util.Scanner;
public class Metodos { //Convertir grados Farehnet a Celsius

    private static double Farehnet;
    public static void main(String[] args) {

        // Llamamos al método principal para pedir la información sin usar parametros
        pedirInformacion();
        
        // Llamamos al método secundario para procesar información utilizando un parametro
        procesarInformacion(Farehnet);
    }

    //Metodo para pedir la información
    public static void pedirInformacion() {
        Scanner scanner = new Scanner(System.in);
        // Aquí puedes agregar la lógica para pedir la información
        System.out.println("-------- Convertir grados Farehnet a Celsius ----------");
        System.out.println("Escriba los grados Farehnet: ");
        Farehnet = scanner.nextDouble();
        scanner.close();
    }

    // Método secundario para procesar información
    public static void procesarInformacion( double Farehnet) {
        // Aquí puedes agregar la lógica para procesar la información
        System.out.println("Procesando información...");
        // Por ejemplo, puedes realizar cálculos, leer datos, etc.
        double resultado = (Farehnet - 32) / 1.8;
        System.out.println("El resultado es: " + resultado);
    }

}
