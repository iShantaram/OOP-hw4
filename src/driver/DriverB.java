package driver;

public class DriverB extends Driver{

    public DriverB(String name, boolean isDriverLicense, int experience) {
        super(name, isDriverLicense, experience);
        String category = "B";
        setCategory(category);
    }

}
