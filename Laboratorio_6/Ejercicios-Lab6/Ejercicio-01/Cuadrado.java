class Cuadrado extends FiguraBidimensional {
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double obtenerArea() {
        return Math.pow(lado, 2);
    }

    @Override
    void imprimirDescripcion() {
        System.out.println("Cuadrado con lado " + lado);
    }
}