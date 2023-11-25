package actividad1;

class Persona implements Contenedora<String> {
    String nombres;
    String direccion;
    String telefono;

    @Override
    public boolean contiene(String valor) {
        return nombres.equals(valor);
    }
}