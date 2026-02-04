package Session09;

public class Ex4 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sounds();
//        animal.wagTail(); Animal không có method wagTail()

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // downcasting
            dog.wagTail();
        }
    }
}
