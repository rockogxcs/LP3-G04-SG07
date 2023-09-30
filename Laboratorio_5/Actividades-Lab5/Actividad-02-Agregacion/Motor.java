public class Motor{
    private int numMotor;
    private int revPorMin;
    
    public Motor(int numMotor, int revPorMin){
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }
    
    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }

    public int getRevPorMin() {
        return revPorMin;
    }
    
   @Override
   public String toString(){
       return "Número de motor: " + numMotor + ", Revoluciones por minuto: " + revPorMin;
   }
}
