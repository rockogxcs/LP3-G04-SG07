import java.io.IOException;

public class AppCaracteres {
    public static void main(String[] args) {
        LeerEntrada l = new LeerEntrada(System.in);
        AppCaracteres p = new AppCaracteres(l);

        while (true) {
            try {
                p.procesar();
            } catch (ExcepcionVocal e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionNumero e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionBlanco e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionSalida e) {
                System.out.println(e.getMessage());
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private LeerEntrada l;
    public AppCaracteres(LeerEntrada l) {
        this.l = l;
    }

    public void procesar() throws IOException, ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida{
        System.out.print("Ingrese el caracter: ");
        char c = l.getChar();
        while (c == '\n') {
            c = l.getChar();
        }
        
        if (Character.isDigit(c)) {
            throw new ExcepcionNumero("Excepción: Se ingresó un número.\n");
        } else if (c == ' ') {
            throw new ExcepcionBlanco("Excepción: Se ingresó un espacio en blanco.\n");
        } else if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
            throw new ExcepcionVocal("Excepción: Se ingresó una vocal.\n");
        } else if (c == 'q') {
            throw new ExcepcionSalida("Excepción: Se ingresó el carácter de salida.\n");
        }
    }
}