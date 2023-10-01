public class Persona{
    private int id;
    private String nombre;
    private String apellido;
    private char tipoCliente;
    private Cuenta cuenta;

    private static int tipoC = 1000, tipoB = 5000, tipoE = 8000;

    
    public Persona(int id, String nombre, String apellido, char tipoCliente){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;

        switch (tipoCliente) {
            case 'B':
                this.cuenta = new Cuenta("B" + tipoB++);
                break;
            case 'E':
                this.cuenta = new Cuenta("E" + tipoE++);
                break;
            default:
                this.cuenta = new Cuenta("C" + tipoC++);
                break;
        }
        
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public char getTipoCliente(){
        return tipoCliente;
    }
    
    public void setTipoCliente(char tipoCliente){
        this.tipoCliente = tipoCliente;
    
        switch (tipoCliente){
            case 'B':
                this.cuenta.setNumero("B" + tipoB++);
                break;
            case 'E':
                this.cuenta.setNumero("E" + tipoE++);
                break;
            default:
                this.cuenta.setNumero("C" + tipoC++);
                break;
        }
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public String toString(){
        return "Cliente: " + id + "\nTipo\t: " + tipoCliente + "\nNombres: " + nombre + " " + apellido + "\n" + cuenta.toString();
    }
}
