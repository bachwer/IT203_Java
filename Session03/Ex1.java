package Session03;

import java.util.Scanner;

public class Ex1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhap So Luong Sach Can quan Ly: ");
        int n = input.nextInt();

        int[] arr;
        arr = addBookToLibraries(n);

        System.out.println("----KET QUA-----");
        displayLibraries(arr);


    }
    public static void displayLibraries(int[] arr){
        for (int j : arr) {
            System.out.printf("Sách Thứ: %d \n", j);
        }
    }

    public static int[] addBookToLibraries(int n){
       int[] arr = new int[n];
       for(int i = 0; i < n; i++){
           System.out.printf("Nhap Sách Thứ: %d : ", i + 1);
           arr[i] = input.nextInt();
       }
       return arr;
    }


}
