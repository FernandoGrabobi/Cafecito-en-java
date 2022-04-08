package Ejercicio2Listadetareas;

public class Tarea {

    private String nombre;
    public String descripcion;
    //constructor
    public Tarea(String nombre, String descripcion){

        this.nombre = nombre;
        this.descripcion = descripcion;

    }
    public String getNombre(){
        //para mostrar un atributo privado
        return this.nombre;
    }

    public void setNombre(String nombre){
        //para mostrar un atributo privado
        this.nombre = nombre;
    }

    public void mostrar(){

       System.out.println(this.nombre+" : "+this.descripcion+" . ");
       ///opcion 2: String a = this.nombre+" : "+this.descripsion+" : ";

    }

}
