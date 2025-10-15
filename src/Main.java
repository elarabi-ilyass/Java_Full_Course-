import java.util.Scanner;
import java.util.InputMismatchException; // Import ajouté

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double principale;
        double rate;
        double timesCompounded;
        double years;
        double amount;


        try {
            System.out.println(" Enter the principale amount");
            principale=sc.nextDouble();
            System.out.println(" Enter the rate");
            rate=sc.nextDouble() / 100;
            System.out.println(" Enter the timesCompounded");
            timesCompounded=sc.nextDouble();
            System.out.println(" Enter the years");
            years=sc.nextDouble();

            amount=principale * Math.pow(1+rate / timesCompounded,timesCompounded * years);

            System.out.println("Total amount is  " +amount);
        } catch (InputMismatchException e) { // Exception corrigée
            System.out.println(" Error: Please enter valid numbers!");
        } finally {
            sc.close();
        }
    }
}



















