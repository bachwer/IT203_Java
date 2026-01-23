package Session01;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Trước: " + book1 + " - " + book2 );
        String temp = book1;
        book1 = book2;
        book2 = temp;
        System.out.print("Sau: " + book1 + " - "+ book2 );


    }
}
