import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la coordenada X del rectángulo: ");
        int x = sc.nextInt();
        
        System.out.print("Ingrese la coordenada Y del rectángulo: ");
        int y = sc.nextInt();
        
        Rectangulo r1 = new Rectangulo(new Coordenada(), new Coordenada(x, y));
        System.out.println("\n" + r1);
        System.out.println("Area: " + Manejador.area(r1));
        System.out.println("Perimetro: " + Manejador.perimetro(r1));
        
        System.out.print("¿Cuantas puntos desea mover el rectángulo en el eje X?: ");
        int puntosX = sc.nextInt();

        Manejador.moverX(r1, puntosX);
        
        System.out.print("¿Cuantas puntos desea mover el rectángulo en el eje Y?: ");
        int puntosY = sc.nextInt();
        
        Manejador.moverY(r1, puntosY);
        System.out.println("\nSe realizaron los cambios: ");
        System.out.println(r1);
    }
}