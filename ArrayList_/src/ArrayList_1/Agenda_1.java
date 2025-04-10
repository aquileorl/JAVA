package ArrayList_1;

import java.util.ArrayList;

public class Agenda_1 {

    public static void main(String[] args){

        //ARRAYLIST
        ArrayList<String> miAgenda = new ArrayList<>();
        miAgenda.add("Paco");
        miAgenda.add("Susana");
        miAgenda.add("Emilio");
        miAgenda.add("Aida");
        miAgenda.add("Juan");
        miAgenda.add("Montaña");
        miAgenda.remove(1); //elimina el indice 1
        miAgenda.remove("Paco"); //elimina al objeto "Paco"
        miAgenda.get(0); //Me devuelve al que tengo en la posición marcada
        int i = miAgenda.indexOf("Juan"); //me devuelve el índide del objeto
        int i2 = miAgenda.lastIndexOf("Emilio"); //me devuelve el último índice de ese objeto
        miAgenda.set(miAgenda.indexOf("Montaña"),"Marco");
        /**
         * miAgenda.set(index i, String ponerLoQueSea);
         * Esto es para modificar un objeto en el índice i
         */

        System.out.println(i + " y "+ i2);
        System.out.println(miAgenda);

        miAgenda.clear(); //Limpia toda la lista

        System.out.println(miAgenda);

        System.out.println(miAgenda.isEmpty()); //miAgenda.isEmpty(); para saber si la lista está vacía

        System.out.println(miAgenda.contains("Tania"));
        /**
         * miAgenda.contains(object) -> Para saber si la lista contiene ese objeto
         */


    }



}
