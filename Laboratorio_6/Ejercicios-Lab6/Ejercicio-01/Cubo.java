class Cubo extends FiguraTridimensional {
    double lado;

    Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    double obtenerArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    double obtenerVolumen() {
        return Math.pow(lado, 3);
    }

     @Override
     void imprimirDescripcion() {
         System.out.println("Cubo con lado " + lado);
     }
}