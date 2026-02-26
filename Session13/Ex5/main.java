package Session13.Ex5;

import java.util.*;

public class main {
    static Scanner input =  new Scanner(System.in);
    static List<Patient> patientList = new ArrayList<>();
    public static void main(String[] args) {
        String Menu = "";
        do{



            menu();
            Menu = input.nextLine();
            switch (Menu) {
                case "1":
                    addPatient();
                    break;
                case "2":
                    updateDiagnosis();
                    break;
                case "3":
                    dischargePatient();
                    break;
                case "4":
                    sortPatients();
                    break;
                case "5":
                    displayPatients();
                    break;
                case "6":
                    System.out.println("Thoát chương trình.");
                    break;
                default:

            }


        }while (!Menu.equals("6"));





    }


    static void menu(){
        System.out.println("||===================MENU=================||");
        System.out.println("||      1. Tiếp Nhận Bệnh Nhân            ||");
        System.out.println("||      2. Cập Nhập Chuẩn Đoán            ||");
        System.out.println("||      3. Xuất Viện                      ||");
        System.out.println("||      4. Sắp xếp danh sách bệnh nhận    ||");
        System.out.println("||      5. Hiện thị danh sách bệnh nhân   ||");
        System.out.println("||      6. Thoát                          ||");
        System.out.println("||========================================||");
        System.out.print("Chọn Chức năng: ");
    }


    static void addPatient(){
        System.out.print("Nhập Id Bệnh Nhân: ");
        String Id = input.nextLine();
        System.out.print("Nhập Tên Bệnh Nhân: ");
        String Name = input.nextLine();
        System.out.print("Nhập tuổi: ");
        String age = input.nextLine();
        System.out.print("Nhập Chuẩn Đoán: ");
        String diagnosis = input.nextLine();
        Patient newPatient = new Patient(Id, Name, age, diagnosis);
        patientList.add(newPatient);
        System.out.println("Bệnh Nhận Đã được thêm thành công !!");
    }


    static void updateDiagnosis(){
        System.out.print("Nhâp Id bệnh nhân để cập nhập chuẩn đoán: ");
        String id = input.nextLine();


        for(Patient pa: patientList){
            if(pa.getId().equals(id)){
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = input.nextLine();
                pa.setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân!");

    }

    private static void dischargePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = input.nextLine();

        Iterator<Patient> iterator = patientList.iterator();
        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equals(id)) {
                iterator.remove();
                System.out.println("Đã xuất viện bệnh nhân!");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân!");
    }

    private static void sortPatients() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p2.getAge() != p1.getAge()) {
                    return Integer.parseInt(p2.getAge()) - Integer.parseInt(p1.getAge());
                }

                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("Đã sắp xếp danh sách!");
    }


    private static void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Patient p : patientList) {
            System.out.println(p);
        }
    }




}
