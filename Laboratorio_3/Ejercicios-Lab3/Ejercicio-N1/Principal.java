import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Rectangulo 1
        System.out.print("Ingrese la coordenada X del rectángulo 1: ");
        int x = sc.nextInt();
        
        System.out.print("Ingrese la coordenada Y del rectángulo 1: ");
        int y = sc.nextInt();
        
        Rectangulo r1 = new Rectangulo(new Coordenada(), new Coordenada(x, y));
        System.out.println("\n" + r1);
        System.out.println("Area: " + Manejador.area(r1));
        System.out.println("Perimetro: " + Manejador.perimetro(r1));
        
        System.out.print("¿Cuantas puntos desea mover el rectángulo 1 en el eje X?: ");
        int puntosX = sc.nextInt();

        Manejador.moverX(r1, puntosX);
        
        System.out.print("¿Cuantas puntos desea mover el rectángulo 1 en el eje Y?: ");
        int puntosY = sc.nextInt();
        
        Manejador.moverY(r1, puntosY);
        System.out.println("\nSe realizaron los cambios: ");
        System.out.println(r1);

        // Rectangulo 2
        System.out.print("Ingrese la coordenada X del rectángulo 2: ");
        x = sc.nextInt();
        
        System.out.print("Ingrese la coordenada Y del rectángulo 2: ");
        y = sc.nextInt();
        
        Rectangulo r2 = new Rectangulo(new Coordenada(), new Coordenada(x, y));
        System.out.println("\n" + r2);
        System.out.println("Area: " + Manejador.area(r2));
        System.out.println("Perimetro: " + Manejador.perimetro(r2));
        
        // Rectangulo 3
        System.out.print("Ingrese la coordenada X del rectángulo 3: ");
        x = sc.nextInt();
        
        System.out.print("Ingrese la coordenada Y del rectángulo 3: ");
        y = sc.nextInt();
        
        Rectangulo r3 = new Rectangulo(new Coordenada(), new Coordenada(x, y));
        System.out.println("\n" + r3);
        System.out.println("Area: " + Manejador.area(r3));
        System.out.println("Perimetro: " + Manejador.perimetro(r3));

        // Rectangulo 4
        System.out.print("Ingrese la coordenada X del rectángulo 4: ");
        x = sc.nextInt();
        
        System.out.print("Ingrese la coordenada Y del rectángulo 4: ");
        y = sc.nextInt();
        
        Rectangulo r4 = new Rectangulo(new Coordenada(), new Coordenada(x, y));
        System.out.println("\n" + r4);
        System.out.println("Area: " + Manejador.area(r4));
        System.out.println("Perimetro: " + Manejador.perimetro(r4));
    }
}