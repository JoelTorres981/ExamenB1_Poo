package Cursos;
import Personal.*;

public class Curso {
    private int duracion;
    private String nombre;
    private double precioBase;
    Docente docente;

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

    public void mostrarResumen(){
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Duracion (semanas)" + duracion);
        System.out.println("Precio: " + precioBase);
        System.out.println("Docente" + docente.getNombre());
    }

    public void asignarDocente(Docente docente){

    }
}
