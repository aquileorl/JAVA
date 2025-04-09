package DAM.JAVA.herencias.Heroes3;

public class Batman extends SuperHeroe implements ArtesMarciales{

    public Batman(String n, String id) {
        super(n, id);
    }

    @Override
    void usarPoder() {
        System.out.println("Soy Batman, estoy traumatizado, tengo dinero y molo mucho");
    }

    @Override
    public void pelear() {
        System.out.println("Peleando contra enemigos. Voy a ganar.");
    }

    @Override
    public void puñetazo() {
        System.out.println("Toma bat-puñetazo");
    }

    @Override
    public void patada() {
        System.out.println("Toma bat-patada");
    }
}
