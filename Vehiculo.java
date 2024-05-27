import java.util.Scanner;
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String matricula;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.matricula = matricula;
    }

    // Métodos para obtener los valores
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    // Métodos para establecer los valores
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para mostrar los detalles del vehículo
    public void mostrarDetalles() {
        System.out.println("----------- Detalles del vehículo: -----------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la marca del vehículo: ");
        String marca = scanner.nextLine();

        System.out.println("Escriba el modelo del vehículo: ");
        String modelo = scanner.nextLine();

        System.out.println("Escriba el año del vehículo: ");
        int anio = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escriba la matrícula del vehículo: ");
        String matricula = scanner.nextLine();
        
        // Crear un objeto de tipo Vehiculo
        Vehiculo miVehiculo = new Vehiculo(marca, modelo, anio, matricula);

        // Mostrar los detalles del vehículo
        miVehiculo.mostrarDetalles();

        scanner.close();
    }
}
