package edu.cibertec.capitulo8;

public class Plato {

    private String nombre;
    private int duracion;
    private int contadorSegundos;

    public Plato(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Plato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getContadorSegundos() {
        return contadorSegundos;
    }

    public void setContadorSegundos(int contadorSegundos) {
        this.contadorSegundos = contadorSegundos;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombre=" + nombre + ", duracion=" + duracion + ", contadorSegundos=" + contadorSegundos + '}';
    }
   
}
