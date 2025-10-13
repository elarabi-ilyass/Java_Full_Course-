import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of students: ");
            int n = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter teacher name: ");
            String name = scanner.nextLine();

            System.out.print("What is GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            System.out.print("Are you student: ");
            boolean isStudent = scanner.nextBoolean();

            System.out.println("\n--- Summary ---");
            System.out.println("Number of students: " + n);
            System.out.println("Teacher name: " + name);
            System.out.println("GPA: " + gpa);

            if(isStudent){
                System.out.println("You are a student");
            }
            else{
                System.out.println("You are employe");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        } finally {
            scanner.close();
        }
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("Enter the number of students: ");
//            int n = scanner.nextInt();
//
//            scanner.nextLine();
//
//            System.out.print("Enter teacher name: ");
//            String name = scanner.nextLine();
//
//
//            System.out.print("What is GPA: ");
//            double gpa = scanner.nextDouble();
//
//            scanner.nextLine();
//
//            System.out.print("Are you student: ");
//            boolean isStudent = scanner.nextBoolean();
//
//            scanner.nextLine();
//
//            System.out.println("\n--- Summary ---");
//            System.out.println("Number of students: " + n);
//            System.out.println("Teacher name: " + name);
//            System.out.println("GPA: " + gpa);
//            System.out.println("Student: " + isStudent);
//
//        } catch (NumberFormatException e) {
//            System.out.println("Error: Please enter valid numbers!");
//        } finally {
//            scanner.close();
//        }
//    }
}