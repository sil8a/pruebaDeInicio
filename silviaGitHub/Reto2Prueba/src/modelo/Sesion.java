package modelo;

import java.time.LocalDateTime;

public class Sesion {

    private int idSesion;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private Sala sala;
    private double precio;
    private Pelicula pelicula;
    private int espectadores;

    public Sesion(int idSesion, LocalDateTime inicio, LocalDateTime fin, 
                  Sala sala, double precio, Pelicula pelicula, int espectadores) {
        this.idSesion = idSesion;
        this.inicio = inicio;
        this.fin = fin;
        this.sala = sala;
        this.precio = precio;
        this.pelicula = pelicula;
        this.espectadores = espectadores;
    }

    public Sesion() {}

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "Sesion [id=" + idSesion + ", inicio=" + inicio + 
               ", fin=" + fin + ", sala=" + sala.getNombre() + 
               ", pelicula=" + pelicula.getGenero() + "]";
    }
}
