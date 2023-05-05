package transport;

import driver.Driver;

public interface InRacing {
    int LOOP_DISTANCE = 4500;
    void pitstop();
    void calculateBestLoopTime();
    void maxSpeed();
    void printInfo();

    void appointDriver(Driver driver) throws IllegalDriverException;
}
