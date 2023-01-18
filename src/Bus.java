

public class Bus extends Transport<DriverD> {
    public enum PassengerCapacity {
        EXTRA_SMALL("особо малая (до 10 )"),
        SMALL("малая (до 25)"),
        AVERAGE("средняя (40–50)"),
        BIG("большая (60–80)"),
        ESPECIALLY_LARGE("особо большая (100–120 )");

        public String getPlaces() {
            return places;
        }

        PassengerCapacity(String places) {
            this.places = places;
        }

        private final String places;


    }

    private PassengerCapacity places;


    public Bus(String brand, String model, double engineVolume, DriverD driver, Integer places) {
        super(brand, model, engineVolume, driver);
        if (places <= 10) {
            this.places = PassengerCapacity.EXTRA_SMALL;
        } else if (places <= 25) {
            this.places = PassengerCapacity.SMALL;
        } else if (places >= 40 && places <= 50) {
            this.places = PassengerCapacity.AVERAGE;
        } else if (places >= 60 && places <= 80) {
            this.places = PassengerCapacity.BIG;
        } else if (places >= 100 && places <= 120) {
            this.places = PassengerCapacity.ESPECIALLY_LARGE;
        }
    }


    @Override

    public void startMoving() {
        System.out.println(" Автобус марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ. ");
    }

    @Override
    public void stopMoving() {
        System.out.println(" Автобус марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ. ");
    }

    @Override
    public void printType() {
        System.out.println("Данные по транспортному средству АВТОБУС " + super.toString() + " вместимость " + places + " .");
    }


    @Override
    public void getDiagnosed() {
        throw new RuntimeException(" Автобусы диагностику проходить не могут ");
    }

    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у автобуса. " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у автобуса. " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у автобуса. " + getBrand());

    }

    public PassengerCapacity getPlaces() {
        return places;
    }


    @Override
    public String toString() {
        return " АВТОБУС " + super.toString() + " Вместимость " + places + " мест ";
    }
}
