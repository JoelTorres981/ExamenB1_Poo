package Personal;

public class Docente extends Persona{
    private int experiencia;
    private String especializacion;

    public Docente(String nombre, String cedula, int edad, int experiencia, String especializacion) {
        super(nombre, cedula, edad);
        this.experiencia = experiencia;
        this.especializacion = especializacion;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    void mostrarDatos() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Cedula: "+ getCedula());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Años de experiencia: "+ experiencia);
        System.out.println("Especialidad: "+ especializacion);
    }
}
