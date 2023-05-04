package driver;

public class DriverD extends Driver{
    private final String category = "D";

    public DriverD(String name, boolean isDriverLicense, int experience) {
        super(name, isDriverLicense, experience);
    }

    public String getCategory() {
        return category;
    }
}
