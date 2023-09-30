public class Banco{
    private String nombre;
    private Persona clientes[];
    private int numClientes;
    
    public Banco(String nombre){
        this(nombre,20);
    }

    public Banco(String nombre, int numCli){
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.numClientes = 0;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCliente(Persona persona){
        if(numClientes < clientes.length){
            for(int i=0; i<numClientes; i++){
                if(clientes[i].equals(persona)){
                    return; // El cliente ya existe
                }
            }
            clientes[numClientes] = persona;
            numClientes++;
        }
    }

    public Persona darBajaCliente(Persona persona){
        for(int i=0; i<numClientes; i++){
            if(clientes[i].equals(persona)){
                Persona clienteEliminado = clientes[i];
                // Mover todos los elementos a la derecha del cliente una posición a la izquierda
                for(int j=i; j<numClientes-1; j++){
                    clientes[j] = clientes[j+1];
                }
                numClientes--;
                return clienteEliminado; // Cliente eliminado
            }
        }
        return null; // Cliente no encontrado
    }

    public boolean buscarCliente(Persona persona){
        for(int i=0; i<numClientes; i++){
            if(clientes[i].equals(persona)){
                return true; // Cliente encontrado
            }
        }
        return false; // Cliente no encontrado
    }
    
    public void clientesTipo(char tipo){
        System.out.println("Clientes del tipo " + tipo + ":");
        for(int i=0; i<numClientes; i++){
            if(clientes[i].getTipo() == tipo){
                System.out.println(clientes[i].toString());
            }
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Banco: ").append(nombre).append("\n");
        sb.append("Clientes:\n");
        for(int i=0; i<numClientes; i++){
            sb.append(clientes[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
