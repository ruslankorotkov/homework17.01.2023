import java.util.ArrayList;

public class Mechanic <Transport> {
    private String nameMechanic;
    private String companyWork;
    private String accessToWork;
    public Mechanic(String nameMechanic, String companyWork, String accessToWork) {
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
        if (accessToWork != null && !accessToWork.isEmpty() && !accessToWork.isBlank()) {
            this.accessToWork = accessToWork;
        } else {
            this.accessToWork = "default";
        }
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

    public String getAccessToWork() {
        return accessToWork;
    }

    public void setAccessToWork(String accessToWork) {
        this.accessToWork = accessToWork;
    }
    @Override
    public String toString() {
        return " Механик -" +
                " имя и фамилия: " + nameMechanic +
                ", компания, в которой он работает:" + companyWork +
                ", допуск: " + accessToWork;
    }
}
