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
        String res = "Placa\t\t: " + placa + "\nNo. Puertas\t: " + numPuertas + "\nMarca\t\t: " + marca + "\nModelo\t\t: " + modelo;

        if (motor != null) {
            res = "Automovil con motor\n" + res;
            res += "\n" + motor.toString();
        } else {
            res = "Automovil sin motor\n" + res;
        }

        return res;
    }
}
