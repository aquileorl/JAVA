package ejemplos;

import javax.swing.*;

public class Ejemplo1 {

    public static void main(String[] args){
        String valor = JOptionPane.showInputDialog("Ingrese el valor: ");





        //AQUÍ PUEDEN PASAR POR EJEMPLO 2 ERRORES:
        /**
         * 1ER ERROR: QUE EN "VALOR" INSERTEMOS UN VALOR NO NUMÉRICO
         * 2º ERROR: QUE EN VALOR INSERTEMOS UN 0. AL DIVIDOR POR 0 DARÁ ERROR.
         */

        //VAMOS, POR LO TANTO, A CONTROLAR ESOS 2 ERRORES
        try { //ES DECIRLE: "INTENTA ESTE ERROR"
            //dentro del try debemos poner lo que queremos que monitorice
            int divisor = Integer.parseInt(valor);
            int resultado = 10/divisor;
            System.out.println(resultado);

        } catch (Exception e) { //el catch es: "si se produce error en el try, captúralo y
            //ejecuta este bloque para manejar y evitar que el programa se detenga
            //throw new RuntimeException(e);
            System.out.println("Se ha producido una excepcion de tipo "+ e.getMessage());

        } finally { //Poner el finally es opcional
            JOptionPane.showInputDialog(null,"EL PROGRAMA está dentro del finally");
        }
        JOptionPane.showInputDialog(null,"EL PROGRAMA FINALIZA");
    }


}
