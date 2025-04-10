package Lista;

import java.util.Scanner;
import java.util.LinkedList;

public class Serpiente {

    public static void main(String[] args){
        LinkedList<String> snake = new LinkedList<>();
        snake.add("8");
        snake.add("0");
        snake.add("0");

        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Comer comida (+1 segmento)");
            System.out.println("2. Moverse (quitar cola y agregar cabeza)");
            System.out.println("3. Choca y termina el juego");
            System.out.println("4. Salir");

            opcion = sc.nextLine();

            switch (opcion){
                case "1":
                    snake.addFirst("8");
                    System.out.println("Serpiente ha crecido");
                    System.out.println(snake);
                    break;

                case "2":
                    snake.removeFirst();
                    snake.addLast("0");
                    System.out.println("Serpiente se ha movido");
                    System.out.println(snake);
                    break;

                case "3":
                    System.out.println("Choque. GAME OVER");
                    break;

                case "4":
                    System.out.println("FIN DEL JUEGO");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (!opcion.equals("4"));
    }
}
