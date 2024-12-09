package poo.com.pe;

import poo.com.pe.Model.Carrito;
import poo.com.pe.Model.Pedido;
import poo.com.pe.Model.Producto;
import poo.com.pe.Model.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario(1, "Juan Pérez", "juan@correo.com", "Calle123");

        // Crear productos
        Producto prod1 = new Producto(1, "Laptop", 1000.00, "Electrónica", 10);
        Producto prod2 = new Producto(2, "Smartphone", 500.00, "Electrónica", 20);

        // Crear un carrito para el usuario
        Carrito carrito = new Carrito(usuario1);

        // Añadir productos al carrito
        carrito.agregarProducto(prod1, 2); // Añadir 2 laptops
        carrito.agregarProducto(prod2, 1); // Añadir 1 smartphone

        // Mostrar el carrito
        carrito.mostrarCarrito();

        // Crear un pedido
        Pedido pedido = new Pedido(1, usuario1, carrito);
        pedido.mostrarPedido();

        // Cambiar el estado del pedido
        pedido.cambiarEstado("Enviado");
        pedido.mostrarPedido();
    }
}
