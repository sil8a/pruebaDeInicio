package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Compra {

    private int idCompra;
    private ArrayList<Entrada> entradas;
    private Cliente cliente;
    private LocalDateTime fechaHora;
    private double precio;
    private double descuento;

    public Compra(int idCompra, Cliente cliente, LocalDateTime fechaHora, 
                  double precio, double descuento) {
        this.idCompra = idCompra;
        this.cliente = cliente;
        this.fechaHora = fechaHora;
        this.precio = precio;
        this.descuento = descuento;
        this.entradas = new ArrayList<>();
    }

    public Compra() {
        this.entradas = new ArrayList<>();
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void addEntrada(Entrada entrada) {
        this.entradas.add(entrada);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Compra [id=" + idCompra + ", cliente=" + cliente.getNombre() + 
               ", entradas=" + entradas.size() + ", precio=" + precio + "]";
    }
}
