package transport;

import driver.DriverC;

public class Truck<D extends DriverC> extends Transport implements InRacing {

    private static final int TRUCK_MAX_SPEED = 40;

    public LiftType getLiftType() {
        return liftType;
    }

    public void setLiftType(LiftType liftType) {
        this.liftType = liftType;
    }

    public enum LiftType {
        N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);

        private final Float minWeight;
        private final Float maxWeight;

        LiftType(Float minWeight, Float maxWeight) {
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }

        @Override
        public String toString() {
            String str = "Грузоподъемность: ";
            if (minWeight != null) str += "от " + minWeight + " тонн ";
            if (maxWeight != null) str += "до " + maxWeight + " тонн";
            return str;
        }
    }
    private D driver = null;
    private LiftType liftType = null;

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void printType() {
        if (liftType != null) {
            System.out.println(liftType);
        } else {
            System.out.println("Данных по транспортному средству 'Грузовой автомобиль' недостаточно");
        }
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
        System.out.println(LOOP_DISTANCE / TRUCK_MAX_SPEED);
    }

    @Override
    public void maxSpeed() {
        System.out.println(TRUCK_MAX_SPEED);
    }
}
