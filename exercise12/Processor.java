package exercise12;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VehicleList list = new VehicleList();

        int choice;

        do {

            System.out.println("1.Add Car");
            System.out.println("2.Add Truck");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Find");
            System.out.println("6.Display All");
            System.out.println("0.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    Car c = new Car();
                    c.addVehicle();
                    list.addVehicle(c);
                    break;

                case 2:

                    Truck t = new Truck();
                    t.addVehicle();
                    list.addVehicle(t);
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    list.updateVehicleById(sc.nextLine());
                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    list.deleteVehicleById(sc.nextLine());
                    break;

                case 5:

                    System.out.print("Enter ID: ");
                    list.findVehicleById(sc.nextLine());
                    break;

                case 6:

                    list.displayAllVehicles();
                    break;

            }

        } while (choice != 0);

    }
}