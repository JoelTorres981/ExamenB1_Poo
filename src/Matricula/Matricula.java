package Matricula;

import Cursos.Curso;
import Evaluacion.Evaluacion;
import Personal.Docente;
import Personal.Estudiante;

public class Matricula {
    private String horario;
    Curso curso;
    private Estudiante estudiante;
    private Docente docente;
    Evaluacion evaluacion;

    public Matricula(String horario, Curso curso, Estudiante estudiante, Docente docente, Object o) {
        this.horario = horario;
        this.curso = curso;
        this.estudiante = estudiante;
        this.docente = docente;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Docente getDocente() {
        return docente;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public boolean registrarEvaluacion(double nota) {
        if (nota < 0 || nota > 10) {
            return false;
        }
        this.evaluacion = new Evaluacion(nota);
        return true;
    }

    public void mostrarDetalle() {
        System.out.println("Nombre del curso: " + curso.getNombre());
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Docente: " + docente.getNombre());
        System.out.println("Horario: " + horario);
        if (evaluacion != null) {
            System.out.println("Evaluación: " + evaluacion.getResultado());
        } else {
            System.out.println("Evaluación: No registrada");
        }
    }
}

