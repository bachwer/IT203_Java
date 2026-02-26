package Session13;

import java.util.LinkedList;

public class Ex04 {
    private LinkedList<String> queue = new LinkedList<>();


    public void patientCheckIn(String name){
        queue.addLast(name);
        System.out.println(name + "Da check-in Thuong");
    }
    public void emergencyCheckIn(String name){
        queue.addFirst(name);
        System.out.println(name + "Da Check-in Cap cuu");
    }

    public void treatPatient(){
        if(queue.isEmpty()){
            System.out.println("Khong Con Benh Nhan");
            return;
        }

        String parient = queue.removeFirst();
        if(parient.equals("C")){
            System.out.println("Dang Cap Cuu: " + parient);

        }else{
            System.out.println("Dang Kham: "+ parient);
        }
    }
}


