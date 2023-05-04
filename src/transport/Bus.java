package transport;

import driver.DriverD;

public class Bus<D extends DriverD> extends Transport implements InRacing {

    private static final int BUS_MAX_SPEED = 30;
    private D driver = null;

    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println(LOOP_DISTANCE / BUS_MAX_SPEED);
    }

    @Override
    public void maxSpeed() {
        System.out.println(BUS_MAX_SPEED);
    }
}
