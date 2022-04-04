package Ejercicio2Listadetareas;

public class Tarea {

    public String nombre;
    public String descripsion;
    //constructor
    public Tarea(String nombre, String descripsion){

        this.nombre = nombre;
        this.descripsion = descripsion;

    }

    public String mostrar(){

       return this.nombre+" : "+this.descripsion+" . ";
       ///opcion 2: String a = this.nombre+" : "+this.descripsion+" : ";

    }

}
