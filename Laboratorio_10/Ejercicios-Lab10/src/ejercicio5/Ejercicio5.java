package Lab10.Actividades;

public class Ejercicio5 {
    public static <T> int buscarElemento(T[] arrayInput, T element){
        for (int i = 0; i < arrayInput.length; i++) {
            if (element.equals(arrayInput[i])) {
                return i;  
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {1,2,3,4,5};
        Double[] arrayDobule = {1.2, 1.3, 1.4, 1.5};

        int posInt = buscarElemento(arrayInt, 3);
        System.out.println("Posicion enteros: " + posInt);

        int posDouble = buscarElemento(arrayDobule, 1.4);
        System.out.println("Posicion Double: " + posDouble);

    }
}
