public class Main {
    public static void main(String[] args) {
        //creacion de objeto 1
        Auto tesla = new Auto("tesla","blanco","abcd13","S","Electrico",2024,0,0);
        System.out.println(tesla.getmodelo());
        Auto toyota = new Auto("toyota", "rojo", "abcd123", "hilux", "diesel", 2006, 1,15000);
        System.out.println(toyota.getmodelo());
        System.out.printf("el modelo es %s", toyota.getmodelo());
        //modificacion de objetos
        tesla.setmodelo("s");
        System.out.println(tesla.getmodelo());
    }
}