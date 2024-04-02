package employe;

import java.util.Scanner;
public interface IEmployee {
    public abstract String getName();
    public abstract int calculateSalary();
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cua nhan vien!");
        System.out.print("Ten nhan vien: ");
        String name = scanner.nextLine();
        System.out.print("Luong/gio: ");
        int paymentPerHour = scanner.nextInt();
        int employeType;
        do {
            System.out.print("Chon loai nhan vien (1: Part-time, 2: Full-time): ");
            employeType = scanner.nextInt();
            if (employeType != 1 && employeType != 2) {
                System.out.println("Loi: vui long chon 1 hoac 2!");
            }
        } while (employeType != 1 && employeType != 2);
        Employe employe;
        if (employeType == 1) {
            System.out.println("So gio lam viec: ");
            int workingHours = scanner.nextInt();
            employe = new PartTimeEmployee(name, paymentPerHour, workingHours);
        } else {
            employe = new FullTimeEployee(name, paymentPerHour);
        }
        System.out.println("Thong tin nhan vien!");
        System.out.println("Ten nhan vien: " + employe.getName());
        System.out.println("Luong theo gio: " + employe.getPaymentPerHour());
        System.out.println("Luong thang: " + employe.calculateSalary());
        scanner.close();
    }
}