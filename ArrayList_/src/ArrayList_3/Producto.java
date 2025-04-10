package ArrayList_3;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularTotal(){
        return cantidad * precio;
    }

    /**
     * Sobre escribimos un método de la clase padre Objetct y le pedimos que nos devuelva
     * un String con el nombre, el precio, la cantidad y el coste total.
     * @return
     */
    @Override
    public String toString() {
        return nombre + ",\t" + precio + ",\t" + cantidad + " = " + calcularTotal();
    }
}
