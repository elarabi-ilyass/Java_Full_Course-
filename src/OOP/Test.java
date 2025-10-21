package OOP;

public class Test {

    public static void main(String[] args) {
        System.out.println("=== DÉMONSTRATION INSTANCE vs STATIC ===");

        // Appel d'une méthode STATIC (sans objet)
        Personne.infoPopulation(); // "Il y a 0 personnes"

        // Création d'objets (instances)
        Personne p1 = new Personne("Alice");
        Personne p2 = new Personne("Bob");
        Personne p3 = new Personne("Charlie");

        System.out.println("\n=== PRÉSENTATIONS ===");
        // Appel de méthodes D'INSTANCE (avec objet)
        p1.sePresenter(); // "Je m'appelle Alice"
        p2.sePresenter(); // "Je m'appelle Bob"
        p3.sePresenter(); // "Je m'appelle Charlie"

        System.out.println("\n=== POPULATION ACTUELLE ===");
        // La méthode static voit tous les objets créés
        Personne.infoPopulation(); // "Il y a 3 personnes"

        // Test supplémentaire pour voir que la variable static est partagée
        System.out.println("\n=== ACCÈS DIRECT À LA VARIABLE STATIC ===");
        System.out.println("Population directement: " + Personne.population);
    }
}