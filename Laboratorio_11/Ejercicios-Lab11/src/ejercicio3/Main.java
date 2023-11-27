package Lab11.Ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 2
        
        /*
        Dictionary<String, Integer> diccionario = new Dictionary<>();

        diccionario.add("ab", 12);
        diccionario.add("bd", 23);

        System.out.println(diccionario);
        diccionario.delete("a");

        System.out.println(diccionario);
         
        */

        //Ejercicio 3
        Contacts contacts1 = new Contacts();
        Scanner scan1 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu: \n1. Agregar contacto\n2. Eliminar contacto\n3. Buscar Contacto\n4.Mostrar lista de Contactos\n99. Salir");
            System.out.print("-->");
            opcion = scan1.nextInt();
            
            switch (opcion) {
                case 1:
                    contacts1.añadirContacto();
                    break;
                case 2:
                    contacts1.eliminarContacto();
                    break;
                case 3:
                    contacts1.buscarContacto();
                    break;
                case 4:
                    contacts1.listaContactos();
                    break;
                case 99:
                    break;
                default:
                    System.out.println("Opcion no valida,");
            }
        }

        while(opcion != 99);
    }
}
