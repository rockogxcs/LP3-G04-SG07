package Lab6.Ejercicios;

public class Auto implements ImpactoEcologico {
    public double emicionCO2;
    public int combustible;
    public double factorEmision = 0.3;

    public Auto(double emicionCO2_, int combustible_){
        this.emicionCO2 = emicionCO2_;
        this.combustible = combustible_;
    }

    public double obtenerImpactoEcologico(){
        double datoActividad = (emicionCO2 * combustible) * 10;
        double impacto_Ecologico = datoActividad * factorEmision;
        return impacto_Ecologico;
    }
}


