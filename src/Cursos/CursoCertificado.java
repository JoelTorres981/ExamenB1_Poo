package Cursos;

import Personal.Docente;

public class CursoCertificado extends CursoRegular {
    private double precioAdicional;

    public CursoCertificado(int duracion, String nombre, double precioBase, Docente docente, double precioAdicional) {
        super(duracion, nombre, precioBase, docente);
        this.precioAdicional = precioAdicional;
    }

    public double precioFinal() {
        return getPrecioBase() + precioAdicional * 0.25;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Recargo adicional (25%): " + precioAdicional * 0.25);
        System.out.println("Precio final: " + precioFinal());
    }
}
