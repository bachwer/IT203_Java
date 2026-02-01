package Session06;

public class Employee_Ex4 {
    private String maNV;
    private String tenNV;
    private double luong;

    public Employee_Ex4(){
        this.maNV = "invalid";
        this.tenNV = "invalid";
        this.luong = 0;
    }

    public Employee_Ex4(String maNV, String Name){
        this.maNV = maNV;
        this.tenNV = Name;
        this.luong = 0;
    }

    public Employee_Ex4(String maNV, String Name, Double salary){
        this.maNV = maNV;
        this.tenNV = Name;
        this.luong = salary;
    }

    public void infor(){
        System.out.println("--------------------");
        System.out.println("Employee Code: " + this.maNV);
        System.out.println("Employee Name: " + this.tenNV);
        System.out.println("Employee Salary: " + this.luong);
    }





}
