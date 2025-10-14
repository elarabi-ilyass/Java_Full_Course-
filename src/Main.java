import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Entrez votre âge : ");
            int age = sc.nextInt();

            // Condition if-else
            if (age >= 18) {
                System.out.println("Vous êtes majeur");
            } else {
                System.out.println("Vous êtes mineur");
            }

        } catch (NumberFormatException e) {
            System.out.println(" Error: Please enter valid numbers!");
        } finally {
            sc.close();
        }
    }
}