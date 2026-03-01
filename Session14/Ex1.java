package Session14;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        List<String> listPerson = Arrays.asList( "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên");

        Set<String> listValidated = new LinkedHashSet<>(listPerson);

        System.out.println("List: ");
        for(String name: listValidated){
            System.out.println(name);
        }
    }
}
