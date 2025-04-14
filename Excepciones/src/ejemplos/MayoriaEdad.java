package ejemplos;

import java.util.Scanner;

public class MayoriaEdad {

    public static void main(String[] args){

        try{
            System.out.println("Dime la edad:");
            Scanner sc = new Scanner(System.in);
            int edad;
            edad = sc.nextInt();
            verificarEdad(edad);
        } catch (MenorEdadExcepction mee){
            System.out.println("Advertencia: "+ mee.getMessage());
        } catch (Exception e) {
            System.out.println("Hay algún error");
        }



    }


    public static void verificarEdad(int edad) throws MenorEdadExcepction{
        if (edad >= 18){
            System.out.println("Perfecto. Es mayor de edad.");
        } else {
            //Aquí debería lanzar la excepcion
            throw new MenorEdadExcepction("Es menor de edad.");
        }
    }

}
