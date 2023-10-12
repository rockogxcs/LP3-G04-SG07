public class TestFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[6];
        figuras[0] = new Circulo(5);
        figuras[1] = new Cuadrado(4);
        figuras[2] = new Triangulo(3, 4);
        figuras[3] = new Esfera(6);
        figuras[4] = new Cubo(8);
        figuras[5] = new Tetraedro(7);

        for (Figura f : figuras) {
            f.imprimirDescripcion();
            if (f instanceof FiguraBidimensional) {
                System.out.println("Área: " + ((FiguraBidimensional) f).obtenerArea());
            } else if (f instanceof FiguraTridimensional) {
                System.out.println("Área: " + ((FiguraTridimensional) f).obtenerArea());
                System.out.println("Volumen: " + ((FiguraTridimensional) f).obtenerVolumen());
            }
            System.out.println();
        }
    }
}
	a