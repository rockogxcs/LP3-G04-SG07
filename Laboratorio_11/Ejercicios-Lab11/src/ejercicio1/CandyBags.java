package ejercicio1;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class CandyBags extends Bag<Goodies> {
    public CandyBags(int n) {
        super(n);
    }

    @Override
    public void add(Goodies obj) throws IsFull {
        if (getIndex(obj) == -1) {
            super.add(obj);
            System.out.println("Se agrego el objeto " + obj);
        }
    }

    public Goodies cheapest() throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty();
        }
        Goodies barato = list.get(0);
        for (Goodies g : list) {
            if (g.price < barato.price) {
                barato = g;
            }
        }
        return barato;
    }

    public List<Goodies> mostExpensive(int n) throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty();
        }
        List<Goodies> caro = new ArrayList<>();
        list.sort(Comparator.comparing(g -> -g.price));
        for (int i = 0; i < n; i++) {
            caro.add(list.get(i));
        }
        return caro;
    }

}
