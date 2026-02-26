package Session13;

import java.util.*;


public class Ex02 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "Paracetamol",
                "Ibuprofen",
                "Panadol",
                "Paracetamol",
                "Aspirin",
                "Ibuprofen"
        );

        System.out.println("Input: " + input);
        ArrayList<String> uniqueList = new ArrayList<>();

        for(String medicine: input){
            if(!uniqueList.contains(medicine)){
                uniqueList.add(medicine);

            }

        }

        Collections.sort(uniqueList);
        System.out.println("Output: " + uniqueList);
    }
}
