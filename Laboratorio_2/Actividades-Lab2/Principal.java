import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
  
        Perro fido = new Perro("chihuahua", "marron", 37, 1, 0.5);
        Perro pelusa = new Perro("pequines", "blanco", 37, 1, 0.5);
        Scanner sc = new Scanner(System.in);

        // Diagnostico para Fido
        System.out.print("Ingrese el nuevo peso para el perro Fido: ");
        double nuevoPesoFido = sc.nextDouble();
        fido.setPeso(nuevoPesoFido);
        
        System.out.print("Ingrese la nueva edad para el perro Fido: ");
        int nuevaEdadFido = sc.nextInt();
        fido.setEdad(nuevaEdadFido);
        
        System.out.print("Ingrese la nueva temperatura para el perro Fido: ");
        double nuevatempFido = sc.nextDouble();
        fido.setTemp(nuevatempFido);
        
        Diagnostico d1 = new Diagnostico();
        d1.aptoVacunaA(fido);
        System.out.print("\n");
        
        // Diagnostico para Pelusa
        
        System.out.print("Ingrese el nuevo peso para el perro Pelusa: ");
        double nuevoPesoPelusa = sc.nextDouble();
        pelusa.peso = nuevoPesoPelusa;
        
        System.out.print("Ingrese la nueva edad para el perro Pelusa: ");
        int nuevaEdadPelusa = sc.nextInt();
        pelusa.setEdad(nuevaEdadPelusa);
        
        System.out.print("Ingrese la nueva temperatura para el perro Pelusa: ");
        double nuevaTempPelusa = sc.nextDouble();
        pelusa.setTemp(nuevaTempPelusa);
        
        Diagnostico d2 = new Diagnostico();
        d1.aptoVacunaB(pelusa);
    }
}
