package Lab10.Actividades;

public class Ejercicio4 {
    public static void main(String[] args) {
        Producto[] arrayProductos = {new Producto(123, "Producto 1", 5.20), new Producto(9876, "Producto 2", 6.30), new  Producto(1298, "Producto 3", 13.65)};
        Persona[] arrayPersonas = {new Persona(123456, "Pedro", "Av. Dolores"), new Persona(987656, "Maria","Av. Ejercito"), new Persona(123987,"Juan","Av. Progreso")};
        Estudiante[] arrayEstudiantes = {new Estudiante("Ing Sistemas", 12345, "Esteban", "Av. Venezuela"), new Estudiante("Ing Ambiental", 98763, "Daniel", "Av. Peru"), new Estudiante("Medicina", 123987, "Ana", "Av Brazil")};

        int posProducto = buscarElemento(arrayProductos, new Producto(1298, "", 0.0));
        System.out.println("Posición del Producto: " + posProducto);

        int posPersona = buscarElemento(arrayPersonas, new Persona(0, "Maria", ""));
        System.out.println("Posicion de Persona: " + posPersona);

        int posEstudiante = buscarElemento(arrayEstudiantes, new Estudiante("Ing Ambiental", 0, "Esteban", ""));
        System.out.println("Posicion de Estudiante por su nombre y carrera: " + posEstudiante);
    }

    public static <T> int buscarElemento(T[] arrayInput, T element){
        for (int i = 0; i < arrayInput.length; i++){
            if (element.equals((arrayInput[i]))){
                return i;
            }
        }
        return -1;
    }
}
