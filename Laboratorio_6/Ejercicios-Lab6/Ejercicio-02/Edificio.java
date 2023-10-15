package Lab6.Ejercicios;

public class Edificio implements ImpactoEcologico {
    public int desechosOrganicos;
    public int numPersonas;
    public double factorEmision = 0.5;

    public Edificio(int desechosOrganicos_, int numPersonas_){
        this.desechosOrganicos = desechosOrganicos_;
        this.numPersonas = numPersonas_;
    }

    public double obtenerImpactoEcologico(){
        double datoActividad = (desechosOrganicos * numPersonas) / 2;
        double impacto_Ecologico = datoActividad + factorEmision;
        return impacto_Ecologico; 
    }
}
