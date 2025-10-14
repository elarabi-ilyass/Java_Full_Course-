import java.util.Scanner;
import java.util.InputMismatchException; // Import ajouté

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double z;
        double result;

        try {
            System.out.print(" Enter the first number: ");
            a = sc.nextDouble();
            System.out.print(" Enter the second number: ");
            b = sc.nextDouble();

            z = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//            result=Math.round(z);
//            result=Math.abs(z);
//            result=Math.ceil(z);
//            result=Math.floor(z);
//            result=Math.max(z,122);
            result=Math.min(z,12);
              System.out.println(Math.PI);
              System.out.println(Math.E);

            System.out.println("Result: " + z); // println pour meilleure lisibilité
            System.out.println("Result: " + result); // println pour meilleure lisibilité

        } catch (InputMismatchException e) { // Exception corrigée
            System.out.println(" Error: Please enter valid numbers!");
        } finally {
            sc.close();
        }
    }
}