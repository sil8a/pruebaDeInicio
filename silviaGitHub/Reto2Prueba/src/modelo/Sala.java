package modelo;

import java.util.ArrayList;

public class Sala {

    private int idSala;
    private String nombre;
    private ArrayList<Sesion> sesiones;

    public Sala(int idSala, String nombre) {
        this.idSala = idSala;
        this.nombre = nombre;
        this.sesiones = new ArrayList<>();
    }

    public Sala() {
        this.sesiones = new ArrayList<>();
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sesion> getSesiones() {
        return sesiones;
    }

    public void addSesion(Sesion sesion) {
        this.sesiones.add(sesion);
    }

    @Override
    public String toString() {
        return "Sala [id=" + idSala + ", nombre=" + nombre + 
               ", sesiones=" + sesiones.size() + "]";
    }
}
