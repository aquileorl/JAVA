package ArrayList_3;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        CarritoCompra carrito = new CarritoCompra();
        String opcion, nombre;
        double precio;
        int cantidad;

        do {

            System.out.println("===== MENÚ =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar carrito");
            System.out.println("4. Vaciar carrito");
            System.out.println("5. Salir");

            System.out.println("Elige una opción");
            opcion = sc.nextLine();


            switch (opcion) {
                case "1":
                    System.out.println("¿Nombre del producto?");
                    nombre = sc.nextLine();
                    System.out.println("¿Precio?: ");
                    precio = sc.nextDouble();
                    System.out.println("¿Cuant@s quieres?: ");
                    cantidad = sc.nextInt();
                    carrito.agregarProducto2(nombre, precio, cantidad);
                    sc.nextLine();
                    break;

                case "2":
                    System.out.println("¿Qué producto quieres eliminar?:");
                    nombre = sc.nextLine();
                    carrito.eliminarProducto(nombre);
                    break;

                case "3":
                    carrito.mostrarCarrito();
                    break;

                case "4":
                    carrito.vaciarCarrito();
                    break;

                case "5":
                    System.out.println("¡Hasta luego!");
                    break;

                case "7":
                    System.out.println("Vamos a añadir un producto de otra manera:");
                    nombre = sc.nextLine();
                    System.out.println("Precio: ");
                    precio = sc.nextDouble();
                    System.out.println("¿Cantidad?: ");
                    cantidad = sc.nextInt();
                    Producto p = new Producto(nombre,precio,cantidad);
                    carrito.agregarProducto(p);
                    sc.nextLine();

                default:
                    System.out.println("Opción no válida");
            }



        } while (!opcion.equals("5"));
        sc.close();

    }
}

