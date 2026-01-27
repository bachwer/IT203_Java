package Session03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {105, 102, 109, 101, 103};


        int id;
        int n =  arr.length;
        do{

            System.out.print("Kho hien tai co: " );
            for(int i = 0; i < n; i++){
                System.out.print(" " + arr[i]);
            }
            System.out.println();

            System.out.print("Nhap So id Can Xoa: ");
            id  = input.nextInt();

            arr = deleteBook(arr, n, id);

            n = n - 1;
            if (n == 0) break;

        }while(id != 0);
    }

    public static int[] deleteBook(int[] arr, int n, int bookId){
        for(int i = 0; i <  n; i++){
                if(arr[i] == bookId){
                    for(int j = i; j < n - 1; j++){
                        arr[j] = arr[j + 1];
                    }
                }
        }

        return arr;
    }
}
