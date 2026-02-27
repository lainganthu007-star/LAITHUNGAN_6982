package exercise12;

public class Truck extends Vehicle {

    private double loadCapacity;
    private double distance;

    public Truck() {
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void addVehicle() {

        super.addVehicle();

        System.out.print("Enter load capacity: ");
        loadCapacity = sc.nextDouble();

        System.out.print("Enter distance: ");
        distance = sc.nextDouble();

        sc.nextLine();
    }

    @Override
    public void updateVehicle() {

        super.updateVehicle();

        System.out.print("Enter load capacity: ");
        loadCapacity = sc.nextDouble();

        System.out.print("Enter distance: ");
        distance = sc.nextDouble();

        sc.nextLine();
    }

    @Override
    public void displayDetails() {

        System.out.println("Truck:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price/day: " + rentalPricePerDay);
        System.out.println("Load: " + loadCapacity);
        System.out.println("Distance: " + distance);

        System.out.println("----------------");
    }
}
