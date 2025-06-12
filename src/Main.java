import Cursos.*;
import Evaluacion.*;
import Matricula.*;
import Personal.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Estudiante> estudiantes = new ArrayList<>();
    static List<Docente> docentes = new ArrayList<>();
    static List<Curso> cursos = new ArrayList<>();
    static List<Matricula> matriculas = new ArrayList<>();

    public static void main(String[] args) {
        inicializarDatos();
        int opcion;
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Inscribirse a un Curso");
            System.out.println("3. Mostrar Matrículas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> registrarEstudiante();
                case 2 -> inscribirCurso();
                case 3 -> mostrarMatriculas();
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }

    public static void inicializarDatos() {
        Docente d1 = new Docente("Carlos", "0102030405", 40, 10, "Matemática");
        docentes.add(d1);
        Curso c1 = new CursoRegular(6, "Matemáticas I", 100.0, d1);
        cursos.add(c1);

        Docente d2 = new Docente("Andrea", "0504030201", 35, 8, "Programación");
        docentes.add(d2);
        Curso c2 = new CursoCertificado(8, "Java Avanzado", 200.0, d2, 50.0);
        cursos.add(c2);
    }

    public static void registrarEstudiante() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cedula: ");
        String cedula = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tiene certificado (si/no): ");
        String tieneCertificado = scanner.nextLine();

        Estudiante e = new Estudiante(nombre, cedula, edad, tieneCertificado);
        if (!e.validarEdad()) {
            System.out.println("Edad no válida para inscribirse.");
            return;
        }
        estudiantes.add(e);
        System.out.println("Estudiante registrado con éxito.");
    }

    public static void inscribirCurso() {
        if (cursos.isEmpty() || docentes.isEmpty()) {
            System.out.println("No hay cursos o docentes disponibles para inscribirse.");
            return;
        }

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("Seleccione un estudiante:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i).getNombre());
        }
        int estIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (estIndex < 0 || estIndex >= estudiantes.size()) {
            System.out.println("Estudiante inválido.");
            return;
        }
        Estudiante estudiante = estudiantes.get(estIndex);

        System.out.println("Seleccione un curso:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + ". " + cursos.get(i).getNombre());
        }
        int cursoIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (cursoIndex < 0 || cursoIndex >= cursos.size()) {
            System.out.println("Curso inválido.");
            return;
        }
        Curso curso = cursos.get(cursoIndex);

        if (curso.getNombre() == null || curso.getPrecioBase() <= 0 || curso.getDocente() == null) {
            System.out.println("Curso no válido o sin docente asignado.");
            return;
        }

        System.out.print("Ingrese horario del curso: ");
        String horario = scanner.nextLine();

        Matricula m = new Matricula(horario, curso, estudiante, curso.getDocente(), null);

        System.out.print("¿Desea registrar nota? (si/no): ");
        String resp = scanner.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            System.out.print("Ingrese nota (0-10): ");
            double nota = scanner.nextDouble();
            scanner.nextLine();
            if (!m.registrarEvaluacion(nota)) {
                System.out.println("Nota inválida. No se registró evaluación.");
            }
        }

        matriculas.add(m);
        System.out.println("Inscripción realizada con éxito.");
    }

    public static void mostrarMatriculas() {
        if (matriculas.isEmpty()) {
            System.out.println("No hay matrículas registradas.");
            return;
        }
        for (Matricula m : matriculas) {
            System.out.println("\n--- Matrícula ---");
            m.mostrarDetalle();
            System.out.println("Certificado: " + m.getEstudiante().getTieneCertificado());
            if (m.getEvaluacion() != null) {
                System.out.println("Nota: " + m.getEvaluacion().getResultado());
            } else {
                System.out.println("Nota: No registrada.");
            }
        }
    }
}
