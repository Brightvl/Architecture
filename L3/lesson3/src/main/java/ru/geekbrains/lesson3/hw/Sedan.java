package ru.geekbrains.lesson3.hw;

import ru.geekbrains.lesson3.Car;
import ru.geekbrains.lesson3.CarType;
import ru.geekbrains.lesson3.FuelType;

import java.awt.*;

public class Sedan extends Car {

    public Sedan(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
        this.type = CarType.Sedan;
        this.fuelType = FuelType.Gasoline;
    }

    @Override
    public void movement() {
        System.out.println("Sedan движется.");
    }

    @Override
    public void maintenance() {
        System.out.println("Sedan на обслуживании.");
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