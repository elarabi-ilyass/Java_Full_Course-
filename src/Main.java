import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1 ;
        String noun1 ; // Correction: "height" au lieu de "hieght"
        String adjective2 ;
        String verb1 ; // Correction: "height" au lieu de "hieght"
        String adjective3 ;

        try {
            System.out.print("Enter an adjective (description): ");
            adjective1 = scanner.nextLine();

            System.out.print("Enter an noun (animal or person): ");
            noun1 = scanner.nextLine();

            System.out.print("Enter an adjective (description): ");
            adjective2 = scanner.nextLine();

            System.out.print("Enter an verb finish by ing: ");
            verb1 = scanner.nextLine();

            System.out.print("Enter the adjective: ");
            adjective3 = scanner.nextLine();




            System.out.println("--- Summary ---");
            System.out.println("Today i want to a :" +adjective1+ "zoo");
            System.out.println("In an exhibit, I saw a :"+noun1+".");
            System.out.println(noun1+"was :"+adjective2+"and"+verb1+"!");
            System.out.println("I was :"+ adjective3 +"!");


        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        } finally {
            scanner.close();
        }
    }


}