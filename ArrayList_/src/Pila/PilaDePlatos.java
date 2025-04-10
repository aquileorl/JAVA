package Pila;

import java.util.Stack;
import java.util.Scanner;

public class PilaDePlatos {
    //EJEMPLO PILA FREGAR PLATOS
    public static void main(String[] args){
        Stack<String> platosSucios = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {

            System.out.println("===== MENÚ =====");
            System.out.println("1. Apilar plato sucio");
            System.out.println("2. Lavar plato");
            System.out.println("3. Mostrar pila de platos sucios");
            System.out.println("4. Salir");

            System.out.println("Elige opción: ");
            opcion = sc.nextLine();

            switch (opcion){
                case "1":
                    System.out.println("¿Qué plato vas a apilar?:");
                    platosSucios.push(sc.nextLine());
                    System.out.println("Plato apilado correctamente");
                    break;

                case "2":
                    if(platosSucios.isEmpty()){
                        System.out.println("No quedan platos sucios");
                    } else {
                        String platolimpio = platosSucios.pop();
                        System.out.println("Plato lavado correctamente");
                    }
                    break;

                case "3":
                    if(platosSucios.isEmpty()){
                        System.out.println("No quedan platos apilados");
                    } else {
                        for (String p : platosSucios){
                            System.out.println(p);
                        }
                    }
                    break;

                case "4":
                    System.out.println("¡Hasta luego");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (!opcion.equals("4"));

        sc.close();
    }

}
