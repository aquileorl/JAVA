package DAM.JAVA.herencias.superHeroes;

/*Clase abstracta que representa un Super Heroe
 * Define atributos comunes a todos los superheroes
 */

abstract public class SuperHeroe {
    private String nombre;
    private String identidadSecreta;

    /*
     * Constructor de la clase súper héroe
     */
    public SuperHeroe(String n, String id){

        this.nombre = n;
        this.identidadSecreta = id;
        
    }

    /**
     * Método que presenta al superheroe mostrando su nombre e identidad secreta
     */

    public void presentarse(){
        System.out.println("Soy: "+ nombre + " y mi identidad secreta es: "+ identidadSecreta);
    }

    /**
     * Método abstracto que cada super heroe implementerá
     */
    abstract void usarPoder();
}
