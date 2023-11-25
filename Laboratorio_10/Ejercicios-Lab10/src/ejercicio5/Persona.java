package Lab10.Actividades;

public class Persona {
    int dni;
    String nombres;
    String direccion;

    public Persona(int dni_, String nombres_, String direccion_){
        this.dni = dni_;
        this.nombres = nombres_;
        this.direccion = direccion_;
    }

    public void showInfo(){
        System.out.println("Nombres: " + this.nombres);
        System.out.println("DNI: " + this.dni);
        System.out.println("Direccion: " + direccion);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) 
            return true;
        if(obj == null || getClass() != obj.getClass()) 
            return false;
        Persona persona = (Persona) obj;
        return nombres.equals(persona.nombres);
    }

    @Override
    public String toString() {
        return String.format("Persona{id=%d, nombre='%s', direccion='%s'}", dni, nombres, direccion);
    }
}
