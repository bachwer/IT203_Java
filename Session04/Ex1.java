package Session04;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap Ten Sach: ");
        String name = input.nextLine();
        System.out.print("Nhap Ten Tac Gia: ");
        String author = input.nextLine();

        name = formatString(name);
        author = formatString(author);

        System.out.printf("[%s] - [%s]", name, author);

    }

    public static String formatString(String str) {
        str = str.toLowerCase().trim().replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return result.toString().trim();


    }
}
