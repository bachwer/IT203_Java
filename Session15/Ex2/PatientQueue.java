package Session15.Ex2;

import java.util.Queue;
import java.util.LinkedList;

public class PatientQueue {

    Queue<Patient> queue;

    public PatientQueue() {
        this.queue = new LinkedList<>();
    }


    public void addPatient(Patient p) {
        queue.offer(p);
    }

    public Patient CallNextPatient() {
        return queue.poll();
    }

    public Patient peekNextPatient() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            return;
        }

        for (Patient p : queue) {

            System.out.println(p);

        }
    }


}
