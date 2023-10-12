class Triangulo extends FiguraBidimensional {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double obtenerArea() {
        return (base * altura) / 2;
    }

    @Override
    void imprimirDescripcion() {
        System.out.println("Triángulo con base " + base + " y altura " + altura);
    }
}