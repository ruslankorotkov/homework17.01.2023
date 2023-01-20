public class Main {
    public static void main(String[] args) throws CantDriveException {
        DriverB ivan = new DriverB(" Иван ", true, " 6 лет ");
        DriverB vova = new DriverB(" Вова ", true, " 32 лет ");
        DriverB shuric = new DriverB(" Шурик ", true, " 4 лет ");
        DriverB nikita = new DriverB(" Никита ", true, " 6 лет ");
        DriverC zuric = new DriverC(" Зурик ", true, " 3 лет ");
        DriverC egor = new DriverC(" Егор ", true, " 3 лет ");
        DriverC oleg = new DriverC(" Олег ", true, " 51 лет ");
        DriverD nik = new DriverD(" Николай ", true, " 8 лет ");
        DriverD boris = new DriverD(" Борис ", false, " 7 лет ");
        DriverD ilia = new DriverD(" Илья ", true, " 11 лет ");
        DriverD artur = new DriverD(" Артур ", true, " 5 лет ");
        Mechanic foma = new Mechanic("Фома Кузькин", "Болты и Гайки", " ремонтирует легковые авто ");
        Mechanic luka = new Mechanic("Лука Вижинков", "Тяп Ляп сервис", " ремонтирует грузовые авто ");
        Mechanic petr = new Mechanic("Пётр Пучёк", "АвтоРемонт", " ремонтирует автобусы ");
        Mechanic misha = new Mechanic("Миша Губайдулин", "Ездит как НАДО", " ремонтирует все виды автомобилей ");

        Car lada = new Car("Lada", "Granta", 1.7, ivan, foma, Car.BodyType.BODY_S);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, vova, foma, Car.BodyType.BODY_V);
        Car bmv = new Car("BMW", "Z8", 3.0, shuric, misha, Car.BodyType.BODY_K);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, nikita, foma, Car.BodyType.BODY_U);
        Bus hyundai = new Bus("Hyundai", "Avante", 1.6, nik, luka, 61);
        Bus ural = new Bus("Урал", "Next", 20.22, boris, luka, 24);
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20, artur, luka, 23);
        Bus mercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21, ilia, misha, 120);
        Truck kamaz = new Truck("Камаз", "компас", 12.45, zuric, petr, 2.5);
        Truck zil = new Truck("Зил", "43", 24.12, egor, misha, 23.5);
        Truck man = new Truck("Man", "TGL", 12.45, oleg, petr, 13.3);

        System.out.println(" водитель " + boris.getName() + " управляет автомобилем " + mercedes + " и будет участвовать в заезде. ");
        System.out.println(" водитель " + oleg.getName() + " управляет автомобилем " + kamaz + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + ivan.getName() + " управляет автомобилем " + lada + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + vova.getName() + " управляет автомобилем " + audi + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + zuric.getName() + " управляет автомобилем " + bmv + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + nik.getName() + " управляет автомобилем " + kia + " и будет участвовать в заезде. ");
//        paz.printInfo();
//        paz.printType();
//        audi.printInfo();
//        audi.printType();
//        kamaz.printInfo();
//        kamaz.printType();
        autoDiagnosed(audi, kamaz, paz);
        rightsCheckDrivers(vova, oleg, boris);
        getMechList(luka, foma, petr, misha);
        getDriversList(ivan, shuric, egor, nikita, artur, ilia, boris, nik, oleg, vova, zuric);
        getTransportsList(lada, audi, bmv, kia, hyundai, ural, paz, mercedes, kamaz, zil, man);
        System.out.println(" Автомобиль: " + audi.getBrand() + " Водитель: " + audi.getDriver().getName() +
                " у него есть Механик: " + foma.getNameMechanic() + " он " + foma.getAccessToWork() +
                " и ему помогает Механик: " + misha.getNameMechanic() + " он " + misha.getAccessToWork());
    }

    public static void getMechList(Mechanic... mechanics) {
        System.out.println(" Механики список ");
        for (Mechanic element : mechanics) {
            element.getNameMechanic();
            System.out.println(" Механик : " + element.getNameMechanic());
        }
    }

    public static void getDriversList(Driver... drivers) {
        System.out.println("Водители список ");
        for (Driver element : drivers) {
            element.getName();
            System.out.println(" Водитель : " + element.getName());
        }
    }

    public static void getTransportsList(Transport... transports) {
        System.out.println(" Автомобили список ");

        for (Transport element : transports) {
            element.getClass();
            element.getBrand();
            System.out.println(" Автомобиль : " + element.getClass() + " модель " + element.getBrand());
        }
    }

    public static void autoDiagnosed(Transport... auto) {
        for (Transport element : auto) {
            try {
                element.diagnosed();
            } catch (RuntimeException e) {
                System.out.println(" Произошла ошибка ");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Проверка завершена");
            }
        }
    }

    public static void rightsCheckDrivers(Driver... driver) throws CantDriveException {
        int count = 0;
        try {
            for (Driver element : driver) {
                element.isDriverLicense();
                count++;
            }
        } catch (CantDriveException e) {
            System.out.println(" Произошла ошибка водитель " + e.getDriver().getName() + "  не имеет прав.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка завершена. Из рассмотренных. " + count + " водителей имеют права.");
        }
    }
}


