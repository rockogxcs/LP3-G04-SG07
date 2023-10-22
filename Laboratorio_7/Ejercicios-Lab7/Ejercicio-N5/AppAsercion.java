import java.util.Scanner;

public class AppAsercion {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números que deseas agregar a la lista: ");
        int cantidadNumeros = sc.nextInt();

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numeroAgregar = sc.nextInt();
            lista.agregar(numeroAgregar);
        }

        System.out.print("Ingresa un número para eliminar de la lista: ");
        int numeroEliminar = sc.nextInt();
        lista.eliminar(numeroEliminar);

        System.out.println("Los elementos de la lista son: ");
        lista.mostrar();
    }
}
