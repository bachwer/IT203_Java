package Session15.Ex5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    Queue<EmergencyCase> cases;


    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c){
        cases.offer(c);
    }

    public EmergencyCase getNextCase(){
        return cases.poll();
    }


    public boolean IsEmpty(){
        return cases.isEmpty();
    }
}
