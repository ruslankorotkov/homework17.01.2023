public class DriverD extends Driver {
    public DriverD(String name, boolean driverLicense, String experience) {
        super(name, driverLicense, experience);
        if (driverLicense == true) {
            this.driverLicense = driverLicense;
        } else if (driverLicense == false) {
            throw new RuntimeException(" Необходимо указать тип прав! .");
        }
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " НАЧАЛ ДВИЖЕНИЕ ");

    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории D " + getName() + " ОСТАНОВИЛСЯ ");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getName() + " ЗАПРАВИЛ АВТО ");
    }
}
