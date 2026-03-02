package Session16;

import java.util.*;

class CustomerManager<K, V extends Customer> {
    private Map<K, V> customers = new HashMap<>();

    public void add(K key, V value){
        customers.put(key, value);
    }

    public V get(K key){
        return customers.get(key);
    }

    public boolean exists(K key){
        return customers.containsKey(key);
    }

    public void displayAll(){
        for(V customers : customers.values()){
            System.out.println(customers);
        }
    }

}
