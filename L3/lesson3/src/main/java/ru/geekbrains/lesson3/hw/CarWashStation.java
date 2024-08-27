package ru.geekbrains.lesson3.hw;


import ru.geekbrains.lesson3.Car;

public class CarWashStation implements CarWash {

    @Override
    public void wash(Car car) {
        System.out.printf("Моем автомобиль %s %s. Цвет: %s\n", car.getMake(), car.getModel(), car.getColor().toString());
    }
}
