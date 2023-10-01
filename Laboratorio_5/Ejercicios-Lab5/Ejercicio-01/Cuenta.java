public class Cuenta{
    private String numero;
    private double saldo;
    
    public Cuenta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo > 50 ? saldo : 50;
    }
    
    public Cuenta(String numero){
        this(numero, 50);
    }
    
    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo > 50 ? saldo : this.saldo;
    }
    
    public void retirar(double cantidad){
        if (cantidad > 0 && this.saldo - cantidad >= 50){
            this.saldo -= cantidad;
        }
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
    }

    @Override
    public String toString(){
        return "No.Cuenta: " + numero + "\t\tSaldo: S/." + saldo;
    }
}