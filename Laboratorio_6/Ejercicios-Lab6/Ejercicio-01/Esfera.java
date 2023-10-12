class Esfera extends FiguraTridimensional {
    double radio;

    Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    double obtenerArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    double obtenerVolumen() {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    void imprimirDescripcion() {
        System.out.println("Esfera con radio " + radio);
    }
}