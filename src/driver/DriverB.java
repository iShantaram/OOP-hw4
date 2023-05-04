package driver;

public class DriverB extends Driver{
    private final String category = "B";

    public DriverB(String name, boolean isDriverLicense, int experience) {
        super(name, isDriverLicense, experience);
    }

    public String getCategory() {
        return category;
    }
}
