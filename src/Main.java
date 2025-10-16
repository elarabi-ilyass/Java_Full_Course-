import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double numConvert;
        int choose;
        int weight;
        double total;

      try{
          System.out.println("Please enter the number to convert it if you want: ");
          System.out.println("1 : Convert lbs to kg");
          System.out.println("2 : Convert kg to lbs");
          choose = sc.nextInt();
          switch(choose){
              case 1:
                  System.out.println("Please enter weight value: ");
                  weight=sc.nextInt();
                  total= weight* 0.453592;
                  System.out.printf("The new weight is: %.2f%n  ",total);
                  break;

              case 2:
                  System.out.println("Please enter weight value: ");
                  weight=sc.nextInt();
                  total= weight*2.20462262;
                  System.out.printf("The new number is: %.2f%n  ",total);
                  break;

                default:
                    System.out.println("Invalid choice");
          }

      }
      catch(Exception e){
          System.out.println(e);
      }
      finally {
            sc.close();
      }




    }
}
















