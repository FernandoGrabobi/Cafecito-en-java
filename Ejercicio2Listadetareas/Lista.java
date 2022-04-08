package Ejercicio2Listadetareas;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nombre;
        String descripcion;
        int menu = 0;
        int cant_tareas = 0;
        int boton = 0;
        
        System.out.println(" Cuantas tareas desea ingresar ?");
        cant_tareas = input.nextInt();
        input.nextLine();
        Tarea lista_tarea[] =new Tarea [cant_tareas];

        while(menu != 3){
            System.out.println(" Presione 1 para cargar una nueva tarea ");
            System.out.println(" Presione 2 para mostrar una tarea especifica ");
            System.out.println(" Presione 3 para salir del programa");
            menu = input.nextInt();
            input.nextLine();

            switch(menu){
                case 1:
                System.out.print("\033[H\033[2J");                

                for(int i = 0; i < cant_tareas; i++ ){

                    System.out.println(" Ingrese el nombre de la tarea "+i+":  ");
                    nombre = input.nextLine();
                    System.out.println(" Ingrese la descripsion de la tarea "+i+":  ");
                    descripcion = input.nextLine();
                    
                    lista_tarea[i] = new Tarea(nombre, descripcion);

                    System.out.println(" desea seguir cargando tareas? 1 para si - 2 para no ");
                    boton = input.nextInt();
                    input.nextLine();

                    if(boton == 1){

                        i = cant_tareas + 1;
                        
                        System.out.println(" : termino la carga de tareas : ");

                    }else{       }

                }
                
                break;
                case 2:
                System.out.print("\033[H\033[2J");

                for(int i = 0; i < lista_tarea.length ; i++ ){

                    if(lista_tarea[i] != null){

                        System.out.println(" Tarea numero "+i+": ");
                        lista_tarea[i].mostrar();
                        //System.out.println(lista_tarea[i].getNombre());
                        //lista_tarea[i].setNombre("faacaw");
                        // para modificar y mostrar atributos privados
                    }
                    
                }

                break;
                case 3:
                System.out.print("\033[H\033[2J");
                System.out.println(" El programa a finalizado correctamente ");
                break;
                default:
                System.out.print("\033[H\033[2J");
                System.out.println(" Ingrese una opcion valida ");
                break;

            }
            


        }

        input.close();
    }

}
//lista_tarea[i]=new tarea(m,m)