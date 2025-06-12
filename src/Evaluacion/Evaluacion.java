package Evaluacion;

public class Evaluacion {
    private double resultado;

    public Evaluacion(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public boolean validarNota() {
        return resultado >= 0 && resultado <= 10;
    }
}
