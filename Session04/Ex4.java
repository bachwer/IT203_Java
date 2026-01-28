package Session04;

public class Ex4 {
    public static void main(String[] args) {

        String cardID = "TV202312345";

        if(checkCard(cardID)){
            System.out.println("Hop Le");
        }else{
            System.out.println("Invalid");
        }
    }


    public static boolean checkCard(String code){
        if(code == null) return false;
        if(!code.matches("^[A-Z]{2}.*")) return false;
        int year = Integer.parseInt(code.substring(2,6));
        if(year < 2000 || year > 9999) return false;
        return code.matches("^[A-Z]{2}\\d{4}\\d{5}$");
    }
}


