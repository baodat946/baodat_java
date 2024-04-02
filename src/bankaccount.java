import java.util.Scanner;

public class bankaccount {
    String owner;
    double balance;

    public bankaccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public bankaccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Rut tien thanh cong : " + amount);
        } else {
            System.out.println("Tai khoan khong du so du");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ten chu tai khoan: ");
        String owner = scanner.nextLine();

        System.out.print("Nhap so du :");
        double initialBalance = scanner.nextDouble();

        bankaccount account1 = new bankaccount(owner, initialBalance);
        System.out.println("Chu tai khoan: " + account1.owner);
        System.out.println("So du ban dau: " + account1.balance);

        System.out.print("Nhap tien muon nap: ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);
        System.out.println("so du sau khi nap: " + account1.balance);

        System.out.print("Nhap so tien muon rut: ");
        double withdrawAmount = scanner.nextDouble();
        account1.withdraw(withdrawAmount);
        System.out.println("So du sau khi rut: " + account1.balance);

        scanner.close();
    }
}