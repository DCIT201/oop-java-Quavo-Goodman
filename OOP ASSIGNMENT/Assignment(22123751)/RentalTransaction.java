package com.inkoom;

public class RentalTransaction {
    private String transactionId;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;

    public RentalTransaction(String transactionId, Customer customer, Vehicle vehicle, int rentalDays) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Customer: " + customer +
                ", Vehicle: " + vehicle.getModel() + ", Total Cost: $" + calculateTotalCost();
    }
}
