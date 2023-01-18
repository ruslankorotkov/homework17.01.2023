import java.io.File;

public class Truck extends Transport<DriverC> {
    public enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        public String getCapacity() {
            return capacity;
        }

        private final String capacity;

        LoadCapacity(String capacity) {
            this.capacity = capacity;
        }
    }

    private LoadCapacity capacity;


    public Truck(String brand, String model, double engineVolume, DriverC driver, double capacity) {
        super(brand, model, engineVolume, driver);
        if (capacity <= 3.5) {
            this.capacity = LoadCapacity.N1;
        } else if (capacity <= 12) {
            this.capacity = LoadCapacity.N2;
        } else if (capacity > 12) {
            this.capacity = LoadCapacity.N2;
        }
    }

    @Override
    public void startMoving() {
        System.out.println(" Грузовой  автомобиль марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ. ");

    }

    @Override
    public void stopMoving() {
        System.out.println(" Грузовой автомобиль марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ. ");

    }

    @Override
    public void printType() {
        System.out.println("Данные по транспортному средству ГРУЗОВИК " + super.toString() +
                " грузоподъёмность " + capacity.getCapacity() + " . ");
    }

    @Override
    public void getDiagnosed() {
        System.out.println(" Пройти диагностику " + getBrand());
    }

    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у грузовика. " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у грузовика. " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у грузовика." + getBrand());

    }

    @Override
    public String toString() {
        return " ГРУЗОВИК " + super.toString() +
                " грузоподъёмность " + capacity.getCapacity();
    }
}

