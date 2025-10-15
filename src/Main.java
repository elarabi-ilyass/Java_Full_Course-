import java.util.Scanner;
import java.util.InputMismatchException; // Import ajouté

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name="Spongebob";
        char firstLetter = name.charAt(0);
        int age=67;
        double result=88.9;
        boolean isEmployed=true;

        double salar1=9.99;
        double salar2=100.15;
        double salar3=-45.01;


        try {
            System.out.printf(" Enter the  first number %s\n ",name);
            System.out.printf(" Your name   is first letter of %c\n ",firstLetter);
            System.out.printf(" You are %d years  old\n ",age);
            System.out.printf(" You are %f inches  tall\n ",result);

            System.out.printf(" %s is %d   years old \n",name,age);

//            System.out.printf("%.1f\n",salar1);
//            System.out.printf("%.1f\n",salar2);
//            System.out.printf("%.1f\n",salar3); number one display how much number before comma
//            System.out.printf("%(.1f\n",salar1);
//            System.out.printf("%(.1f\n",salar2);
//            System.out.printf("%(.1f\n",salar3); if negative ()




        } catch (InputMismatchException e) { // Exception corrigée
            System.out.println(" Error: Please enter valid numbers!");
        } finally {
            sc.close();
        }
    }
}