import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Arithmitic

        int x=10;
        int y=20;
        float z;

        try {
//            z=x + y;
//            z=x % y;
//            x+=y;
//            x++;
//            x=y % x;
            double result = 3+7.4 *(73*6-90)/8+2-4%45;
            System.out.println(result);
//            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        } finally {
            System.out.println("All right");
        }
    }


}