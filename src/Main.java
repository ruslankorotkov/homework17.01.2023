public class Main {
    public static void main(String[] args) {
//        DriverB ivan = new DriverB(" Иван ", true, " 6 лет ");
        DriverB vova = new DriverB(" Вова ", true, " 32 лет ");
//        DriverC zuric = new DriverC(" Зурик ", true, " 3 лет ");
//        DriverD nik = new DriverD(" Николай ", true, " 6 лет ");
        DriverC oleg = new DriverC(" Олег ", true, " 5 лет ");
        DriverD boris = new DriverD(" Борис ", true, " 7 лет ");
//        Car lada = new Car("Lada", "Granta", 1.7, ivan, Car.BodyType.BODY_S);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, vova, Car.BodyType.BODY_V);
//        Car bmv = new Car("BMW", "Z8", 3.0, zuric, Car.BodyType.BODY_K);
//        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, nik, Car.BodyType.BODY_U);
//        Bus hyundai = new Bus("Hyundai", "Avante", 1.6, boris, 61);
//        Bus ural = new Bus("Урал", "Next", 20.22, boris, 24);
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20, boris, 23);
//        Bus мercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21, boris, 120);
        Truck kamaz = new Truck("Камаз", "компас", 12.45, oleg, 2.5);
//        Truck zil = new Truck("Зил", "43", 24.12, oleg, 23.5);
//        Truck man = new Truck("Man", "TGL", 12.45, oleg, 13.3);
        Mechanic foma = new Mechanic("Фома Кузькин", "Болты и Гайки", Mechanic.AccessToWork.MECH_B);
        Mechanic luka = new Mechanic("Лука Вижинков", "Тяп Ляп сервис", Mechanic.AccessToWork.MECH_C);
        Mechanic petr = new Mechanic("Пётр Пучёк", "АвтоРемонт", Mechanic.AccessToWork.MECH_D);
        Mechanic misha = new Mechanic("Миша Губайдулин", "Ездит как НАДО", Mechanic.AccessToWork.MECH_B_C_D);
//        System.out.println(" водитель " + boris.getName() + " управляет автомобилем " + мercedes + " и будет участвовать в заезде. ");
//        System.out.println(" водитель " + oleg.getName() + " управляет автомобилем " + kamaz + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + ivan.getName() + " управляет автомобилем " + lada + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + vova.getName() + " управляет автомобилем " + audi + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + zuric.getName() + " управляет автомобилем " + bmv + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + nik.getName() + " управляет автомобилем " + kia + " и будет участвовать в заезде. ");
        paz.printInfo();
        paz.printType();
        audi.printInfo();
        audi.printType();
        kamaz.printInfo();
        kamaz.printType();
        getDiagnosed(audi, kamaz, paz);
        System.out.println(foma);
    }

    public static void getDiagnosed(Transport... auto) {
        for (Transport element : auto) {
            try {
                element.getDiagnosed();
            } catch (RuntimeException e) {
                System.out.println(" Произошла ошибка " + element);
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Проверка завершена");
            }
        }
    }
}


