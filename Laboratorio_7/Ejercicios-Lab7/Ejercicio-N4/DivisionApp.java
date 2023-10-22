import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de divisiones (N): ");
        int N = sc.nextInt();
        System.out.print("Ingrese el tamaño del arreglo (M): ");
        int M = sc.nextInt();

        double[] cocientes = new double[M];

        for (int i = 0; i < N; i++) {
            try {
                System.out.print("\nIngrese el dividendo: ");
                double dividendo = sc.nextDouble();
                
                System.out.print("Ingrese el divisor: ");
                double divisor = sc.nextDouble();

                if (divisor == 0) {
                    throw new ArithmeticException();
                }

                System.out.print("Ingrese la posición del arreglo (P): ");
                int P = sc.nextInt();
                
                if (P < 0 || P >= M) {
                    System.out.println("ERROR: Posición fuera del límite del arreglo. Intente de nuevo...");
                    i--;
                    continue;
                }
                
                cocientes[P] = dividendo / divisor;
            }
	        catch(ArithmeticException arithmeticE){
	            System.out.println("ERROR: No se puede dividir por cero. Intente de nuevo...\n");
	            sc.nextLine();
	            i--;
	        }
            catch (ArrayIndexOutOfBoundsException arrayE) {
                System.out.println("ERROR: Posición fuera del límite del arreglo. Intente de nuevo...");
                sc.nextLine();
                i--;
            }   
            catch (InputMismatchException e) {
                System.out.println("ERROR: Debe ingresar un número. Intente de nuevo...");
                sc.nextLine();
                i--;
            }
            catch(NegativeArraySizeException negativeE){
                System.out.println("ERROR: Debe ingresar un número positivo. Intente de nuevo...");
                sc.nextLine();
                i--;
            }
        }

        System.out.println("\nArreglo de cocientes:");
        for (double c : cocientes) {
            System.out.println(c);
        }
    }
}
