import java.util.Scanner;
import java.util.Random ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        try {
            int number ;
            boolean isHeads;
            number = rand.nextInt(77,7766)+1 ;
            isHeads=rand.nextBoolean() ;

            if(isHeads){
                System.out.println("is true");
            }
            else{
                System.out.println("is false");
            }
            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println(" Error: Please enter valid numbers!");
        } finally {
            sc.close();
        }
    }
}