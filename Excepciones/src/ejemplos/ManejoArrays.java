package ejemplos;


//COMPROBAR QUE NO SALGA DEL RANGO DE UN ARRAY

public class ManejoArrays {

    public static void main(String[] args){
        int[] a = {10,20,30,40,50};

        try {
            a[0]= 5/0;
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException ae ){ //el específico de un problema que sabremos que puede salir
            System.out.println("Error fuera de rango del array");

        } catch (Exception e){ //el genérico
            System.out.println("Hay un error de tipo: " + e.getMessage());
        }


    }


}
