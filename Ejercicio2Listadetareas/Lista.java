package Ejercicio2Listadetareas;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nombre;
        String descripsion;
        int menu = 0;
        int cant_tareas = 0;
        
        System.out.println(" Cuantas tareas desea ingresar ?");
        cant_tareas = input.nextInt();
        System.out.flush();
        Tarea lista_tarea[] =new Tarea [cant_tareas];

        while(menu != 3){
            System.out.println(" Presione 1 para cargar una nueva tarea ");
            System.out.println(" Presione 2 para mostrar una tarea especifica ");
            System.out.println(" Presione 3 para salir del programa");
            menu = input.nextInt();
            System.out.flush();

            switch(menu){
                case 1:
                System.out.print("\033[H\033[2J");                

                for(int i = 0; i < cant_tareas; i++ ){

                    System.out.println(" Ingrese el nombre de la tarea "+i+":  ");
                    nombre = input.nextLine();
                    input.nextLine();
                    System.out.println(" Ingrese la descripsion de la tarea "+i+":  ");
                    descripsion = input.nextLine();
                    
                    lista_tarea[i] = new Tarea(nombre, descripsion);

                }
                
                break;
                case 2:
                System.out.print("\033[H\033[2J");

                for(int i = 0; i < cant_tareas; i++ ){

                    System.out.println(" Tarea numero "+i+": ");
                    System.out.println(lista_tarea[i]);

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