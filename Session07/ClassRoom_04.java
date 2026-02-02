package Session07;

public class ClassRoom_04 {
    public static double classFund = 0;
    public String Name;

    public ClassRoom_04(String Name){
        this.Name = Name;
    }


    public void PayIntoFund(double money){
        classFund += money;
    }

    public static void SeeFund(){
        System.out.println("===================");
        System.out.println("Total: " + classFund);
        System.out.println("===================");
    }
}
