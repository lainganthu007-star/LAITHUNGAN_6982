package exercise12;

public class Car extends Vehicle {

    private int numberOfSeats;
    private String fuelType;

    public Car() {
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();

        System.out.print("Enter seats: ");
        numberOfSeats = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter fuel type: ");
        fuelType = sc.nextLine();
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();

        System.out.print("Enter seats: ");
        numberOfSeats = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter fuel type: ");
        fuelType = sc.nextLine();
    }

    @Override
    public void displayDetails() {

        System.out.println("Car:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price/day: " + rentalPricePerDay);
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("Fuel: " + fuelType);

        System.out.println("----------------");
    }
}