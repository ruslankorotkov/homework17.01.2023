import java.awt.*;
import java.util.LinkedList;

public abstract class Driver {
    private String name;
    public boolean driverLicense;
    private String experience;
    private LinkedList<Driver> driversList;


    public Driver(String name, boolean driverLicense, String experience) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;
        }
        if (driverLicense == true) {
            this.driverLicense = driverLicense;
        } else if (driverLicense == false) {
            throw new RuntimeException(" Необходимо указать тип прав! .");
        }
        if (experience == null || experience.isEmpty() || experience.isBlank()) {
            this.experience = "default";
        } else {
            this.experience = experience;
        }
        driversList = new LinkedList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void refuel();

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public LinkedList<Driver> getDriversList() {
        return driversList;
    }

    public void setDriversList(LinkedList<Driver> driversList) {
        this.driversList = driversList;
    }

    @Override
    public String toString() {
        return " ВОДИТЕЛЬ:" +
                " ИМЯ: " + name +
                ", ПРАВА КАТЕГОРИИ:" + driverLicense +
                ", СТАЖ:" + experience;
    }
}



