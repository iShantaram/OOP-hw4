package driver;

public class DriverD extends Driver{

    public DriverD(String name, boolean isDriverLicense, int experience) {
        super(name, isDriverLicense, experience);
        String category = "D";
        setCategory(category);
    }

}
