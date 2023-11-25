package actividad1;

class Estudiante extends Persona {
    String especialidad;
    Procedencia procedencia;

    public boolean contiene(String valor, String procedenciaValor) {
        return nombres.equals(valor) && (procedencia != null && procedencia.contiene(procedenciaValor));
    }
}