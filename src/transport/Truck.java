package transport;

import driver.DriverC;

public class Truck<D extends DriverC> extends Transport implements InRacing {

    private static final int TRUCK_MAX_SPEED = 40;
    private D driver = null;

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void appointDriver (D driver) {
        this.driver = driver;
    }
    public void printInfo() {
        if (driver != null) {
            System.out.println("Водитель " + driver + " класса " + driver.getCategory() + " управляет \n" + this + " и будет участвовать в заезде.");
        } else {
            System.out.println("Водитель не назначен!");
        }
    }

    @Override
    public String toString() {
        return getClass() + " { " + getBrand() + " " + getModel() + ", объем двигателя: " + getEngineVolume() + " }";
    }

    @Override
    public String pitstop() {
        return this + " - заехал на пит-стоп!";
    }

    @Override
    public int calculateBestLoopTime() {
        return LOOP_DISTANCE / maxSpeed();
    }

    @Override
    public int maxSpeed() {
        return TRUCK_MAX_SPEED;
    }
}
