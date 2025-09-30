package ru.ifellow.mahmutov.IF_HW2;

public abstract class Car {

    String brand;
    String model;
    int year;
    String color;
    boolean isAutomatic;
    int price;

    public Car(String brand, String model, int year, String color,
               boolean isAutomatic, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.price = price;
    }
    public String getFullInfo() {
        return brand + ", " + model + ", " + year + ", " + color +
                ", " + (isAutomatic ? "автомат" : "механика") + ", " + price + "$";
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }

    public abstract void changeGreenToRed();

    public abstract String checkYear();
}
