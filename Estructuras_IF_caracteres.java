public class Estructuras_IF_caracteres {

    public static void main(String[] args) {

        String name = "Rosa";
        String Transmision = "Automatico";
   
        if ("Standard".equals(Transmision)) {
            System.out.println("El automóvil de " + name + " posee una transmision: " + Transmision + "; es más económico");
        } else if ("Automatico".equals(Transmision)) {
            System.out.println("El automóvil de " + name + " posee una transmision: " + Transmision + "; es más cómodo para conducir");
        } 
    }


}