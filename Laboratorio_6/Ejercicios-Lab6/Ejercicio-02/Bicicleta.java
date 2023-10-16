class Bicicleta implements ImpactoEcologico {
    int distanciaRecorrida;

    public Bicicleta(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double DATO_ACTIVIDAD = distanciaRecorrida;
        double FACTOR_DE_EMISION = 0.05;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}
