public class ExempleCast {
    public static void main(String[] args) {

        // CAST IMPLICITE (Élargissement - Widening)
        int nombreInt = 100;
        double nombreDouble = nombreInt; // Auto-cast int → double
        System.out.println("Int vers Double: " + nombreDouble); // 100.0

        // CAST EXPLICITE (Rétrécissement - Narrowing)
        double prix = 19.99;
        int prixEntier = (int) prix; // Cast explicite double → int
        System.out.println("Double vers Int: " + prixEntier); // 19 (troncature)

        float temperature = 23.7f;
        int tempArrondie = (int) temperature;
        System.out.println("Float vers Int: " + tempArrondie); // 23
    }
}
