package DAM.JAVA.herencias.Heroes3;


/**
 * @author Emilio Ruiz
 * @version 1.0
 */
public class Main {

    public static void main(String[] args){

        SuperHeroe [] heroes = new SuperHeroe[3];
        heroes[0] = new Superman("Super Lopez","Paco");
        heroes[1] = new Batman("Dark Night", "Bruce Wayne");
        heroes[2] = new Spiderman("Spiderman", "Peter Parker");


        heroes[0].saludar();
        heroes[1].saludar();
        heroes[2].saludar();

        /**
         * Aquí no hace falta castear tipo clase hijo como abajo porque accedemos
         * a métodos de la clase con la que definimos el array (SuperHeroe)
         */
        heroes[0].usarPoder();
        heroes[1].usarPoder();
        heroes[2].usarPoder();

        /**
         * Casteo el tipo de clase hijo si quiero acceder a métodos de clase hijo
         */
        ((Superman) heroes[0]).volar();
        ((Batman) heroes[1]).puñetazo();
        ((Spiderman) heroes[2]).treparEdificio();

        if(heroes[0] instanceof Superman){
            ((Superman) heroes[0]).volar();
        } else {
            System.out.println("No es tipo Superman");
        }

        /**
         * De todas formas, esto del casteo es un parche que hemos hecho ahora. Habrá ocasiones
         * que no sabremos o recordaremos de qué clase hija es el SuperHeroe en un índice determinado.
         * Lo más lógico para este ejemplo hubiera sido:
         */
        Batman batman = new Batman("Batman","Bruce Wayne");
        batman.puñetazo();

        Spiderman spiderman = new Spiderman("Spiderman", "Peter Parker");
        spiderman.lanzartelaranya();

        /**
         * Otra forma usando array, aunque también muy engorrosa:
         */

        SuperHeroe [] baldaos = new SuperHeroe[3];
        Superman superman = new Superman("Superman", "Clark Kent");
        Batman batman2 = new Batman("Caballerito Oscurito", "Juanito");
        Spiderman spidey = new Spiderman("Spidey", "Juanillo");

        baldaos[0] = superman;
        baldaos[1]= batman2;
        baldaos[2] = spidey;

        System.out.println(batman2.toString());

        /**
         * La lógica del for de abajo es:
         * Me creas un "heroe" de tipo SuperHeroe que recorra el array Heroes
         * Me vas a recorrer todo el array heroes sin salirte del rango
         * Y a medida que vas pasando, de que cada elemento del array ya que estás
         * ejecuta el método saludar()
         */
        for(SuperHeroe heroe : heroes){
            heroe.saludar();
        }


        /**
         * Vamos a continuar con tema casteo
         */


    }
}
