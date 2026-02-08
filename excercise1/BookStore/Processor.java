package excercise1.BookStore;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList list = new BookList();

        while (true) {
            System.out.println("1.Add TextBook");
            System.out.println("2.Add ReferenceBook");
            System.out.println("3.Update Book");
            System.out.println("4.Delete Book");
            System.out.println("5.Find Book");
            System.out.println("6.Display All");
            System.out.println("0.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    TextBook t = new TextBook();
                    t.addBook();
                    list.addBook(t);
                    break;

                case 2:
                    ReferenceBook r = new ReferenceBook();
                    r.addBook();
                    list.addBook(r);
                    break;

                case 3:
                    System.out.print("ID update: ");
                    list.updateBook(sc.nextLine());
                    break;

                case 4:
                    System.out.print("ID delete: ");
                    list.deleteBook(sc.nextLine());
                    break;

                case 5:
                    System.out.print("ID find: ");
                    Book b = list.findBookById(sc.nextLine());
                    if (b != null) {
                        b.displayBook();
                    } else {
                        System.out.println("Not found");
                    }
                    break;

                case 6:
                    list.displayAll();
                    break;

                case 0:
                    return;
            }
        }
    }
}
