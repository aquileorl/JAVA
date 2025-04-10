package ArrayList_3;

import java.util.ArrayList;

public class CarritoCompra {

    //Atributos
    private ArrayList<Producto> cesta;

    public CarritoCompra(){
        cesta = new ArrayList<Producto>();
    }

    //MÉTODOS
    public void agregarProducto(Producto producto){
        //Trabajaremos para evitar productos duplicados
        boolean existe = false;
        for(Producto p : cesta){
            if(p.getNombre().equals(producto.getNombre())){
                existe = true;
                System.out.println("Ya existe este producto en la cesta.");
            }
        }
        if (existe == false){
            cesta.add(producto);
        }
    }

    public void agregarProducto2(String nombre, double precio, int cantidad){
        Producto producto = new Producto(nombre, precio, cantidad);
        cesta.add(producto);
    }

    public void eliminarProducto(String nombre){
        boolean existe = false;

        for (Producto p : cesta){
            if(p.getNombre().equals(nombre)){
                existe = true;
                System.out.println("Producto encontrado en la cesta");
                cesta.remove(p);
                System.out.println("Producto: "+ p.getNombre()+ " ya ha sido borrado del carrito.");
                break; //No hace falta que siga recorriendo elementos
            }
        }
        if (!existe){
            System.out.println("No existe ese producto en el carrito");
        }
    }

    public void mostrarCarrito(){

        if (cesta.isEmpty()){
            System.out.println("El carrito está vacío");
        } else {
            double precioTotal = 0;
            for(Producto p : cesta){
                System.out.println(p.toString());
                precioTotal = precioTotal + p.calcularTotal();

            }
            System.out.println("TOTAL A PAGAR = " + precioTotal);
        }

    }

    public void vaciarCarrito(){
        cesta.clear();
        System.out.println("Vaciando carrito...");
    }
}

