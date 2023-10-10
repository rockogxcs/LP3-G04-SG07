public abstract class Empleado implements PorPagar
{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    // constructor con tres argumentos
    public Empleado(String nombre, String apellido, String nss)
    {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }   // fin del constructor de Empleado con tres argumentos
    
    // getters y setters
    public String obtenerPrimerNombre(){ 
        return primerNombre; 
    }
    public void establecerPrimerNombre(String primerNombre) { 
        this.primerNombre = primerNombre; 
    }
    
    public String obtenerApellidoPaterno(){ 
        return apellidoPaterno; 
    }
    
    public void establecerApellidoPaterno(String apellidoPaterno) { 
        this.apellidoPaterno = apellidoPaterno; 
    }

    public String obtenerNumeroSeguroSocial() { 
        return numeroSeguroSocial;
    }
        
    public void establecerNumeroSeguroSocial(String numeroSeguroSocial) { 
        this.numeroSeguroSocial = numeroSeguroSocial; 
    }

    // toString
    @Override
    public String toString() {
        return String.format("empleado asalariado: %s %s\nnumero de seguro social: %s", 
        obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }
    // Nota: Aqui no implementamos el método obtenerMontoPago de PorPagar, así que
    // esta clase debe declararse coro abstract para evitar un error de compilación.
}   // fin de la clase abstracta Empleado
