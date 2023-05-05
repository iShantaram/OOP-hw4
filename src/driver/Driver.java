package driver;

public class Driver {
    private final String name;
    private boolean isDriverLicense;
    private int experience;

    private String category = null;

    public Driver(String name, boolean isDriverLicense, int experience) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("У водителя должно быть имя");
        } else {
            this.name = name;
        }
        this.isDriverLicense = isDriverLicense;
        if (experience < 0) {
            throw new IllegalArgumentException("Стаж не может быть отрицательным");
        } else {
            this.experience = experience;
        }
    }

    public String startMoving() {
        return name + " начал движение!";
    }

    public String stopMoving() {
        return name + " остановиля!";
    }

    public String toFillCar() {
        return name + " заправил автомобиль.";
    }

    @Override
    public String toString() {
        String str = "лет";
        switch (experience) {
            case (1):
                str = "год";
                break;
            case (2):
            case (3):
            case (4):
                str = "года";
        }
        return getClass() + " {" + "name='" + name + '\'' +
                ", права " + (isDriverLicense()?"есть":"отсутствуют") +
                ", стаж = " + experience + " " + str + " }";
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return isDriverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void increaseExperience() {
        this.experience++;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
