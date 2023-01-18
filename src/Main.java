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
        DriverD boris = new DriverD(" Борис ", true, " 7 лет ");
        DriverD ilia = new DriverD(" Илья ", true, " 11 лет ");
        DriverD artur = new DriverD(" Артур ", true, " 5 лет ");
        Mechanic foma = new Mechanic("Фома Кузькин", "Болты и Гайки", Mechanic.AccessToWork.MECH_B);
        Mechanic luka = new Mechanic("Лука Вижинков", "Тяп Ляп сервис", Mechanic.AccessToWork.MECH_C);
        Mechanic petr = new Mechanic("Пётр Пучёк", "АвтоРемонт", Mechanic.AccessToWork.MECH_D);
        Mechanic misha = new Mechanic("Миша Губайдулин", "Ездит как НАДО", Mechanic.AccessToWork.MECH_B_C_D);
        Car lada = new Car("Lada", "Granta", 1.7, ivan, Car.BodyType.BODY_S, foma);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, vova, Car.BodyType.BODY_V, foma);
        Car bmv = new Car("BMW", "Z8", 3.0, shuric, Car.BodyType.BODY_K, foma);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, nikita, Car.BodyType.BODY_U, misha);
        Bus hyundai = new Bus("Hyundai", "Avante", 1.6, nik, 61, petr);
        Bus ural = new Bus("Урал", "Next", 20.22, boris, 24, petr);
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20, artur, 23, petr);
        Bus mercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21, ilia, 120, misha);
        Truck kamaz = new Truck("Камаз", "компас", 12.45, zuric, 2.5, luka);
        Truck zil = new Truck("Зил", "43", 24.12, egor, 23.5, luka);
        Truck man = new Truck("Man", "TGL", 12.45, oleg, 13.3, misha);

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
//        getDiagnosed(audi, kamaz, paz);
//        System.out.println(foma);
//        luka.getMechanicsList().add(foma);
//        luka.getMechanicsList().add(petr);
//        luka.getMechanicsList().add(misha);
//        luka.getMechanicsList().add(luka);
//        System.out.println(luka.getMechanicsList());
        getMechanicsList(luka, foma, petr, misha);
        getDriversList(ivan, shuric, egor, nikita, artur, ilia, boris, nik, oleg, vova, zuric);
        getTransportsList(lada, audi, bmv, kia, hyundai, ural, paz, mercedes, kamaz, zil, man);
        System.out.println(" Автомобиль: " + audi.getBrand() + " Водитель: " + audi.getDriver().getName() +
                " у него есть Механик: " + foma.getNameMechanic() + " он " + foma.getAccessToWork().getAccessToWork() +
                " и ему помогает Механик: " + misha.getNameMechanic() + " он " + misha.getAccessToWork().getAccessToWork());
    }

    public static void getMechanicsList(Mechanic... mechanics) {
        for (Mechanic element : mechanics) {
            element.getNameMechanic();
            System.out.println(" Механик из списка mechanicsList : " + element.getNameMechanic());
        }
    }

    public static void getDriversList(Driver... drivers) {
        for (Driver element : drivers) {
            element.getName();
            System.out.println(" Водители из списка driversList : " + element.getName());
        }
    }

    public static void getTransportsList(Transport... transports) {
        for (Transport element : transports) {
            element.getClass();
            element.getBrand();
            System.out.println(" Автомобили из списка transportsList : " + element.getClass() + " модель " + element.getBrand());
        }
    }

//    public static void getDiagnosed(Transport... auto) {
//        for (Transport element : auto) {
//            try {
//                element.getDiagnosed();
//            } catch (RuntimeException e) {
//                System.out.println(" Произошла ошибка " + element);
//                System.out.println(e.getMessage());
//            } finally {
//                System.out.println("/Проверка завершена/");
//            }
//        }
//    }
}


