package ArrayList_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda_2 {

    public static void main(String[] args){

        ArrayList<String> agenda2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre;

        do {

            System.out.println("===== MENU =====");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Eliminar Contacto");
            System.out.println("3. Mostrar Agenda");
            System.out.println("4. Salir");

            System.out.println("Introduce opción:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Inserte nombre: ");
                    nombre = sc.nextLine();
                    agenda2.add(nombre);
                    System.out.println("El nombre agregado ha sido: " + nombre);
                    break;

                case 2:
                    System.out.println("¿A quién quieres eliminar de tu agenda?");
                    nombre = sc.nextLine();
                    if(agenda2.contains(nombre)){
                        agenda2.remove(nombre);
                        System.out.println(nombre + " ha sido eliminado.");
                    } else {
                        System.out.println(nombre + " no se encuentra entre tus contactos");
                    }

                    break;

                case 3:
                    if(agenda2.isEmpty()){
                        System.out.println("La agenda está vacía.");
                    } else {
                        for (String n : agenda2){
                            System.out.println(n);
                        }
                        /*
                        ---> El for de arriba hace lo mismo que esto:
                        for (int i=0 ; agenda2.size(); i++){
                            System.out.println(agenda2.get(i));
                        }
                        */

                    }

                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }

        } while (opcion != 4);




    }

}
