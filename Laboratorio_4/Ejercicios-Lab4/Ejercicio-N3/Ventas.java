import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        double[][] ventas = new double[5][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la información de las ventas del último mes:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
            for (int j = 0; j < 4; j++) {
                System.out.printf("Ingrese las ventas del vendedor %d para el producto %d: $", j+1, i+1);
                ventas[i][j] = sc.nextDouble();
            }
        }

        double[] totalPorProducto = new double[5];
        double[] totalPorVendedor = new double[4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                totalPorProducto[i] += ventas[i][j];
                totalPorVendedor[j] += ventas[i][j];
            }
        }

        System.out.println("\nResumen de ventas:");
        System.out.println("        \tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Producto %d\t", i+1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f\t\t", ventas[i][j]);
            }
            System.out.printf("%.2f\n", totalPorProducto[i]);
        }

        System.out.print("Total");
        for (double total : totalPorVendedor) {
            System.out.printf("\t\t%.2f", total);
        }
    }
}
