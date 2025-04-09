package DAM.JAVA.herencias.Heroes3;

public class Spiderman extends SuperHeroe implements LanzarTelarañas{

    public Spiderman(String n, String id) {
        super(n, id);
    }

    @Override
    void usarPoder() {
        System.out.println("Soy Spiderman y tengo sentido arácnido");
    }

    @Override
    public void lanzartelaranya() {
        System.out.println("Lanzando telas de araña...");
    }

    @Override
    public void volarEntreEdificios() {
        System.out.println("Fium-Fium-Fium");
    }

    @Override
    public void treparEdificio() {
        System.out.println("Trepando por la fachada de este edificio");
    }
}
