package com.inkoom;

public class Main {
    public static void main(String[] args) {
                RentalAgency agency = new RentalAgency();
                Customer customer = new Customer("Alice", "C001");

                Car car = new Car("V001", "Toyota Corolla", 50, true);
                Motorcycle motorcycle = new Motorcycle("V002", "BMW M3", 30, false);
                Truck truck = new Truck("V003", "Mercedes Benz AMG", 100, 2);

                agency.addVehicle(car);
                agency.addVehicle(motorcycle);
                agency.addVehicle(truck);

                System.out.println("Available vehicles:");
                agency.listAvailableVehicles();

                System.out.println("\nRenting a car...");
                agency.rentVehicle("V001", customer, 5);

                System.out.println("\nAvailable vehicles after rental:");
                agency.listAvailableVehicles();


    }
}