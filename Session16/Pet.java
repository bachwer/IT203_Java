package Session16;

public class Pet {
    String id;
    String name;
    String species;
    int age;
    double price;
    boolean isSold;

    public Pet(String id, String name, String species, int age, double price) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.price = price;
        this.isSold = false;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSold() {
        return isSold;
    }

    @Override
    public String toString(){
        return "ID: " + id +
                ", Name: " + name +
                ", Species: " + species +
                ", Age: " + age +
                ", Price: " + price +
                ", Sold: " + isSold;
    }

}
