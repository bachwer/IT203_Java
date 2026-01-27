package Session03;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {105, 102, 109, 101, 103};
        int[] arrSorted;
        arrSorted = sortBooks(arr);
        displayBooks(arrSorted);

    }

    public static int[] sortBooks(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;

    }
    public static void displayBooks(int[] arr){
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
}
