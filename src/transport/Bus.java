package transport;

public class Bus extends Transport implements InRacing {

    private static final int BUS_MAX_SPEED = 30;

    public Bus(String brand, String model, double engineVolume) {
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
        return BUS_MAX_SPEED;
    }
}
