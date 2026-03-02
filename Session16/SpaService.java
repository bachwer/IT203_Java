package Session16;

import java.util.LinkedList;
import java.util.Queue;

public class SpaService {
    Queue<Pet> waitingQueue;

    public SpaService(){
        waitingQueue =  new LinkedList<>();
    }

    public void serveNext(){
        if(waitingQueue.isEmpty()){
            System.out.println("No pets waiting");
            return;
        }
        Pet pet = waitingQueue.poll();
        System.out.println("Service: " +  pet.getName());

    }
    public void checkIn(Pet p){
        waitingQueue.offer(p);
    }
    public void showQueue(){
        if(waitingQueue.isEmpty()){
            System.out.println("Spa queue is empty !!");

            return;
        }

        for(Pet pet: waitingQueue){
            System.out.println(pet.getName());
        }
    }
}
