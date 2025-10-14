import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0; // Correction: "height" au lieu de "hieght"
        double area = 0;

        try {
            System.out.print("Enter the width: ");
            width = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the hieght: ");
            height = Double.parseDouble(scanner.nextLine());

            area = (width * height);

            System.out.println("--- Summary ---");
            System.out.println("the width is :"+width);
            System.out.println("the hieght is :"+height);
            System.out.println("the area is :"+area+"cm^2");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        } finally {
            scanner.close();
        }
    }


}