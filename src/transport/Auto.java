package transport;
import driver.*;

public class Auto<D extends DriverB> extends Transport implements InRacing {
    private static final int AUTO_MAX_SPEED = 60;
    private Driver driver = null;
    private BodyType bodyType = null;
    public BodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
    public enum BodyType {
        SEDAN("Седан"), HETCHBACK("Хетчбек"), COUPE("Купе"),
        UNIVERSAL("Универсал"), VNEDOROZHNIK("Внедорожник"),
        CROSSOVER("Кроссовер"), PIKAP("Пикап"), FURGON("Фургон"),
        MINIVAN("Минивэн");
        private final String bodyName;
        BodyType(String name) {
            this.bodyName = name;
        }
        @Override
        public String toString() {
            return "Тип кузова: " + bodyName;
        }
    }
    public Auto(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void getDiagnosted() {
        System.out.println("Авто проходит диагностику");
    }
    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Данных по транспортному средству 'Легковой автомобиль' недостаточно");
        }
    }
    public void appointDriver (D driver) throws IllegalDriverException {
        if (driver.isDriverLicense()) {
            this.driver = driver;
        } else {
            throw new IllegalDriverException("У водителя " + driver.getName() + " для назначения на "
                    + getBrand() + " " + getModel() + " отсутствуют права!");
        }
    }
    public void printInfo() {
        if (driver != null) {
            System.out.println("Водитель " + driver + " класса " + driver.getCategory() + " управляет \n" + this + " и будет участвовать в заезде.");
        } else {
            System.out.println("На " + getModel() + " " + getBrand() + " водитель не назначен!\n");
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
    @Override
    public void appointDriver(Driver driver) throws IllegalDriverException {
        if (driver.isDriverLicense()) {
            if (driver.getCategory().equals("B")) {
                this.driver = driver;
            } else {
                throw new IllegalDriverException("У водителя " + driver.getName() + " для назначения на "
                        + getBrand() + " " + getModel() + " не соответствует категория прав!");
            }
        } else {
            throw new IllegalDriverException("У водителя " + driver.getName() + " для назначения на "
                    + getBrand() + " " + getModel() + " отсутствуют права!");
        }
    }
}
