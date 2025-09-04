public class Main {
    public static void main(String[] args) {
        //creacion de objeto 1
        Auto toyota = new Auto("toyota", "rojo", "abcd123", "hilux", 2006, 1,15000);
        Auto peugeot = new Auto("peugeot", "amarillo", "abcd124", "206", 2007, 1,1500000);
        System.out.println("mostrar atributos");

        System.out.println(toyota.getmodelo());
        System.out.printf("el modelo es %s\n", toyota.getmodelo());

        System.out.println("funciones con objetos de parametros");
        toyota.compararmarcas2(peugeot);

      
        autoelectrico tesla = new autoelectrico("tesla", "blanco", "123123", "x", 2024, 1, 0, 100000);

        System.out.println(tesla.getcarga());
        System.out.println(tesla.getmodelo());

        tesla.EstadoBateria();
        toyota.compararmarcas(tesla.getmarca());
       
    }
}