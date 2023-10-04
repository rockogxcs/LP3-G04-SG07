import javax.sound.sampled.SourceDataLine;

public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String nueva_region) {
        this.region = nueva_region;
    }

    public double calcularNomina() {
        return super.calcularNomina() * 1.10; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Región: " + getRegion();
    }
}

