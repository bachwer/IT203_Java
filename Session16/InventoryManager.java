package Session16;

import java.util.*;

class InventoryManager<T extends Pet> {
    private List<T> inventory = new ArrayList<>();

    public void InventoryManager(T pet){
        inventory.add(pet);
    }

    public void remove(T pet){
        inventory.remove(pet);
    }

    public T findById(String id){
        for(T pet: inventory){
            if(pet.getId().equals(id)) return pet;
        }

        return null;
    }

    public void displayAll(){
        if(inventory.isEmpty()){
            System.out.println("is Empty");
            return;
        }

        for(T pet: inventory){
            System.out.println(pet);
        }
    }

    public List<T> getAll(){
        return inventory;
    }

}
