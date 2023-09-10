import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        
        //Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];
        
        //Variables utilizadas
        boolean salir = false;
        int opcion, fila;
        
        //Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean rellenado = false;
        
        //Menu
        do {
            //Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    //Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        //Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while(!salir);
        
        System.out.println("FIN");
    }
    
    /**
    * Rellena la matriz con valores insertados por el usuario
    *
    * @param sn
    * @param matriz
    */
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }
    
    /**
    * Suma los valores de una determinada fila
    *
    * @param matriz
    * @param fila
    * @return
    */
    
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }
}