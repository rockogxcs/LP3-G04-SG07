package ejercicio2;

import java.util.Arrays;

public class AppEj2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Antes del intercambio: " + Arrays.toString(intArray));
        intercambiar(intArray, 0, 4);
        System.out.println("Despues del intercambio: " + Arrays.toString(intArray));
    }

    public static <T> void intercambiar(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
