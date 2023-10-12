class Tetraedro extends FiguraTridimensional {
    double arista;
    
    Tetraedro(double arista) {
     this.arista = arista;
    }
    
    @Override
    double obtenerArea() {
     return Math.sqrt(3) * Math.pow(arista, 2);
    }
    
    @Override
    double obtenerVolumen() {
     return Math.pow(arista, 3) / (6 * Math.sqrt(2));
    }
    
    @Override
    void imprimirDescripcion() {
      System.out.println("Tetraedro con arista " + arista);
    }
}