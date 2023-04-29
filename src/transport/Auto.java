package transport;

public class Auto extends Transport implements InRacing {

    private static final int AUTO_MAX_SPEED = 60;

    public Auto(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
        return AUTO_MAX_SPEED;
    }
}
