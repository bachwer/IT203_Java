package Session15.Ex4;

import java.util.PriorityQueue;

public class EmergencyQueue {
    PriorityQueue<EmergencyPatient> queue;

    public EmergencyQueue(){
        this.queue = new PriorityQueue<>();
    }


    public void addPatient(EmergencyPatient p){
        queue.offer(p);
    }

    public EmergencyPatient callNextPatient(){
        return queue.poll();
    }

    public void displayQueue(){
        if(queue.isEmpty()){
            System.out.println("Is Empty()");
            return;
        }
        PriorityQueue<EmergencyPatient> temp = new PriorityQueue<>(queue);

        while (!temp.isEmpty()) {
            System.out.println(temp.poll());
        }
    }
}
