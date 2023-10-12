class Circulo extends FiguraBidimensional {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    void imprimirDescripcion() {
        System.out.println("Círculo con radio " + radio);
    }
}