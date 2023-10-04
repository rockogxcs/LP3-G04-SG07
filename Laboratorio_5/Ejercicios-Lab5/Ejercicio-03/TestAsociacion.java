import java.util.Scanner;

public class TestAsociacion {
    public static void main(String[] args) {
        Banco banco = new Banco("BCP", 100);
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido al banco " + banco.getNombre());
            System.out.println("1. Agregar cliente");
            System.out.println("2. Dar de baja a un cliente");
            System.out.println("3. Mostrar clientes por tipo");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:     // AGREGAR CLIENTE
                    System.out.print("\nIngrese el ID del cliente: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el apellido del cliente: ");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese el número de cuenta del cliente: ");
                    int numeroCuenta = sc.nextInt();
                    System.out.print("Ingrese el saldo inicial del cliente: S/.");
                    double saldoInicial = sc.nextDouble();
                    System.out.print("Ingrese el tipo de cliente (C, B, E): ");
                    char tipo = sc.next().charAt(0);
                    
                    Cuenta cuenta = new Cuenta(numeroCuenta, saldoInicial);
                    Persona persona = new Persona(id, nombre, apellido, cuenta, tipo);
                    banco.agregarCliente(persona);
                    System.out.print("\n");
                    break;
                    
                case 2:     // DAR DE BAJA AL CLIENTE
                    System.out.print("\nIngrese el ID del cliente a eliminar: ");
                    int idEliminar = sc.nextInt();
                    Persona personaEliminar = new Persona(idEliminar, "", "", null, 'C');
                    Persona personaEliminada = banco.darBajaCliente(personaEliminar);
                    if (personaEliminada != null) {
                        System.out.println("Cliente eliminado: " + personaEliminada.toString());
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    System.out.print("\n");
                    break;
                    
                case 3:     // MOSTRAR CLIENTES POR TIPO
                    System.out.print("\nIngrese el tipo de cliente (C, B, E): ");
                    char tipoListar = sc.next().charAt(0);
                    System.out.print("\n");
                    banco.clientesTipo(tipoListar);
                    System.out.print("\n");
                    break;
                    
                case 4:     // SALIR
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
        sc.close();
    }
}
