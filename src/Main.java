public class Main {
    public static void main(String[] args) {
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
        Car lada = new Car("Lada", "Granta", 1.7, ivan, Car.BodyType.BODY_S);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, vova, Car.BodyType.BODY_V);
        Car bmv = new Car("BMW", "Z8", 3.0, shuric, Car.BodyType.BODY_K);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, nikita, Car.BodyType.BODY_U);
        Bus hyundai = new Bus("Hyundai", "Avante", 1.6, nik, 61);
        Bus ural = new Bus("Урал", "Next", 20.22, boris, 24);
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20, artur, 23);
        Bus mercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21, ilia, 120);
        Truck kamaz = new Truck("Камаз", "компас", 12.45, zuric, 2.5);
        Truck zil = new Truck("Зил", "43", 24.12, egor, 23.5);
        Truck man = new Truck("Man", "TGL", 12.45, oleg, 13.3);
        Mechanic foma = new Mechanic("Фома Кузькин", "Болты и Гайки", " ремонтирует легковые авто ", lada);
        Mechanic luka = new Mechanic("Лука Вижинков", "Тяп Ляп сервис", " ремонтирует грузовые авто ", kamaz);
        Mechanic petr = new Mechanic("Пётр Пучёк", "АвтоРемонт", " ремонтирует автобусы ", mercedes);
        Mechanic misha = new Mechanic("Миша Губайдулин", "Ездит как НАДО", " ремонтирует все виды автомобилей ", mercedes);

//        System.out.println(" водитель " + boris.getName() + " управляет автомобилем " + mercedes + " и будет участвовать в заезде. ");
//        System.out.println(" водитель " + oleg.getName() + " управляет автомобилем " + kamaz + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + ivan.getName() + " управляет автомобилем " + lada + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + vova.getName() + " управляет автомобилем " + audi + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + zuric.getName() + " управляет автомобилем " + bmv + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + nik.getName() + " управляет автомобилем " + kia + " и будет участвовать в заезде. ");
//        paz.printInfo();
//        paz.printType();
//        audi.printInfo();
//        audi.printType();
//        kamaz.printInfo();
//        kamaz.printType();
        autoDiagnosed(audi, kamaz, paz,ural,kia);
        rightsCheckDrivers(vova, oleg, oleg, nikita, boris, ilia);
        getMechList(luka, foma, petr, misha);
        getDriversList(ivan, shuric, egor, nikita, artur, ilia, boris, nik, oleg, vova, zuric);
        getTransportsList(lada, audi, bmv, kia, hyundai, ural, paz, mercedes, kamaz, zil, man);
        System.out.println(" " + mercedes.getBrand() + "  " + mercedes.getDriver().getName() +
                " у него есть Механик: " + petr.getNameMechanic() + " он " + petr.getAccessToWork() +
                " и ему помогает Механик: " + misha.getNameMechanic() + " он " + misha.getAccessToWork());
        System.out.println(foma);
        System.out.println(luka);
        System.out.println(petr);
        System.out.println(misha);
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
        System.out.println(" Прохождение машинами диагностики ");
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

    public static void rightsCheckDrivers(Driver... driver) {
        int count = 0;
        System.out.println(" Прохождение проверки прав ");
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



