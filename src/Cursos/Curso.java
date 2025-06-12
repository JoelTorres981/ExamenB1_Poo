package Cursos;

import Personal.Docente;

public class Curso {
    private int duracion;
    private String nombre;
    private double precioBase;
    private Docente docente;

    public Curso(int duracion, String nombre, double precioBase, Docente docente) {
        this.duracion = duracion;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.docente = docente;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void mostrarResumen() {
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Duración (semanas): " + duracion);
        System.out.println("Precio: " + precioBase);
        if (docente != null) {
            System.out.println("Docente: " + docente.getNombre());
        } else {
            System.out.println("Docente: No asignado");
        }
    }

    public void asignarDocente(Docente docente) {
        this.docente = docente;
    }
}
