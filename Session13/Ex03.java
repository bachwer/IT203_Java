package Session13;

import java.util.*;


public class Ex03 {

    public static <T> List<T> findCommonPatients(List<T> ListA, List<T> ListB){
        List<T> commonList = new ArrayList<>();

        for(T item: ListA){
            if(ListB.contains(item) && !commonList.contains(item)){
                commonList.add(item);
            }
        }
        return commonList;
    }
    public static void main(String[] args) {
        List<Integer> ListA1 = Arrays.asList(101, 102, 105);
        List<Integer> ListB1 = Arrays.asList(102, 105, 108);




        List<String> ListA2 =  Arrays.asList("DN01", "DN02", "DN03");
        List<String> ListB2 =  Arrays.asList("DN02", "DN04");


        List<Integer> result1 = findCommonPatients(ListA1, ListB1);
        List<String> result2 = findCommonPatients(ListA2, ListB2);


        System.out.println("Test Case 1 Output: " + result1);

        System.out.println("Test Case 2 Output: " + result2);





    }
}
