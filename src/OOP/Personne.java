package OOP;

public class Personne {
    String nom;          // variable d'instance
    static int population = 0; // variable static

    public Personne(String nom) {
        this.nom = nom;
        population++;  // À chaque nouvelle personne, population augmente
    }

    // méthode d'instance
    public void sePresenter() {
        System.out.println("Je m'appelle " + this.nom);
    }

    // méthode static
    public static void infoPopulation() {
        System.out.println("Il y a " + population + " personnes");
    }
}







