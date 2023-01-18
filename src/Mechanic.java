public class Mechanic {
    public enum AccessToWork{
        MECH_B(" работает только с легковыми авто. "),
        MECH_C(" работает только с грузовыми авто. "),
        MECH_D(" работает только с автобусами. "),
        MECH_B_C_D(" работает со всеми автомобилями. ");

        public String getAccessToWork() {
            return accessToWork;
        }

        AccessToWork(String accessToWork) {
            this.accessToWork = accessToWork;
        }

        private final String accessToWork;







    }
    private String nameMechanic;
    private String companyWork;
    private AccessToWork accessToWork;

    public Mechanic(String nameMechanic, String companyWork, AccessToWork accessToWork) {
        this.nameMechanic = nameMechanic;
        this.companyWork = companyWork;
        this.accessToWork = accessToWork;

    }
    public void carryOutMaintenance(){
        System.out.println(" Провести техобслуживание ");
    }
    public void fixTheCar(){
        System.out.println(" Починить машину ");
    }

    @Override
    public String toString() {
        return " Механик -" +
                " имя и фамилия: " + nameMechanic +
                ", компания, в которой он работает:" + companyWork +
                ", допуск: " + accessToWork.accessToWork ;
    }
}
