class Edificio implements ImpactoEcologico {
    int numeroDePisos;
    int consumoDeEnergia;

    public Edificio(int numeroDePisos, int consumoDeEnergia) {
        this.numeroDePisos = numeroDePisos;
        this.consumoDeEnergia = consumoDeEnergia;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double DATO_ACTIVIDAD = (numeroDePisos * consumoDeEnergia);
        double FACTOR_DE_EMISION = 0.5;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}
