package Lab11.Ejercicios;

import java.util.ArrayList;

public class Dictionary<K, V>{
    public ArrayList<Pair<K, V>>pairs;

    public Dictionary(){
        pairs = new ArrayList<>();
    }

    public void add(K key, V value){
        pairs.add(new Pair<>(key, value));
    }

    public boolean delete(K key){
        for(int i = 0; i < pairs.size(); i++){
            if(pairs.get(i).getKey().equals(key)){
                pairs.remove(i);
                return true;
            }
        }
        return false;
    }

    public V getValue(K key) {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pair<K, V> pair : pairs) {
            sb.append(pair.toString()).append("\n");
        }
        return sb.toString();
    }
}
