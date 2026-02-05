package Session10.Ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{
    public static void main(String[] args) {
        List<Product> Products = new ArrayList<Product>();

        Products.add(new Product("Laptop", 1500));
        Products.add(new Product("Mouse", 20));
        Products.add(new Product("Keyboard", 50));
        Products.add(new Product("Monitor", 300));

        Collections.sort(Products, new Comparator<Product>() {

            private int compareCount = 0; // Lambda KHÔNG làm được điều này

            @Override
            public int compare(Product p1, Product p2) {
                compareCount++;
                return Double.compare(p1.getPrice(), p2.getPrice());
            }

        });
        System.out.println("Danh sách sản phẩm sắp xếp theo GIÁ tăng dần:");
        Products.forEach(System.out::println);

        System.out.println();


        Products.sort(
                (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName())
        );

        System.out.println("\nDanh sách sản phẩm sắp xếp theo TÊN (A-Z):");
        Products.forEach(System.out::println);



    }
}
