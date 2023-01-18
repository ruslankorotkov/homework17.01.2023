import java.util.ArrayList;
public class Mechanic {


    public enum AccessToWork {
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
    private ArrayList<Mechanic> mechanicsList;


    public Mechanic(String nameMechanic, String companyWork, AccessToWork accessToWork) {
        if (nameMechanic != null && !nameMechanic.isEmpty() && !nameMechanic.isBlank()) {
            this.nameMechanic = nameMechanic;
        } else {
            this.nameMechanic = "default";
        }
        if (companyWork != null && !companyWork.isEmpty() && !companyWork.isBlank()) {
            this.companyWork = companyWork;
        } else {
            this.companyWork = "default";
        }
        this.accessToWork = accessToWork;
        mechanicsList = new ArrayList<>(12);

    }

    public void carryOutMaintenance() {
        System.out.println(" Провести техобслуживание. ");
    }

    public void fixTheCar() {
        System.out.println(" Починить машину. ");
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public String getCompanyWork() {
        return companyWork;
    }

    public void setCompanyWork(String companyWork) {
        this.companyWork = companyWork;
    }

    public AccessToWork getAccessToWork() {
        return accessToWork;
    }

    public void setAccessToWork(AccessToWork accessToWork) {
        this.accessToWork = accessToWork;
    }

    public ArrayList<Mechanic> getMechanicsList() {
        return mechanicsList;
    }

    public void setMechanicsList(ArrayList<Mechanic> mechanicsList) {
        this.mechanicsList = mechanicsList;
    }

    @Override
    public String toString() {
        return " Механик -" +
                " имя и фамилия: " + nameMechanic +
                ", компания, в которой он работает:" + companyWork +
                ", допуск: " + accessToWork.accessToWork;
    }
}
