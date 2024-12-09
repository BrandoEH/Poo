package poo.com.pe.Model;

import java.util.Date;

public class Pedido {
    private int id;
    private Usuario usuario;
    private Carrito carrito;
    private Date fecha;
    private String estado;

    // Constructor
    public Pedido(int id, Usuario usuario, Carrito carrito) {
        this.id = id;
        this.usuario = usuario;
        this.carrito = carrito;
        this.fecha = new Date();
        this.estado = "Pendiente";
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para cambiar el estado del pedido
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Mostrar resumen del pedido
    public void mostrarPedido() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Fecha: " + fecha.toString());
        carrito.mostrarCarrito();
        System.out.println("Estado: " + estado);
    }
}

