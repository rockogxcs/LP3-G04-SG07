package Lab6.Ejercicios;

public class Bicicleta implements ImpactoEcologico{
    public int llantasUsadas;
    public double distanciaRecorrida;
    public double factorEmision = 0.05;

    public Bicicleta(int llantasUsadas_, double distanciaRecorrida_){
        this.llantasUsadas = llantasUsadas_;
        this.distanciaRecorrida = distanciaRecorrida_;
    }

    public double obtenerImpactoEcologico(){
        double datoActividad = llantasUsadas * distanciaRecorrida / 10;
        double impacto_Ecologico = datoActividad * factorEmision;
        return impacto_Ecologico;
    }
}
