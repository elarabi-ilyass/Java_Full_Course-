public class TypesPrimitifs {
    public static void main(String[] args) {

        // 1. ENTIERS
        byte petitNombre = 100;           // -128 à 127
        short nombreCourt = 32000;        // -32,768 à 32,767
        int nombreEntier = 2147483647;    // ~ -2 milliards à +2 milliards
        long grandNombre = 9223372036854775807L; // Très grand, notez le 'L'

        // 2. RÉELS (nombres à virgule)
        float decimalSimple = 3.14f;      // Notez le 'f' pour float
        double decimalDouble = 3.14159265359; // Plus précis

        // 3. CARACTÈRE
        char caractere = 'A';             // Un seul caractère
        char caractereUnicode = '\u0041'; // 'A' en Unicode

        // 4. BOOLÉEN
        boolean estVrai = true;
        boolean estFaux = false;

        // Affichage des valeurs
        System.out.println("byte: " + petitNombre);
        System.out.println("int: " + nombreEntier);
        System.out.println("double: " + decimalDouble);
        System.out.println("char: " + caractere);
        System.out.println("boolean: " + estVrai);
        System.out.println("long: " +  grandNombre);
        System.out.println("short: " + nombreCourt);
    }
}