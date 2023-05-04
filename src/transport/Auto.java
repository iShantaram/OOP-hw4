package transport;

import driver.*;

public class Auto<D extends DriverB> extends Transport implements InRacing {

    private static final int AUTO_MAX_SPEED = 60;
    private D driver = null;

    public Auto(String brand, String model, double engineVolume) {
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
    public void pitstop() {
        System.out.println(this + " - заехал на пит-стоп!");
    }

    @Override
    public void calculateBestLoopTime() {
        System.out.println(LOOP_DISTANCE / AUTO_MAX_SPEED);
    }

    @Override
    public void maxSpeed() {
        System.out.println(AUTO_MAX_SPEED);
    }
}
