package Lab11.Ejercicios;

public class Pair<K, V>{
    public K key;
    public V value;

    public Pair(K key_, V value_){
        this.key = key_;
        this.value = value_;
    }

    public K getKey(){
        return this.key; 
    }

    public V getValue(){
        return value;
    }

    @Override
    public String toString(){
        return "Pair{" + "Key=" + key + ", value=" + value + '}';
    }
}