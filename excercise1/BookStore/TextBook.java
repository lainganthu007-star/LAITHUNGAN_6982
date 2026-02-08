
package excercise1.BookStore;

import java.util.*;

public class TextBook extends Book {
    private String status;

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
        sc.nextLine();

        System.out.print("Status: ");
        status = sc.nextLine();
    }

    @Override
    public void updateBook(String id) {
        if(getBookId().equals(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("New Status: ");
            status = sc.nextLine();
        }
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Status: " + status);
    }
}
