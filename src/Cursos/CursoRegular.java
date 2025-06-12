package Cursos;

import Personal.Docente;

public class CursoRegular extends Curso {
    public CursoRegular(int duracion, String nombre, double precioBase, Docente docente) {
        super(duracion, nombre, precioBase, docente);
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
    }
}
