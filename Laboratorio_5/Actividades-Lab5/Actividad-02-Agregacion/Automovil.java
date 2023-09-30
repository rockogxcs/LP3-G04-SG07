public class Automovil{
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;
    
    public Automovil(String placa, int numPuertas, String marca, String modelo, Motor motor){
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }
    
   @Override
   public String toString(){
       return "Placa: " + placa + ", Número de puertas: " + numPuertas + ", Marca: " + marca 
       + ", Modelo: " + modelo + ", " + motor.toString();
   }
}
