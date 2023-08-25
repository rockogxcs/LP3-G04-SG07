import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
  
        Perro fido = new Perro("chihuahua", "marron", 37, 1, 0.5);
        Perro pelusa = new Perro("pequines", "blanco", 37, 1, 0.5);
        Scanner sc = new Scanner(System.in);

        System.out.print(fido);
	System.out.print("\n");
        System.out.print(pelusa);

	fido.increEdad(2);
	pelusa.increEdad(5);

        System.out.print("\n\n");
	System.out.print(fido);
	System.out.print("\n");
        System.out.print(pelusa);

    }
}
