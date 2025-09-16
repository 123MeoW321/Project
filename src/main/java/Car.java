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
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // Геттеры
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public boolean isAutomatic() { return isAutomatic; }
    public int getPrice() { return price; }

    // Абстрактный метод для изменения зеленого цвета на красный
    public abstract void changeGreenToRed();

    // Абстрактный метод для проверки года выпуска
    public abstract String checkYear();
}
