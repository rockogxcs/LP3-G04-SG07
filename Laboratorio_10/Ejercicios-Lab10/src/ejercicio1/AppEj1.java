package ejercicio1;

public class AppEj1 {
    public static void main(String[] args) throws Exception{
        String[] stringArray = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        
        System.out.printf("Array de cadenas contiene:%n");
        imprimirArray(stringArray);
    }

    public static void imprimirArray(String[] inputArray) {
        for(int i = 0; i < inputArray.length; i++) {
            System.out.printf("%-10s", inputArray[i]);
            if ((i + 1) % 4 == 0) System.out.println();
        }
        System.out.println();
    }
}
