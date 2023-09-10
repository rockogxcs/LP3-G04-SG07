import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContactos {
    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("   Agenda de Contactos");
            System.out.println("===========================");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contactos");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Mostrar contactos");
            System.out.println("7. Salir");
            System.out.print("Elije una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:     // AÑADIR CONTACTO
                    System.out.print("\nIngrese el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Ingrese la dirección: ");
                    String direccion = sc.nextLine();

                    Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
                    agenda.add(nuevoContacto);
                    System.out.println("Contacto añadido.\n");
                    break;
                case 2:     // BUSCAR CONTACTO
                    System.out.print("\nBuscar por nombre: ");
                    String nombreBuscar = sc.nextLine();
                    boolean encontrado = false;

                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println(contacto);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:     //MODIFICAR CONTACTO
                    System.out.print("\nBuscar por nombre: ");
                    String nombreModificar = sc.nextLine();
                    boolean encontradoModificar = false;

                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.print("Ingrese el nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            System.out.print("Ingrese el nuevo teléfono: ");
                            String nuevoTelefono = sc.nextLine();
                            System.out.print("Ingrese la nueva dirección: ");
                            String nuevaDireccion = sc.nextLine();

                            contacto.setNombre(nuevoNombre);
                            contacto.setTelefono(nuevoTelefono);
                            contacto.setDireccion(nuevaDireccion);

                            System.out.println("Contacto modificado.");
                            encontradoModificar = true;
                            break;
                        }
                    }

                    if (!encontradoModificar) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 4:     // BORRAR CONTACTOS
                    agenda.clear();
                    System.out.println("\nTodos los contactos han sido borrados.");
                    break;

                case 5:     // ELIMINAR CONTACTOS
                    System.out.print("Buscar por nombre: ");
                    String nombreBorrar = sc.nextLine();
                    boolean encontradoElim = false;

                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBorrar)) {
                            agenda.remove(contacto);
                            System.out.println("Contacto eliminado.");
                            encontradoElim = true;
                            break;
                        }
                    }
                    if (!encontradoElim) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                    
                case 6:     // MOSTRAR CONTACTOS
                    if (agenda.isEmpty()) {
                        System.out.println("\nLa agenda de contactos está vacía.");
                    } else {
                        System.out.println("\nLista de contactos:");
                        for (Contacto contacto : agenda) {
                            System.out.println(contacto);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Fin del programa...");
                    salir = true;
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Debe seleccionar una opción válida.");
                    break;
            }
        } while(!salir);
    }
}
