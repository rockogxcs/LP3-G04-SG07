class Auto implements ImpactoEcologico {
    int kilometraje;
    int consumoCombustible;

    public Auto(int kilometraje, int consumoCombustible) {
        this.kilometraje = kilometraje;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double DATO_ACTIVIDAD = (kilometraje * consumoCombustible);
        double FACTOR_DE_EMISION = 0.3;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}
