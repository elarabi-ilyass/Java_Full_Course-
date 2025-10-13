
public class Main {

    /*
         *Variable = a reusable container for a value
         *Primitive = simple value stored directly in memory (stack)
         *Reference = memory adress (stack) that points to the heap

         Primitive  Vs  Reference
          Int            String
          Double         Array
          Char           Object
          Boolean

    */

    public static void main(String[] args) {
        int myAge = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        double myDoubleNum = 5.99d;

        // Déclaration float - doit avoir le suffixe 'f' ou 'F'
        float prix = 19.99f;
        float temperature = -5.5F;

        // Déclaration double - suffixe 'd' optionnel
        double salaire = 2500.50;
        double distance = 123456.789d; // 'd' explicite

        if(salaire<=distance ){
            System.out.println("donc je dois augmenter le salaire " );
        }
        else{
            System.out.println("donc je dois moinder la distance ");
        }
        // CORRECTIONS des affichages :
        System.out.println("myDoubleNum = " + myDoubleNum + "\n");
        System.out.println("myAge = " + myAge + " | myFloatNum = " + myFloatNum +
                " | myLetter = " + myLetter + " | myText = " + myText + "\n");

        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;

        System.out.println(MINUTES_PER_HOUR);
        System.out.println(BIRTHYEAR);
    }
}