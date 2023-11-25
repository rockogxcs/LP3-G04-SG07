package Lab10.Actividades;


public class Estudiante extends Persona {
    String carrera;

    public Estudiante(String carrera_, int dni, String nombres, String direccion){
        super(dni, nombres, direccion);
        this.carrera = carrera_;
    }

    public void showInfo(){
        System.out.println("Nombre" + nombres);
        System.out.println("DNI: "+ dni);
        System.out.println("Carrera: " + carrera);
        System.out.println("Direccion: " + direccion);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) 
            return true;
        if(obj == null || getClass() != obj.getClass()) 
            return false;
        Estudiante estudiante = (Estudiante) obj;
        return carrera.equals(estudiante.carrera);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera='" + carrera + '\'' + ", dni=" + dni + ", nombres='" + nombres + '\'' + ", direccion='" + direccion + '\'' + '}';
    }
}


