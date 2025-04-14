package ejemplos;

public class Cajero {

    public static void main(String[] args){

        double saldo = 100;

        try {
            saldo = retirarDinero(saldo, 5);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " +  e.getMessage());
        }

        System.out.println("Te quedan: " + saldo+ " euros");

    }

    public static double retirarDinero(double saldo, double cantidad) throws SaldoInsuficienteException{
        if (saldo < cantidad){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        } else {

            saldo = saldo - cantidad;
            System.out.println("Has retirado: " + cantidad + " euros");
            return saldo;
        }

    }

}
