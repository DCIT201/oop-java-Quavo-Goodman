package com.inkoom;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;

    public RentalAgency() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void listAvailableVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                System.out.println(vehicle);
            }
        }
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false);
                System.out.println("Rented " + vehicle.getModel() + " to " + customer.getName() + " for " + days + " days.");
                return;
            }
        }
        System.out.println("Vehicle not available.");
    }
}
