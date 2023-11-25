package actividad1;

public class AppAct1 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombres = "Luis Torres";
        persona.direccion = "Av. Los Incas 104";
        persona.telefono = "987654321";

        Goodies goodies = new Goodies();
        goodies.id = 1;
        goodies.description = "Chocolate";
        goodies.price = 10.5f;

        Procedencia procedencia = new Procedencia();
        procedencia.departamento = "Lima";
        procedencia.provincia = "Lima";

        Estudiante estudiante = new Estudiante();
        estudiante.nombres = "Karla Sanchez";
        estudiante.especialidad = "Ingenieria de Sistemas";
        estudiante.procedencia = procedencia;

        System.out.println("Persona contiene el nombre 'Luis Torres': " + persona.contiene("Luis Torres"));
        System.out.println("Goodies contiene el ID 1: " + goodies.contiene(16));
        System.out.println("Estudiante contiene el nombre 'Karla Sanchez' y de procedencia 'Lima': " + estudiante.contiene("Karla Sanchez", "Lima"));
    }
}
