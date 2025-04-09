package DAM.JAVA.herencias.Heroes3;

/**
 * Clase abstracta que representa un super heroe
 * Define parametros comunes a todos los super heroes
 */
abstract public class SuperHeroe {

    /**
     * Atributos comunes a todos los superheroes
     */
    private String nombre;
    private String identidadSecreta;

    /**
     * Constructor del SuperHeroe
     * @param n
     * @param id
     */
    public SuperHeroe(String n, String id){
        this.nombre = n;
        this.identidadSecreta = id;
    }

    /**
     * Metodo saludar, comun a todos los superheroes
     */
    void saludar(){
        System.out.println("Hola, me llamo "+nombre+" y mi identidad secreta es "+identidadSecreta);
    }

    /**
     * Metodo usarPoder, que cada super heroe deberá definir en su propia clase
     */
    abstract void usarPoder();


}
