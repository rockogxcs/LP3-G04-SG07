public class Cuenta{
    private int numero;
    private double saldo;
    
    public Cuenta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public Cuenta(int numero){
        this(numero, 0);
    }
    
    // setters y getters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public String toString(){
        return "Número de cuenta: " + numero + ", Saldo: S/." + saldo;
    }
}