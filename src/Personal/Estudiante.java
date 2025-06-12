package Personal;

public class Estudiante extends Persona {
    private String tieneCertificado;

    public Estudiante(String nombre, String cedula, int edad, String tieneCertificado) {
        super(nombre, cedula, edad);
        this.tieneCertificado = tieneCertificado;
    }

    public String getTieneCertificado() {
        return tieneCertificado;
    }

    public void setTieneCertificado(String tieneCertificado) {
        this.tieneCertificado = tieneCertificado;
    }

    public boolean validarEdad() {
        return getEdad() >= 13 && getEdad() <= 60;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("¿Tiene certificado?: " + tieneCertificado);
    }
}
