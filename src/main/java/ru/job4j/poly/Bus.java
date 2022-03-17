package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Число пассажиров: " + numberOfPassengers);
    }

    @Override
    public double refuel(double fuelQuantity) {
        double priceFuel = 50.7;
        return fuelQuantity*priceFuel;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(33);
        System.out.println("Итоговая стоимость топлива: " + bus.refuel(100) + " у.е.");
    }
}
