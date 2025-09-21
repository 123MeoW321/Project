package ru.ifellow.mahmutov;

class Toyota extends Car {
    public Toyota(String model, int year, String color, boolean isAutomatic, int price) {
        super("ru.ifellow.mahmutov.Toyota", model, year, color, isAutomatic, price);
    }

    @Override
    public void changeGreenToRed() {
        if ("зеленый".equalsIgnoreCase(this.color)) {
            this.color = "красный";
        }
    }

    @Override
    public String checkYear() {
        if (year > 2006) {
            return getFullInfo();
        } else {
            return brand + " " + model + " - устаревший авто";
        }
    }
}