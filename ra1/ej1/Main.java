public class Main {
    public static void main(String[] args) {
        //creacion de objetos auto
        Auto toyota = new Auto("toyota", "rojo", "abcd123", "hilux", 2006, 1,15000);
        Auto peugeot = new Auto("peugeot", "amarillo", "abcd124", "206", 2007, 1,1500000);

        System.out.println("mostrar atributos");
        System.out.println(toyota.getmodelo());
        System.out.printf("el modelo es %s\n", toyota.getmodelo());

        System.out.println("funciones con objetos de parametros");
        //polimorfismo ejemplo 1
        toyota.compararmarcas(peugeot);
        peugeot.mostrar();

        //generacion de objetos de subclase
        autoelectrico tesla = new autoelectrico("tesla", "blanco", "123123", "x", 2024, 1, 0, 100000);

        System.out.println(tesla.getcarga());
        System.out.println(tesla.getmodelo());
        tesla.EstadoBateria();

        tesla.mostrar();


        toyota.compararmarcas(tesla.getmarca());

        concesionario<Object> c1= new concesionario(5);
        c1.guardar(toyota);
        c1.guardar(tesla);

        //mostrar los objetos de un consecionario

        for(Object obj : c1.obtenerTodos()){
            if(obj!=null){
                if(obj instanceof autoelectrico){
                    autoelectrico a = (autoelectrico)obj;
                    System.out.println("Auto Electrico");
                    System.out.println("modelo : " +a.getmodelo());
                    a.EstadoBateria();
                }else if (obj instanceof Auto) {
                    Auto a = (Auto)obj;
                    System.out.println("Auto");
                    System.out.println("modelo: " +a.getmodelo());
                }
            }
        }

    }
}