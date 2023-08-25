import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = sc.nextLine();

        System.out.print("¿Desea ingresar la cantidad inicial? (si/no): ");
        String cantidadOpc = sc.nextLine().toLowerCase();

        CuentaBanco cuenta;

        if (cantidadOpc.equals("si") || cantidadOpc.equals("Si") || cantidadOpc.equals("SI")) {
            System.out.print("Ingrese la cantidad inicial: S/.");
            double cantidadInicial = sc.nextDouble();
            cuenta = new CuentaBanco(titular, cantidadInicial);
        } else {
            cuenta = new CuentaBanco(titular);
        }
        System.out.println("\nInformación de la cuenta creada:");
        System.out.println(cuenta);

        int opcion;
        do {
            System.out.println("\n=======================");
            System.out.println("   Bienvenido al BCP");
            System.out.println("=======================");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:     // Ingresar
                    System.out.print("Ingrese la cantidad a ingresar: S/.");
                    double cantidadIngresar = sc.nextDouble();
                    cuenta.ingresar(cantidadIngresar);
                    break;
                case 2:     // Retirar
                    System.out.print("Ingrese la cantidad a retirar: S/.");
                    double cantidadRetirar = sc.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:     // Mostrar
                    System.out.println("Saldo actual: S/." + cuenta.getCantidad());
                    System.out.println("\nPresione cualquier tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}