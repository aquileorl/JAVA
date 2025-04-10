package Lista;

import java.util.LinkedList;
public class Ejemplo1 {

    public static void main(String[] args){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("a");
        lista.add("c");
        lista.add("d");
        lista.add("f");

        lista.addLast("b"); //AÑADE AL FINAL DE LA LISTA
        lista.addFirst("x"); //AÑADE EL PRIMERO EN LA LISTA
        lista.addFirst("ZZ");


        lista.remove(); //ELIMINA EL PRIMER ELEMENTO DE LA LISTA
        System.out.println(lista);
        lista.remove();
        System.out.println(lista);

        System.out.println(lista.get(0)); //ME MUESTRA EL ELEMENTO DE ESE ÍNDICE DE LA LISTA
        System.out.println(lista.getLast());
        System.out.println(lista.get(2));
    }
}
