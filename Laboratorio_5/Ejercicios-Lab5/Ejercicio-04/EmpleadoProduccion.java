import javax.sound.sampled.SourceDataLine;

public class EmpleadoProduccion extends Asalariado {
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String nuevo_turno) {
        this.turno = nuevo_turno;
    }

    public double calcularNomina() {
        return super.calcularNomina() * 1.15; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Turno: " + getTurno();
    }
}


