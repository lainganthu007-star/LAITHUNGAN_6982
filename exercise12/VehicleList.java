package exercise12;

import java.util.ArrayList;

public class VehicleList {

    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle v) {

        vehicleList.add(v);
    }

    public void updateVehicleById(String id) {

        for (Vehicle v : vehicleList) {

            if (v.getId().equals(id)) {

                v.updateVehicle();
                return;
            }
        }

        System.out.println("Not found!");
    }

    public void deleteVehicleById(String id) {

        vehicleList.removeIf(v -> v.getId().equals(id));
    }

    public void findVehicleById(String id) {

        for (Vehicle v : vehicleList) {

            if (v.getId().equals(id)) {

                v.displayDetails();
                return;
            }
        }

        System.out.println("Not found!");
    }

    public void displayAllVehicles() {

        for (Vehicle v : vehicleList) {

            v.displayDetails();
        }
    }

}