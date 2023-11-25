package actividad1;

class Procedencia {
    String departamento;
    String provincia;

    public boolean contiene(String valor) {
        return departamento.equals(valor) || provincia.equals(valor);
    }
}