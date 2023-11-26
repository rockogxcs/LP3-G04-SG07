package actividad4;

class ObjectNoExist extends Exception {
    public ObjectNoExist() {
        super("El objeto no existe en la bolsa.");
    }
}