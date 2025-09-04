class Auto {
    //atributos
    private String marca;
    private String color;
    private String patente;
    private String modelo;
    private int Annio;
    private float km;
    private int traccion;

    //metodo constructor
    public Auto(String tmarca, String color, String patente, String Modelo, int an, int trac, float km){
        //forma 1
        marca = tmarca;
        //forma 2
        this.color = color;
        this.Annio= an;
        this.modelo= Modelo;
        this.patente=patente;
        this.traccion=trac;
        this.km=km;
    }
    //get
    public String getmodelo(){
        return this.modelo;
    }
    //set
    public void setmodelo(String modelo){
        this.modelo=modelo;
    }

    public String getmarca(){
        return this.marca;
    }

    //funcion compare dos marcas de objetos distintos

    public void compararmarcas(String marca_objeto){
        if (this.marca==marca_objeto) {
            System.out.println("Son marcas iguales");
        } else {
            System.out.println("Son marcas distintas");
        }
    }

    public void compararmarcas2(Auto c1){

        String marca = c1.getmarca();

        if (this.marca == marca) {
            System.out.println("Son marcas iguales");
        } else {
            System.out.println("Son marcas distintas");
        }

    }
}

class autoelectrico extends Auto{

    private int capacidadcarga;

    public autoelectrico(String tmarca, String color, String patente, String Modelo, int an, int trac, float km, int capacidadcarga){
        super(tmarca,color,patente,Modelo, an, trac, km);
        this.capacidadcarga=capacidadcarga;
    }

    public int getcarga(){
        return this.capacidadcarga;
    }

    // funcion ->> Estado de la bateria()
    //>>50kw -> cambie la bateria

    public void EstadoBateria(){
        if (this.capacidadcarga<=50000) {
            System.out.println("Cambie la bateria");
        } else {
            System.out.println("El estado de la bateria es optimo");
        }
    }
}