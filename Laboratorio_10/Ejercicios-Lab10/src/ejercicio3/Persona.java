package ejercicio3;

import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        Persona p = (Persona) obj;
        return edad == p.edad && Objects.equals(nombre, p.nombre);
    }
}
