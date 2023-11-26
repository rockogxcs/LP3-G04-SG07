package actividad3;

public class Bag<T> {
    private T[] list;
    private int count;

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (count >= list.length) {
            throw new IsFull();
        }
        list[count] = obj;
        count++;
    }

    public T[] getObjects() throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty();
        }
        return list;
    }

    public T remove(T obj) throws ObjectNoExist {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                T removedObj = list[i];
                System.arraycopy(list, i + 1, list, i, count - i - 1);
                count--;
                return removedObj;
            }
        }
        throw new ObjectNoExist();
    }

    public int getIndex(T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(list[i]).append(", ");
        }
        return sb.toString();
    }
}