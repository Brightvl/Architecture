package ru.geekbrains.lesson3;

import java.awt.*;

public abstract class Car {

    private Refueling refueling;

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    // Добавленные геттеры
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    // Абстрактные методы, которые должны быть реализованы в наследниках
    public abstract void movement();

    public abstract void maintenance();

    public abstract boolean gearShifting();

    public abstract boolean switchHeadlights();

    public abstract boolean switchWipers();

    // Поля
    private String make;
    private String model;
    private Color color;
    protected CarType type;
    private int wheelsCount;
    protected FuelType fuelType = FuelType.Diesel;
    private GearboxType gearboxType;
    private double engineCapacity;
    private boolean fogLights = false;

    // Конструктор
    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }
}
