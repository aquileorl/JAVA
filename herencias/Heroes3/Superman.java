package DAM.JAVA.herencias.Heroes3;

/**
 * Clase que representa a Superman
 * Hereda de superheroe
 * Implementa también la interfaz volar
 */
public class Superman extends SuperHeroe implements Volar{


    public Superman(String n, String id){
        super(n, id);
    }

    @Override
    void usarPoder() {
        System.out.println("Soy Superman y vuelo");
    }

    @Override
    public void volar() {
        System.out.println("Estoy surcando el cielo");
    }
}
