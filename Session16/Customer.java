package Session16;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String id;
    String name;
    String phone;
    List<Pet> ownedPets;

    public Customer(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.ownedPets = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


    @Override
    public String toString(){
        return "ID: " + id +
                ", Name: " + name +
                ", Phone: " + phone +
                ", Owned Pets: " + ownedPets.size();
    }



}
