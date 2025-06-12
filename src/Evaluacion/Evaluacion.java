package Evaluacion;

public class Evaluacion {
    private double resultado;

    public Evaluacion(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    // Validacion del resultado
    public double validacion(){
        if (resultado > 0 && resultado <= 10){
            return resultado;
        } else {
            System.out.println("Fuera del rango");
            return 0;
        }
    }


}
