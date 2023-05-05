package driver;

public class DriverC extends Driver{

    public DriverC(String name, boolean isDriverLicense, int experience) {
        super(name, isDriverLicense, experience);
        String category = "C";
        setCategory(category);
    }

}
