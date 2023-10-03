import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestComposicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> clientes = new ArrayList<>();

        while (true) {
            System.out.println("1. Añadir cliente");
            System.out.println("2. Ver información de la cuenta");
            System.out.println("3. Depositar");
            System.out.println("4. Retirar");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del cliente: ");
                    int id = sc.nextInt();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el apellido del cliente: ");
                    String apellido = sc.next();
                    System.out.print("¿Desea ingresar el tipo de cliente? (S/N): ");
                    char rpta = sc.next().toUpperCase().charAt(0);
                    char tipo = 'C';

                    if (rpta == 'S') {
                        System.out.print("Ingrese el tipo de cliente (C, B, E): ");
                        tipo = sc.next().toUpperCase().charAt(0);
                    }
                    Persona persona = new Persona(id, nombre, apellido, tipo);
                    clientes.add(persona);
                    break;
                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes registrados.");
                        break;
                    }
                    System.out.println("\n\tLista de clientes: ");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(clientes.get(i).getId() + ". \t" + clientes.get(i).getNombre() + " " + clientes.get(i).getApellido());
                    }
                    System.out.print("\nIngrese el ID del cliente para ver información de la cuenta: ");
                    int clienteId = sc.nextInt();
                    Persona clienteSeleccionado = null;

                    for (Persona cliente : clientes) {
                        if (cliente.getId() == clienteId) {
                            clienteSeleccionado = cliente;
                            break;
                        }
                    }

                    if (clienteSeleccionado == null) {
                        System.out.println("Cliente no encontrado.");
                    } else {
                        System.out.print("\n");
                        System.out.println(clienteSeleccionado.toString());
                        System.out.print("\n");
                    }
                    break;

                case 3:
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes registrados.");
                        break;
                    }
                    System.out.println("\n\tLista de clientes: ");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(clientes.get(i).getId() + ". \t" + clientes.get(i).getNombre() + " " + clientes.get(i).getApellido());
                    }
                    System.out.print("\nIngrese el ID del cliente para depositar: ");
                    clienteId = sc.nextInt();
                    clienteSeleccionado = null;

                    for (Persona cliente : clientes) {
                        if (cliente.getId() == clienteId) {
                            clienteSeleccionado = cliente;
                            break;
                        }
                    }

                    if (clienteSeleccionado == null) {
                        System.out.println("Cliente no encontrado.");
                    } else {
                        System.out.print("Ingrese la cantidad a depositar: ");
                        double deposito = sc.nextDouble();
                        clienteSeleccionado.getCuenta().depositar(deposito);
                        System.out.println("Depósito realizado con éxito.");
                    }
                    break;

                case 4:
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes registrados.");
                        break;
                    }
                    System.out.println("\n\tLista de clientes: ");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(clientes.get(i).getId() + ". " + clientes.get(i).getNombre() + " " + clientes.get(i).getApellido());
                    }
                    System.out.print("\nIngrese el ID del cliente para retirar: ");
                    clienteId = sc.nextInt();
                    clienteSeleccionado = null;

                    for (Persona cliente : clientes) {
                        if (cliente.getId() == clienteId) {
                            clienteSeleccionado = cliente;
                            break;
                        }
                    }

                    if (clienteSeleccionado == null) {
                        System.out.println("Cliente no encontrado.");
                    } else {
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double retiro = sc.nextDouble();
                        clienteSeleccionado.getCuenta().retirar(retiro);
                        System.out.println("Retiro realizado con éxito.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
