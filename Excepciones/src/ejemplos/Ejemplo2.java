package ejemplos;

import javax.swing.*;

public class Ejemplo2 {

    public static void main(String[] args){
        String valor = JOptionPane.showInputDialog("Ingrese un valor: ");

        try {
            int divisor = Integer.parseInt(valor);
            int resultado = 10/divisor;
            System.out.println(resultado);
        } catch (ArithmeticException ae){

            System.out.println("Error diviendo por cero");

        } catch (NumberFormatException nfe){
            System.out.println("Error con el formato introducido");
        }
    }
}
