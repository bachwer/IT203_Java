package Session15.Ex6;

import java.util.*;

public class PatientWaitingQueue {
    Queue<Patient> waitingQueue;
    int totalPatients;

    public PatientWaitingQueue(){
        this.waitingQueue =  new LinkedList<>();
        int totalPatients = 0;
    }

    public void addPatient(Patient p){
        waitingQueue.offer(p);
        totalPatients++;
    }

    public Patient callNextPatient(){
        if(waitingQueue.isEmpty()){
            return null;
        }
        return waitingQueue.poll();
    }
    public int getTotalPatients(){
        return totalPatients;
    }
}
