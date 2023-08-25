import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        
        String genero;
        do {
            System.out.print("Ingrese su género: ");
            genero = sc.nextLine().toLowerCase();
        } while (!genero.equals("masculino") && !genero.equals("femenino"));
        
        int dDate, mDate, yDate;
        do {
            System.out.print("Ingrese el dia de nacimiento (dd): ");
            dDate = sc.nextInt();
        } while(dDate > 30 || dDate <= 0);

        do {
            System.out.print("Ingrese el mes de nacimiento (mm): ");
            mDate = sc.nextInt();
        } while(mDate > 12 || mDate <= 0);

        do {
            System.out.print("Ingrese el año de nacimiento (aaaa): ");
            yDate = sc.nextInt();
        } while(yDate > 2023 || yDate < 1900);

        System.out.print("Ingrese su altura (en cm): ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese su peso (en kg): ");
        double peso = sc.nextDouble();

        perfilMedico persona1 = new perfilMedico(nombre, apellido, genero, dDate, mDate, yDate, altura, peso);
        persona1.mostrarInfo();
    }
}