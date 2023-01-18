public class DriverC extends Driver {
    public DriverC(String name, boolean driverLicense, String experience) {
        super(name, driverLicense, experience);
        if (driverLicense == true) {
            this.driverLicense = driverLicense;
        } else if (driverLicense == false) {
            throw new RuntimeException(" Необходимо указать тип прав! .");
        }
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " НАЧАЛ ДВИЖЕНИЕ ");

    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории C " + getName() + " ОСТАНОВИЛСЯ ");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории C " + getName() + " ЗАПРАВИЛ АВТО ");
    }
}
