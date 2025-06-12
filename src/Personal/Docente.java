package Personal;

public class Docente extends Persona {
    private int experiencia;
    private String especializacion;

    public Docente(String nombre, String cedula, int edad, int experiencia, String especializacion) {
        super(nombre, cedula, edad);
        this.experiencia = experiencia;
        this.especializacion = especializacion;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Años de experiencia: " + experiencia);
        System.out.println("Especialización: " + especializacion);
    }
}
