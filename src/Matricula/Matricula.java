package Matricula;
import Evaluacion.*;
import Personal.*;
import Cursos.*;

public class Matricula {
    private String horario;
    Curso curso;
    Estudiante estudiante;
    Docente docente;
    Evaluacion evaluacion;

    public Matricula(String horario, Curso curso, Estudiante estudiante, Docente docente, Evaluacion evaluacion) {
        this.horario = horario;
        this.curso = curso;
        this.estudiante = estudiante;
        this.docente = docente;
    }

    public boolean registrarEvaluacion(double nota){
        if (nota < 0 || nota > 10){
            return false;
        }
        this.evaluacion = new Evaluacion(nota);
        return true;
    }

    public void mostrarDetalle() {
        System.out.println("Nombre del curso: " + curso.getNombre());
        System.out.println("Estudiante: "+estudiante.getNombre());
        System.out.println("Docente: "+docente.getNombre());
        System.out.println();
    }
}
