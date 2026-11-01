import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            double sal = sc.nextDouble();
            double yr = sc.nextDouble();
            if (sal <= 0 || yr < 0) {
                i--;
                continue;
            }
            salary[i] = sal;
            service[i] = yr;
        }
        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}
