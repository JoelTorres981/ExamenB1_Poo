package Cursos;

import Personal.*;

public class CursoCertificado extends CursoRegular{
    private double precioAdicional;

    public CursoCertificado(int duracion, String nombre, double precioBase, Docente docente, double precioAdicional) {
        super(duracion, nombre, precioBase, docente);
        this.precioAdicional = precioAdicional;
    }

    public double PrecioFinal(){
        double recargo=0.25;
        precioAdicional = precioAdicional + (precioAdicional * recargo);
        return precioAdicional;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Nota Final: "+precioAdicional);
    }
}
