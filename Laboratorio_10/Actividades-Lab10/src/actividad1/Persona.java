package actividad1;

public class Persona {
    private String dni;
    private String nombres;
    private String direccion;

    public Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "dni:" + dni + ", nombres:" + nombres + ", direccion:" + direccion + "\n";
    }
}
