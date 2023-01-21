
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Mechanic<A extends Transport> {
    private String nameMechanic;
    private String companyWork;
    public Mechanic(String nameMechanic, String companyWork, String accessToWork) {
        this.nameMechanic = nameMechanic;
        this.companyWork = companyWork;
        this.accessToWork = accessToWork;
    }

    private String accessToWork;
    private A transport;

    private Queue<A> queue = new ArrayDeque<>(7);


    public void carryOutMaintenance(A transport) {
        queue.offer(transport);
        System.out.println(" Провести техобслуживание. " + transport.getBrand() + " Механик " + getNameMechanic()+ " Осматривает ");
    }

    public void fixTheCar() {
        A transport = queue.poll();
        if (transport != null) {
            System.out.println(" Починить машину. " + transport.getBrand()+" Механик "+ getNameMechanic()+ " Ремонтирует ");
            fixTheCar();
        } else {
            System.out.println(" Очередь пуста ");
        }
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
        return "Mechanic{" +
                "nameMechanic='" + nameMechanic + '\'' +
                ", companyWork='" + companyWork + '\'' +
                ", accessToWork='" + accessToWork + '\'' +
                ", transport=" + transport +
                '}';
    }
}
