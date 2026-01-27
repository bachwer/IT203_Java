package Session03;

public class Ex3 {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "Ruby", "C++", "PHP"};
        int[] quantities = {5, 11, 42, 43, 43};


        maxQuantityOfBooks(names, quantities);


        minQuantityOfBooks(names, quantities);

    }

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int quantity : quantities) {
            if (max < quantity) {
                max = quantity;
            }

        }
        System.out.println("--Sach co so luong nhieu nhat: " + max);
        for (int i = 0; i < quantities.length; i++) {
            if (max == quantities[i]) {
                System.out.println("-" + names[i]);
            }
        }

    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int quantity : quantities) {
            if (min > quantity) {
                min = quantity;
            }

        }
        System.out.println("--Sach co so luong it nhat: " + (min));
        for (int i = 0; i < quantities.length; i++) {
            if (min == quantities[i]) {
                System.out.println("-" + names[i]);
            }
        }
    }
}
