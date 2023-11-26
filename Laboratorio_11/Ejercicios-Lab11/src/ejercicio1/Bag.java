package ejercicio1;

import java.util.ArrayList;

public class Bag<T> {
    protected ArrayList<T> list;
    protected int count;
    private int n;

    public Bag(int n) {
        this.n = n;
        this.list = new ArrayList<T>(n);
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (count >= n) {
            throw new IsFull();
        }
        list.add(obj);
        count++;
    }

    public ArrayList<T> getObjects() throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty();
        }
        return list;
    }

    public T remove(T obj) throws ObjectNoExist {
        int index = list.indexOf(obj);
        if (index != -1) {
            T removedObj = list.remove(index);
            count--;
            return removedObj;
        }
        throw new ObjectNoExist();
    }

    public int getIndex(T obj) {
        return list.indexOf(obj);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(list.get(i)).append(", ");
        }
        return sb.toString();
    }
}
