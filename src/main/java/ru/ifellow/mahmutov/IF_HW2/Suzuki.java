package ru.ifellow.mahmutov.IF_HW2;

class Suzuki extends Car {
    public Suzuki(String model, int year, String color, boolean isAutomatic, int price) {
        super("Suzuki", model, year, color, isAutomatic, price);
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