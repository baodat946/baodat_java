package employe;

public class FullTimeEployee extends Employe implements IEmployee{
    public FullTimeEployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * 100;
    }
}
