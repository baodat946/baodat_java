package employe;

public class PartTimeEmployee extends Employe implements IEmployee{
    int workingHour;
    public PartTimeEmployee(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour*workingHour;
    }
}