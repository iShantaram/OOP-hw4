import driver.*;
import transport.*;

public class Homework4 {
    public static void main(String[] args) {
        Auto lada = new Auto("Lada", "Granta", 1.6);
        Auto audi = new Auto("Audi", "A8 50L TDI Quattro", 3.0);
        Auto bmw1 = new Auto("BMW", "Z8", 3.0);
        Auto bmw2 = new Auto("BMW", "Z3", 2.0);

        Bus mb = new Bus("Mercedes-Benz", "Sprinter Classic", 2.2);
        Bus man1 = new Bus("MAN", "Lion's Coach", 8);
        Bus man2 = new Bus("MAN", "Lion's Coach", 9);
        Bus scania = new Bus("Scania", "Irizar I6", 12);

        Truck maz1 = new Truck("МАЗ", "6312", 7.4);
        Truck maz2 = new Truck("МАЗ", "6312", 14);
        Truck kamaz = new Truck("КаМАЗ", "4326", 10.8);
        Truck volvo = new Truck("Volvo", "FH12", 12.8);

        lada.setBodyType(Auto.BodyType.SEDAN);
        audi.setBodyType(Auto.BodyType.SEDAN);
        bmw1.setBodyType(Auto.BodyType.COUPE);
        bmw2.setBodyType(Auto.BodyType.COUPE);

        mb.setCapacityType(Bus.CapacityType.LITTLE);
        man1.setCapacityType(Bus.CapacityType.MIDDLE);
        man2.setCapacityType(Bus.CapacityType.BIG);
        scania.setCapacityType(Bus.CapacityType.BIG);

        maz1.setLiftType(Truck.LiftType.N1);
        maz2.setLiftType(Truck.LiftType.N2);
        kamaz.setLiftType(Truck.LiftType.N3);
        volvo.setLiftType(Truck.LiftType.N3);

//        InRacing[] transports = {lada, audi, bmw1, bmw2, mb, man1, man2, scania, maz1, maz2, kamaz, volvo};
//        for (InRacing transport : transports) {
//            System.out.println(transport);
//            transport.pitstop();
//            System.out.println("Лучшее время круга ");
//            transport.calculateBestLoopTime();
//            System.out.println("Максимальня скорость  ");
//            transport.maxSpeed();
//            System.out.println();
//        }

        System.out.println();
        DriverB drLada = new DriverB("A", true, 1);
        DriverB drAudi = new DriverB("B", true, 2);
        DriverB drBmw1 = new DriverB("C", false, 3);
        DriverB drBmw2 = new DriverB("D", false, 4);

        DriverD drMb = new DriverD("E", false, 5);
        DriverD drMan1 = new DriverD("F", true, 6);
        DriverD drMan2 = new DriverD("G", true, 7);
        DriverB drScania = new DriverB("H", true, 0);

        DriverC drMaz1 = new DriverC("I", true, 9);
        DriverC drMaz2 = new DriverC("J", true, 10);
        DriverC drKamaz = new DriverC("K", false, 11);
        DriverB drVolvo = new DriverB("L", true, 12);

        InRacing[] inRacings = {lada, audi, bmw1, bmw2, mb, man1, man2, scania, maz1, maz2, kamaz, volvo};
//        Transport[] transports = {lada, audi, bmw1, bmw2, mb, man1, man2, scania, maz1, maz2, kamaz, volvo};
        Driver[] drivers = {drLada, drAudi, drBmw1, drBmw2, drMb, drMan1, drMan2, drScania, drMaz1, drMaz2, drKamaz, drVolvo};

        for (int i = 0; i < inRacings.length; i++) {
            try {
                inRacings[i].appointDriver(drivers[i]);
            } catch (IllegalDriverException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        for (InRacing inRacing:inRacings) {
            inRacing.printInfo();
        }
    }
}