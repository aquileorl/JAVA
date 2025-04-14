package ejemplos;

import java.util.Scanner;

public class ValidarNumeroNegativo {

    public static void verificarNumero (int numero) throws NumeroNegativoException{

        if (numero < 0 ){
            //Error
            throw new NumeroNegativoException("Es un número negativo");
        } else {
            System.out.println("Número válido");
        }

    }




    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero;

        try {
            System.out.println("Ingrese el numero que desea validar: ");
            numero = sc.nextInt();
            verificarNumero(numero);
        } catch (NumeroNegativoException nne){
            System.out.println("Fuera del límite: "+ nne.getMessage());
        } catch (Exception e){
            System.out.println("Otro error.");
        }

    }
}
