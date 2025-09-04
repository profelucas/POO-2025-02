class Auto {
    //atributos
    private String marca;
    private String color;
    private String patente;
    private String modelo;
    private String Combustible;
    private int Annio;
    private float km;
    private int traccion;

    //metodo constructor
    public Auto(String tmarca, String color, String patente, String Modelo, String combustible, int an, int trac, float km){
        //forma 1
        marca = tmarca;
        //forma 2
        this.color = color;
        this.Annio= an;
        this.modelo= Modelo;
        this.patente=patente;
        this.Combustible=combustible;
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

}