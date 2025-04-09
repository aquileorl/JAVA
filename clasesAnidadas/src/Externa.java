
//CLASE ESTÁTICA
public class Externa {

    private static String mensaje = "Soy la clase externa";

    //Clase anidada estática
    static class Interna{
        void mostrarMensaje(){
            System.out.println(mensaje);
        }
    }

}
