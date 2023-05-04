package transport;

public interface InRacing {
    int LOOP_DISTANCE = 4500;
    String pitstop();
    int calculateBestLoopTime();
    int maxSpeed();
}
