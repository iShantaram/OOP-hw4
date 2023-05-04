package transport;

public interface InRacing {
    int LOOP_DISTANCE = 4500;
    void pitstop();
    void calculateBestLoopTime();
    void maxSpeed();
}
