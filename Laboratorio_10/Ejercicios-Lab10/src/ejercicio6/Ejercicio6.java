package Lab10.Actividades;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio6 {
    public static <T> T[] copyArray(T[] arrayinput1, T[] arrayInput2){
        Set<T> set = new HashSet<>();

        for(T elementos : arrayinput1) {
            set.add(elementos);
        }

        for(T elementos : arrayInput2) {
            set.add(elementos);
        }

        return set.toArray(Arrays.copyOf(arrayinput1, 0));
    }
    public static void main(String[] args) {
        String[] arrayString1 = {"a", "b", "C"};
        String[] arrayString2 = {"d", "e", "f"};

        Integer[] arrayInt1 = {1, 2, 3, 4};
        Integer[] arrayInt2 = {4, 5, 6, 7};

        Persona[] arrayPersona1 = {new Persona(1234, "Pedro", "Av.Dolores"), new Persona(983, "Estaban", "Av.Ejercito")};
        Persona[] arrayPersona2 = {new Persona(9812, "Juan", "Av. Brazil")};

        Producto[] arrayProducto1 = {new Producto(1, "Producto1", 10.2), new Producto(1, "Producto 2", 9.32)};
        Producto[] arrayProdcuto2 = {new Producto(3, "Producto 3", 5.2), new Producto(4, "Producto 4", 4.52)};
    
        String[] copyString = copyArray(arrayString1, arrayString2);
        System.out.println(Arrays.toString(copyString));
        
        Integer[] copyInteger = copyArray(arrayInt1, arrayInt2);
        System.out.println(Arrays.toString(copyInteger));

        Persona[] copyPersona = copyArray(arrayPersona1,arrayPersona2);
        System.out.println(Arrays.toString(copyPersona));

        Producto[] copyProducto = copyArray(arrayProducto1, arrayProdcuto2);
        System.out.println(Arrays.toString(copyProducto));
    }
}
