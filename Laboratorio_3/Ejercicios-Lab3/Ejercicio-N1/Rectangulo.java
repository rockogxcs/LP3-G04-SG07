public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
    }

    public Rectangulo(int base, int altura) {
        this(new Coordenada(), new Coordenada(base, altura));
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }
    
    public void setEsquina1(Coordenada c) {
        this.esquina1 = c;
    }
    
    public Coordenada getEsquina2() {
        return esquina2;
    }
    
    public void setEsquina2(Coordenada c) {
        this.esquina2 = c;
    }
    
    public String toString() {
        return "Rectangulo: " + esquina1.toString() + " - " + esquina2.toString();
    }
}