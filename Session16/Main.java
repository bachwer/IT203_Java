package Session16;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static InventoryManager<Pet> inventory = new InventoryManager<>();
    static CustomerManager<String, Customer> customerList = new CustomerManager<>();
    static SpaService spa = new SpaService();
    static ActivityLog<Action> log =  new ActivityLog<>();

    public static void main(String[] args) {


        String choice = "";

        do{
            menu();
            System.out.print("Enter you Choice: ");
            choice = input.nextLine();
        }while(!choice.equals("0"));

    }

    static public void menu(){
        System.out.println("\n===== PET KINGDOM =====");
        System.out.println("1. Manage Inventory");
        System.out.println("2. Manage Customers");
        System.out.println("3. Spa Service");
        System.out.println("4. Activity Log");
        System.out.println("0. Exit");

    }
//    INVENTORY

    static void inventoryMenu(){
        System.out.println("1. Add Pet");
        System.out.println("2. Show Pets");
        System.out.println("3. Sell Pet");
        System.out.print("Enter: ");
        String choice = input.nextLine();

        switch(choice){
            case "1" -> {
                System.out.print("ID: ");
                String id = input.nextLine();
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Species: ");
                String species = input.nextLine();
                System.out.print("Age: ");
                int age = input.nextInt();

                System.out.print("Price: ");
                double price = input.nextDouble();
                Pet pet = new Pet(id, name, species, age, price);
                input.nextLine();
            }


            case "2" -> inventory.displayAll();
            case "3" -> {
                System.out.print("Enter Pet Id: ");
                String id =  input.nextLine();
                Pet pet = inventory.findById(id);
                if(pet != null && !pet.isSold()){
                    pet.setSold(true);
                    inventory.remove(pet);
                    log.push(new Action("Sold pet " + pet.getName()));
                    System.out.println("Pet sold! ");
                }else{
                    System.out.println("pet not found !");
                }
            }
        }
    }

    //CUSTOMER

    static void customerMenu(){
        System.out.println("1. Register Customer");
        System.out.println("2. Show Customer");

        String choice  = input.nextLine();

        switch(choice){

            case "1" -> {
                System.out.print("Id: ");
                String id = input.nextLine();
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Phone: ");
                String phone =  input.nextLine();

                if(customerList.exists(id)){
                    customerList.add(id, new Customer(id, name, phone));
                    log.push(new Action("Added Customer" + name));
                }else{
                    System.out.println("Customer Already Exists !");
                }
            }
            case "2" -> customerList.displayAll();
        }
    }

    // Spa

    static void spaMenu() {
        System.out.println("\n1. Check-in Pet");
        System.out.println("2. Serve Next");
        System.out.println("3. Show Queue");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Pet ID: ");
                String id = input.nextLine();
                Pet pet = inventory.findById(id);
                if (pet != null) {
                    spa.checkIn(pet);
                    log.push(new Action("Pet checked in spa: " + pet.getName()));
                } else {
                    System.out.println("Pet not found in inventory.");
                }
            }
            case 2 -> spa.serveNext();
            case 3 -> spa.showQueue();
        }
    }

    // LOG

    static void logMenu() {
        System.out.println("\n1. Show Last Action");
        System.out.println("2. Undo Last Action");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1 -> log.ShowRecent();
            case 2 -> log.undo();
        }
    }
}