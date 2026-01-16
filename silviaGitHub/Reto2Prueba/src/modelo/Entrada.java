package modelo;
MI trabajooooo
public class Entrada {

    private int idEntrada;
    private Sesion sesion;
    private int numPersonas;
    private double precio;
    private double descuento;

    public Entrada(int idEntrada, Sesion sesion, int numPersonas, double precio, double descuento) {
        this.idEntrada = idEntrada;
        this.sesion = sesion;
        this.numPersonas = numPersonas;
        this.precio = precio;
        this.descuento = descuento;
    }

    public Entrada() {}

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
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
        return "Entrada [id=" + idEntrada + ", personas=" + numPersonas + 
               ", precio=" + precio + ", descuento=" + descuento + "]";
    }
}

