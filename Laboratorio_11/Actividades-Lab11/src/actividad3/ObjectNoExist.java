package actividad3;

class ObjectNoExist extends Exception {
    public ObjectNoExist() {
        super("El objeto no existe en la bolsa.");
    }
}