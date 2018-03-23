import java.util.Scanner;

public class BankInterest {
    public static double calculateInterest(double loans, double interestRate, double range) {
        return loans * ((interestRate + range) / 12);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter loans ($): ");
        double loans = input.nextDouble();
        System.out.print("\nEnter interest rate (%): ");
        double interestRate = input.nextDouble() / 100;
        int months;
        do {
            System.out.print("\nEnter month: ");
            months = input.nextInt();
            if (months < 1) System.out.println("\n Entered wrong month.");
        } while (months < 1)
        System.out.print("\nEnter first year range (%): ");
        double range = input.nextDouble() / 100;
        double capital = loans / months;
        System.out.println("\nPrincipal pay in " + months + " months: " + capital);
        double firstYearInterest = calculateInterest(loans, interestRate, range);
        System.out.println("First year interest: " + firstYearInterest);
        if (months > 12) {
            System.out.print("Next year range (%): ");
            range = input.nextDouble() / 100;
            double nextYearInterest = calculateInterest(loans, interestRate, range);
            System.out.println("Next year interest: " + nextYearInterest);
            System.out.println("Monthly amount paid in the first year: " + (capital + firstYearInterest));
            System.out.println("Monthly amount paid in the next year: " + (capital + nextYearInterest));
        }
    }
}
