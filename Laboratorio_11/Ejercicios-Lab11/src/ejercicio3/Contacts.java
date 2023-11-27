package Lab11.Ejercicios;

import java.util.Scanner;

public class Contacts {
    public Scanner scan = new Scanner(System.in);
    public Dictionary<String, String> contactDictionary;

    public Contacts(){
        contactDictionary = new Dictionary<>();
    }

    public void añadirContacto(){
        System.out.println("Ingrese el Nro de DNI: ");
        String dni = scan.nextLine();
        System.out.println("Ingrese el nombre: ");
        String datosConocidos = scan.nextLine();

        contactDictionary.add(dni, datosConocidos );
        System.out.println("Contacto agregado.");
    }

    public void eliminarContacto(){
        System.out.println("Ingrese el DNi del contacto que desea eliminar: ");
        String dniEliminar = scan.nextLine();

        if(contactDictionary.delete(dniEliminar)){
            System.out.println("Contacto eliminado.");
        }
        else {
            System.out.println("No se pudo encontrar el Nro de DNI propocionado.");
        }
    }
    public void buscarContacto(){
        System.out.println("ingrese el DNI del contacto a buscar.");
        String dniBuscar = scan.nextLine();

        String datos = contactDictionary.getValue(dniBuscar);
        System.out.println("Datos encontrados: " + datos);
    }

    public void listaContactos(){
        System.out.println("Lista de contactos: \n" + contactDictionary.toString());
    }
}
