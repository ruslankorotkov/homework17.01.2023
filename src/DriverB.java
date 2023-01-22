public class DriverB extends Driver {
    public DriverB(String name, boolean driverLicense, String experience) {
        super(name, driverLicense, experience);
        this.driverLicense = driverLicense;
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории B " + getName() + " НАЧАЛ ДВИЖЕНИЕ ");

    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории B " + getName() + " ОСТАНОВИЛСЯ ");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории B " + getName() + " ЗАПРАВИЛ АВТО ");
    }
}

