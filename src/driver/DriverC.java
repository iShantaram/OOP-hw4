package driver;

public class DriverC extends Driver {
    private final String category = "C";

    public DriverC(String name, boolean isDriverLicense, int experience) {
        super(name, isDriverLicense, experience);
    }

    public String getCategory() {
        return category;
    }
}
