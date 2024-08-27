package ru.geekbrains.lesson3.hw;

import ru.geekbrains.lesson3.Car;
import ru.geekbrains.lesson3.CarType;
import ru.geekbrains.lesson3.FuelType;

import java.awt.*;

public class Pickup extends Car {

    public Pickup(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
        this.type = CarType.Pickup;
        this.fuelType = FuelType.Diesel;
    }

    @Override
    public void movement() {
        System.out.println("Pickup движется.");
    }

    @Override
    public void maintenance() {
        System.out.println("Pickup на обслуживании.");
    }

    @Override
    public boolean gearShifting() {
        return true;
    }

    @Override
    public boolean switchHeadlights() {
        return true;
    }

    @Override
    public boolean switchWipers() {
        return true;
    }
}