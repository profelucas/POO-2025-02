public class main {
    //ejemplo de funcion simple
    public static int suma(int a, int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        //declaracion de variables
        int a=5;
        float b =3.5f;
        String c= "hola mundo";
        System.out.println(c);

        //ciclos
        for(int i = 0; i<10; i++ ){
            System.out.println(i);
        }

        if(a==5){
            System.out.println("es 5");
        }else{
            System.out.println("no es 5");
        }

         int suma1 = suma(5,6);
         System.out.println(suma1);

         
         //clase
         humano.mostrar();
         //creacion de objetos
         humano p1 = new humano(15,"anastacio","chilena");
         humano p2 = new humano (81, "rodrigo","Peruana");
         int edad = p1.edades();
         System.out.println(edad);
         System.out.println(p2.edades());
         p2.cambiaredad(155);
         System.out.println(p2.edades());
         p1.mostrar2();
    }

    
}
