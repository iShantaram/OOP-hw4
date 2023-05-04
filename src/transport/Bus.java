package transport;

import driver.DriverD;

public class Bus<D extends DriverD> extends Transport implements InRacing {

    private static final int BUS_MAX_SPEED = 30;
    private D driver = null;
    private CapacityType capacityType = null;

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    public enum CapacityType {
        VERY_LITTLE(null, 10), LITTLE(null, 25), MIDDLE(40, 50),
        BIG(60, 80), VERY_BIG(100, 120);

        private final Integer minCapacity;
        private final Integer maxCapacity;

        CapacityType(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        @Override
        public String toString() {
            String str = "Вместимость: ";
            if (minCapacity != null) str += "от " + minCapacity + " мест ";
            if (maxCapacity != null) str += "до " + maxCapacity + " мест";
            return str;
        }
    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void printType() {
        if (capacityType != null) {
            System.out.println(capacityType);
        } else {
        System.out.println("Данных по транспортному средству 'Автобус' недостаточно");
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
        System.out.println(LOOP_DISTANCE / BUS_MAX_SPEED);
    }

    @Override
    public void maxSpeed() {
        System.out.println(BUS_MAX_SPEED);
    }
}
