public class Manejador {

    public static double area(Rectangulo r) {
        int base = r.getEsquina2().getX() - r.getEsquina1().getX();
        int altura = r.getEsquina2().getY() - r.getEsquina1().getY();
        return base * altura;
    }

    public static double perimetro(Rectangulo r) {
        int base = r.getEsquina2().getX() - r.getEsquina1().getX();
        int altura = r.getEsquina2().getY() - r.getEsquina1().getY();
        return 2 * (base + altura);
    }

    public static void moverX(Rectangulo r, int puntos) {
        Coordenada nuevaEsquina1 = new Coordenada(r.getEsquina1().getX() + puntos, r.getEsquina1().getY());
        Coordenada nuevaEsquina2 = new Coordenada(r.getEsquina2().getX() + puntos, r.getEsquina2().getY());
        r.setEsquina1(nuevaEsquina1);
        r.setEsquina2(nuevaEsquina2);
    }

    public static void moverY(Rectangulo r, int puntos) {
        Coordenada nuevaEsquina1 = new Coordenada(r.getEsquina1().getX(), r.getEsquina1().getY() + puntos);
        Coordenada nuevaEsquina2 = new Coordenada(r.getEsquina2().getX(), r.getEsquina2().getY() + puntos);
        r.setEsquina1(nuevaEsquina1);
        r.setEsquina2(nuevaEsquina2);
    }
}
