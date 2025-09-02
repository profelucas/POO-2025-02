class humano{
    //atributos
    private int edad;
    String nombre;
    String nacionalidad;

    //funcion constructor
    public humano( int a, String b, String c){
        edad= a;
        nombre = b;
        nacionalidad = c;
    }
    //funcion estatica
    public static void mostrar(){
        System.out.println("se ha creado una clase");
    }
    //funcion objeto
    public void mostrar2(){
        System.out.println("se ha creado un objeto");
    }
    //ejemplo de get
    public int edades(){
        return edad;
    }
    //ejemplo de set
    public void cambiaredad(int a){
        edad = a;
    }
}