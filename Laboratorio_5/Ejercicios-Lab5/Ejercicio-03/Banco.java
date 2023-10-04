import javax.sound.sampled.SourceDataLine;

public class Banco {
    private String nombre;
    private Persona clientes[];
    private int numClientes;

    public Banco(String nombre) {
        this(nombre, 20);
    }


    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.numClientes = 0;
    }

    // Setter y getter para numClientes
    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public void agregarCliente(Persona persona) {
        // Verificar si el cliente ya existe
        if (!buscarCliente(persona)) {
            // Verificar si hay capacidad en el arreglo
            if (numClientes < clientes.length) {
                clientes[numClientes] = persona;
                numClientes++;
            } else {
                System.out.println("No se puede agregar más clientes. Capacidad máxima alcanzada.");
            }
        } else {
            System.out.println("El cliente ya existe en el banco.");
        }
    }

    public Persona darBajaCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(persona)) {
                Persona clienteEliminado = clientes[i];
                for (int j = i; j < numClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[numClientes - 1] = null;
                numClientes--;
                return clienteEliminado;
            }
        }
        System.out.println("El cliente no existe en el banco.");
        return null;
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public void clientesTipo(char tipo) {
        System.out.println("Clientes de tipo '" + tipo + "':");
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getTipo() == tipo) {
                System.out.println(clientes[i]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco: ").append(nombre).append("\n");
        sb.append("Clientes:\n");
        for (int i = 0; i < numClientes; i++) {
            sb.append(clientes[i]).append("\n");
        }
        return sb.toString();
    }
}

