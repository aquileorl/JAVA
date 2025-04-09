package DAM.JAVA.herencias.Heroes3;

public class Hulk extends SuperHeroe{

    public Hulk(String n, String id) {
        super(n, id);
    }

    @Override
    void usarPoder() {
        System.out.println("Soy Hulk y estoy petadísimo");
    }
}
