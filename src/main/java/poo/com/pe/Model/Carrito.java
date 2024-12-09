package poo.com.pe.Model;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private Usuario usuario;

    // Constructor
    public Carrito(Usuario usuario) {
        this.usuario = usuario;
        this.productos = new ArrayList<>();
    }

    // Método para añadir un producto al carrito
    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            this.productos.add(producto);
            producto.reducirStock(1); // Reducir el stock del producto
        }
    }

    // Método para calcular el total del carrito
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    // Método para mostrar los productos en el carrito
    public void mostrarCarrito() {
        System.out.println("Carrito de Compras de " + usuario.getNombre());
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " | Precio: $" + producto.getPrecio());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}

