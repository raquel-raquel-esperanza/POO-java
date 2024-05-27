public class Estructuras_IF_caracteres {

    public static void main(String[] args) {

        String name = "Rosa";
        String Transmision = "Automatico";
   
        if (Transmision == "Standard") {
            System.out.println("El automóvil de " + name + " posee una transmision: " + Transmision + "; es más económico");
        } else if (Transmision == "Automatico") {
            System.out.println("El automóvil de " + name + " posee una transmision: " + Transmision + "; es más cómodo para conducir");
        } 
    }


}