
public class Car extends Transport<DriverB> {

    public enum BodyType {
        BODY_S("Седан"),
        BODY_H("Хетчбек"),
        BODY_C("Купе"),
        BODY_U("Универсал"),
        BODY_V("Внедорожник"),
        BODY_K("Кроссовер"),
        BODY_P("Пикап"),
        BODY_F("Фургон"),
        BODY_M("Минивэн");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }
    }

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;

    }

    @Override
    public void startMoving() {
        System.out.println(" Легковой автомобиль марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ. ");

    }

    @Override
    public void stopMoving() {
        System.out.println(" Легковой автомобиль марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ. ");

    }

    @Override
    public void printType() {
        System.out.println("Данные по транспортному средству ЛЕГКОВОЙ АВТОМОБИЛЬ " + super.toString() + " тип кузова " + bodyType.getBodyType() + " .");
    }

    @Override
    public void getDiagnosed() {
        System.out.println(" Пройти диагностику " + getBrand());
    }


    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у легковой машины. " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у легковой машины. " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у легковой машины. " + getBrand());

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return " ЛЕГКОВОЙ АВТОМОБИЛЬ "
                + super.toString() +
                " тип кузова "
                + bodyType.getBodyType();
    }
}




