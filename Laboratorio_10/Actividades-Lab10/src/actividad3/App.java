package actividad3;

public class App {
    public static void main(String[] args) throws Exception{
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray, 0, 1);
        
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray, 1, 4);
        
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray, 2, 3);
        
    }
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray)
            System.out.printf("%s ",elemento);
        System.out.println();
    }
    
    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= inputArray.length || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Los límites son inválidos.");
        }
        for(int i = limiteInferior; i <= limiteSuperior; i++)
            System.out.printf("%s ", inputArray[i]);
        System.out.println();
    }
}