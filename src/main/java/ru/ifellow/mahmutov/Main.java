package ru.ifellow.mahmutov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Suzuki("Swift", 2020, "синий", true, 15000));
        cars.add(new Suzuki("Vitara", 2018, "зеленый", true, 20000));
        cars.add(new Toyota("Camry", 2022, "черный", true, 25000));
        cars.add(new Toyota("Corolla", 2005, "зеленый", false, 8000));
        cars.add(new Lada("Vesta", 2021, "белый", true, 12000));
        cars.add(new Lada("Granta", 2015, "красный", false, 5000));
        cars.add(new Haval("F7", 2020, "серый", true, 18000));
        cars.add(new Haval("H6", 2023, "зеленый", true, 22000));
        cars.add(new Lamborghini("Huracan", 2022, "оранжевый", true, 250000));
        cars.add(new Lamborghini("Aventador", 2019, "желтый", true, 350000));

        System.out.println("=== Проверка года выпуска для каждого автомобиля ===");
        for (Car car : cars) {
            System.out.println(car.checkYear());
        }

        System.out.println("\n=== Изменение зеленого цвета на красный ===");
        for (Car car : cars) {
            String oldColor = car.getColor();
            car.changeGreenToRed();
            if (!oldColor.equals(car.getColor())) {
                System.out.println(car.getBrand() + " " + car.getModel() + " - цвет изменен с зеленого на красный");
            }
        }

        System.out.println("\n=== Все автомобили после изменений ===");
        for (Car car : cars) {
            System.out.println(car.getFullInfo());
        }
    }
}
