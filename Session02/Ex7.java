package Session02;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        if(n == 2) System.out.println("2");
        if(n < 2) {
            System.out.println("invalid");
                    return;
        };

        int i = 2;
        int countNumber = 0;

        while(countNumber != n){

            int check = 0;

            for (int j = 2; j <= sqrt(i); j++) {
                if(i % j == 0) {
                    check  = 1;
                    break;
                }
            }


            if(check == 0){
                System.out.println(i);
                countNumber++;
            }
            i++;

        }
    }
}
