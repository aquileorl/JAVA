package Lista;


import java.util.LinkedList;
import java.util.ArrayList;

public class Comparacion {

    public static void main(String[] args){

        int cantidadElementos = 100000;
        int posicionInsercion = 1000;

        //RELLENAMOS ARRAYLIST
        ArrayList<Integer> cadena = new ArrayList<>();
        for (int i = 0; i < cantidadElementos ; i++){
            cadena.add(i);
        }

        //RELLENAMOS LINKEDLIST
        LinkedList<Integer> lista = new LinkedList<>();
        for (int i = 0; i < cantidadElementos; i++){
            lista.add(i);
        }

        long inicioArrayList = System.nanoTime();
        cadena.add(posicionInsercion, -1);
        long finArrayList = System.nanoTime();
        finArrayList = finArrayList - inicioArrayList;

        long inicioLista = System.nanoTime();
        lista.add(posicionInsercion, -1);
        long finLista = System.nanoTime();
        finLista = finLista - inicioLista;

        System.out.println("Tiempo inserción ArrayList: "+finArrayList);
        System.out.println("Tiempo inserción LinkedList: "+finLista);




    }
}
