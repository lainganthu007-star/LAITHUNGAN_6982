package excercise1.BookStore;

import java.util.*;

public class ReferenceBook extends Book {

    private double tax;

    @Override
    public void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        setBookId(sc.nextLine());

        System.out.print("Publisher: ");
        setPublisher(sc.nextLine());

        setEntryDate(new Date());

        System.out.print("Price: ");
        setUnitPrice(sc.nextDouble());

        System.out.print("Quantity: ");
        setQuantity(sc.nextDouble());

        System.out.print("Tax: ");
        tax = sc.nextDouble();
    }

    @Override
    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("New Tax: ");
            tax = sc.nextDouble();
        }
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Tax: " + tax);
    }
}
