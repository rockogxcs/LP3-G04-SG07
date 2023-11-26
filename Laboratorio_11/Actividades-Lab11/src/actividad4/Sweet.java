package actividad4;

class Sweet extends Biscuits {
    String relleno;

    public Sweet(int id, String descripcion, float precio, String sabor, String relleno) {
        super(id, descripcion, precio, sabor);
        this.relleno = relleno;
    }
    
    @Override
    public String toString() {
        return descripcion;
    }
}