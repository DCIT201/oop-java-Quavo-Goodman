package com.inkoom;

// Rentable Interface for Polymorphism
interface Rentable {
    void rent(Customer customer, int days);

    void returnVehicle();
}
